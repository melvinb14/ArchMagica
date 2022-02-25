package com.melvinbur.archmagica.common.entity;

import java.util.Iterator;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.Util;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.IndirectEntityDamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ItemSupplier;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractThrownWeaponEntity extends AbstractArrow implements ItemSupplier {
    protected static final EntityDataAccessor<ItemStack> DATA_ITEM_STACK;
    protected static final EntityDataAccessor<Byte> DATA_LOYALTY_LEVEL;
    protected static final EntityDataAccessor<Float> DATA_DAMAGE_VALUE;
    protected float power;
    protected boolean dealtDamage;

    protected AbstractThrownWeaponEntity(EntityType<? extends AbstractArrow> entityType, Level level) {
        super(entityType, level);
    }

    protected AbstractThrownWeaponEntity(EntityType<? extends AbstractArrow> entityType, double x, double y, double z, Level level, ItemStack weaponStack) {
        super(entityType, x, y, z, level);
        this.setItem(weaponStack);
        double damage = 0.0D;

        AttributeModifier attributeModifier;
        for(Iterator var12 = weaponStack.getAttributeModifiers(EquipmentSlot.MAINHAND).get(Attributes.ATTACK_DAMAGE).iterator(); var12.hasNext(); damage += attributeModifier.getAmount()) {
            attributeModifier = (AttributeModifier)var12.next();
        }

        this.entityData.set(DATA_DAMAGE_VALUE, (float)damage);
    }

    protected AbstractThrownWeaponEntity(EntityType<? extends AbstractArrow> entityType, LivingEntity living, Level level, ItemStack weaponStack) {
        super(entityType, living, level);
        this.setItem(weaponStack);
        double damage = living.getAttributeValue(Attributes.ATTACK_DAMAGE);
        ItemStack mainHandItem = living.getMainHandItem();
        if (mainHandItem != weaponStack) {
            Iterator var8;
            AttributeModifier attributeModifier;
            if (!mainHandItem.isEmpty()) {
                for(var8 = mainHandItem.getAttributeModifiers(EquipmentSlot.MAINHAND).get(Attributes.ATTACK_DAMAGE).iterator(); var8.hasNext(); damage -= attributeModifier.getAmount()) {
                    attributeModifier = (AttributeModifier)var8.next();
                }
            }

            for(var8 = weaponStack.getAttributeModifiers(EquipmentSlot.MAINHAND).get(Attributes.ATTACK_DAMAGE).iterator(); var8.hasNext(); damage += attributeModifier.getAmount()) {
                attributeModifier = (AttributeModifier)var8.next();
            }
        }

        this.entityData.set(DATA_DAMAGE_VALUE, (float)damage);
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ITEM_STACK, ItemStack.EMPTY);
        this.entityData.define(DATA_LOYALTY_LEVEL, (byte)0);
        this.entityData.define(DATA_DAMAGE_VALUE, 1.0F);
    }

    public void tick() {
        if (this.inGroundTime > 4) {
            this.dealtDamage = true;
        }

        this.loyaltyTick();
        super.tick();
    }

    protected void loyaltyTick() {
        Entity entity = this.getOwner();
        double loyaltyLevel = (double)(Byte)this.entityData.get(DATA_LOYALTY_LEVEL);
        if (loyaltyLevel > 0.0D && (this.dealtDamage || this.isNoPhysics()) && entity != null) {
            if (entity.isAlive() && (!(entity instanceof ServerPlayer) || !entity.isSpectator())) {
                this.setNoPhysics(true);
                Vec3 deltaDifference = entity.getEyePosition().subtract(this.position());
                this.setPosRaw(this.getX(), this.getY() + deltaDifference.y * 0.015D * loyaltyLevel, this.getZ());
                if (this.level.isClientSide) {
                    this.yOld = this.getY();
                }

                this.setDeltaMovement(this.getDeltaMovement().scale(0.95D).add(deltaDifference.normalize().scale(0.05D * loyaltyLevel)));
            } else {
                if (!this.level.isClientSide && this.pickup == Pickup.ALLOWED) {
                    this.spawnAtLocation(this.getPickupItem(), 0.1F);
                }

                this.discard();
            }
        }

    }

    @Nullable
    @ParametersAreNonnullByDefault
    protected EntityHitResult findHitEntity(Vec3 pointOne, Vec3 pointTwo) {
        EntityHitResult result = super.findHitEntity(pointOne, pointTwo);
        if (result != null) {
            Entity var5 = result.getEntity();
            if (var5 instanceof LivingEntity) {
                LivingEntity living = (LivingEntity)var5;
                return living.hurtTime > 0 ? null : super.findHitEntity(pointOne, pointTwo);
            }
        }

        return super.findHitEntity(pointOne, pointTwo);
    }

    @ParametersAreNonnullByDefault
    protected void onHitEntity(EntityHitResult entityHitResult) {
        Entity victimEntity = entityHitResult.getEntity();
        Entity ownerEntity = this.getOwner();
        float damage = (Float)this.entityData.get(DATA_DAMAGE_VALUE);
        LivingEntity livingVictim;
        if (victimEntity instanceof LivingEntity) {
            livingVictim = (LivingEntity)victimEntity;
            damage += EnchantmentHelper.getDamageBonus(this.getItem(), livingVictim.getMobType());
        }

        if (this.isCritArrow()) {
            damage *= 1.5F;
        }

        damage *= this.getPower();
        this.dealtDamage = true;
        if (victimEntity.hurt((new IndirectEntityDamageSource(this.onHitDamageSource(), this, (Entity)(ownerEntity == null ? this : ownerEntity))).setProjectile(), damage)) {
            if (victimEntity.getType() == EntityType.ENDERMAN) {
                return;
            }

            if (victimEntity instanceof LivingEntity) {
                livingVictim = (LivingEntity)victimEntity;
                if (ownerEntity instanceof LivingEntity) {
                    LivingEntity livingOwner = (LivingEntity)ownerEntity;
                    EnchantmentHelper.doPostHurtEffects(livingVictim, livingOwner);
                    EnchantmentHelper.doPostDamageEffects(livingOwner, livingVictim);
                }

                this.doPostHurtEffects(livingVictim);
            }
        }

        this.setDeltaMovement(this.onHitDeltaMovement());
        this.playSound(this.onHitSoundEvent(), 1.0F, 1.0F);
    }

    protected abstract String onHitDamageSource();

    protected Vec3 onHitDeltaMovement() {
        return this.getDeltaMovement().multiply(-0.01D, -0.1D, -0.01D);
    }

    protected abstract SoundEvent onHitSoundEvent();

    @ParametersAreNonnullByDefault
    protected boolean tryPickup(Player player) {
        return super.tryPickup(player) || this.isNoPhysics() && this.ownedBy(player) && player.getInventory().add(this.getPickupItem());
    }

    @Nonnull
    protected abstract SoundEvent getDefaultHitGroundSoundEvent();

    @ParametersAreNonnullByDefault
    public void playerTouch(Player player) {
        if (this.ownedBy(player) || this.getOwner() == null) {
            super.playerTouch(player);
        }

    }

    protected abstract Item getDefaultItem();

    protected ItemStack getItemRaw() {
        return (ItemStack)this.entityData.get(DATA_ITEM_STACK);
    }

    @Nonnull
    protected ItemStack getPickupItem() {
        return this. getItem();
    }

    @ParametersAreNonnullByDefault
    public void setItem(ItemStack weaponStack) {
        this. entityData.set(DATA_LOYALTY_LEVEL, (byte)EnchantmentHelper.getLoyalty(weaponStack));
        if (!weaponStack.is(this.getDefaultItem()) || weaponStack.hasTag()) {
            this. entityData.set(DATA_ITEM_STACK, (ItemStack)Util.make(weaponStack.copy(), (itemStack) -> {
                itemStack.setCount(1);
            }));
        }

    }

    @Nonnull
    public ItemStack  getItem() {
        ItemStack itemstack = this.getItemRaw();
        return itemstack.isEmpty() ? new ItemStack(this.getDefaultItem()) : itemstack;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public float getPower() {
        return this.power;
    }

    @ParametersAreNonnullByDefault
    public void addAdditionalSaveData(CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        ItemStack weaponStack = this.getItemRaw();
        if (!weaponStack.isEmpty()) {
            compoundTag.put("WeaponStack", weaponStack.save(new CompoundTag()));
        }

        compoundTag.putBoolean("DealtDamage", this.dealtDamage);
        compoundTag.putFloat("ThrownWeaponDamage", (Float)this.entityData.get(DATA_DAMAGE_VALUE));
        compoundTag.putFloat("ThrownWeaponPower", this.getPower());
    }

    @ParametersAreNonnullByDefault
    public void readAdditionalSaveData(CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        this.setItem(ItemStack.of(compoundTag.getCompound("WeaponStack")));
        this.dealtDamage = compoundTag.getBoolean("DealtDamage");
        this.entityData.set(DATA_DAMAGE_VALUE, compoundTag.getFloat("ThrownWeaponDamage"));
        this.setPower(compoundTag.getFloat("ThrownWeaponPower"));
    }

    @NotNull
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    static {
        DATA_ITEM_STACK = SynchedEntityData.defineId(AbstractThrownWeaponEntity.class, EntityDataSerializers.ITEM_STACK);
        DATA_LOYALTY_LEVEL = SynchedEntityData.defineId(AbstractThrownWeaponEntity.class, EntityDataSerializers.BYTE);
        DATA_DAMAGE_VALUE = SynchedEntityData.defineId(AbstractThrownWeaponEntity.class, EntityDataSerializers.FLOAT);
    }
}
