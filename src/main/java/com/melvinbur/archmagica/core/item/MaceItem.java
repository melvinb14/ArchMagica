package com.melvinbur.archmagica.core.item;




import com.melvinbur.archmagica.core.sounds.SoundInit;
import com.mojang.math.Vector3f;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;

import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.ToolAction;

public class MaceItem extends SwordItem implements ICustomAnimationItem {
    public MaceItem(Tiers tier, int attackDamageIn, Properties builderIn) {
        super(tier, attackDamageIn, -3.2F, builderIn);
    }

        public MaceItem(ForgeTier tier, int attackDamageIn, Properties builderIn) {
            super(tier, attackDamageIn, -3.2F, builderIn);

    }

    @ParametersAreNonnullByDefault
    @Nonnull
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack maceStack = player.getItemInHand(hand);
        player.startUsingItem(hand);
        return InteractionResultHolder.consume(maceStack);
    }

    @ParametersAreNonnullByDefault
    public void releaseUsing(ItemStack maceStack, Level level, LivingEntity livingEntity, int useDurationLeft) {
        if (livingEntity instanceof Player) {
            Player player = (Player)livingEntity;
            if (this.getUseDuration(maceStack) - livingEntity.getUseItemRemainingTicks() >= this.getChargeDuration(maceStack)) {
                double pRange = ((AttributeInstance)Objects.requireNonNull(player.getAttribute((Attribute)ForgeMod.REACH_DISTANCE.get()))).getValue();
                float partialTicks = Minecraft.getInstance().getFrameTime();
                Vec3 vec3 = player.getEyePosition(partialTicks);
                Vec3 vec31 = player.getViewVector(partialTicks);
                Vec3 vec32 = vec3.add(vec31.x * pRange, vec31.y  * pRange, vec31.z * pRange);
                BlockHitResult blockHitResult = level.clip(new ClipContext(vec3, vec32, Block.OUTLINE, Fluid.NONE, player));
                double distance = blockHitResult.distanceTo(player);
                BlockPos blockPos = blockHitResult.getBlockPos();
                Vec3 vec = blockHitResult.getLocation();
                if (blockHitResult.getType() == Type.MISS || distance > 6.904D || blockHitResult.getDirection() != Direction.UP) {
                    return;
                }

                if (!level.isClientSide) {
                    boolean mainHand = player.getUsedItemHand() == InteractionHand.MAIN_HAND;
                    ItemStack otherItemStack = player.getItemInHand(mainHand ? InteractionHand.OFF_HAND : InteractionHand.MAIN_HAND);
                    Item var20 = otherItemStack.getItem();
                    if (var20 instanceof MaceItem) {
                        MaceItem otherMace = (MaceItem)var20;
                        otherMace.smash(player, level, vec, maceStack, otherItemStack);
                        otherItemStack.hurtAndBreak(10, player, (player1) -> {
                            player1.broadcastBreakEvent(InteractionHand.MAIN_HAND);
                        });
                        otherItemStack.hurtAndBreak(10, player, (player1) -> {
                            player1.broadcastBreakEvent(InteractionHand.OFF_HAND);
                        });
                    } else {
                        this.smash(player, level, vec, maceStack, (ItemStack)null);
                        maceStack.hurtAndBreak(10, player, (player1) -> {
                            player1.broadcastBreakEvent(player.getUsedItemHand());
                        });
                    }
                } else {
                    this.smashParticles(vec, level, blockPos);
                    level.playSound(player, vec.x, vec.y, vec.z, SoundInit.MACE_SLAM.get(), SoundSource.PLAYERS, 1.0F, 1.0F);
                }
            }
        }

    }

    private void smash(Player player, Level level, Vec3 vec, ItemStack maceStack, @Nullable ItemStack otherMaceStack) {
        double x = vec.x;
        double y = vec.y;
        double z = vec.z;
        AABB aabb = (new AABB(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D)).inflate(8.0D);
        List<Entity> entitiesInRange = level.getEntitiesOfClass(Entity.class, aabb, Entity::isAlive);
        boolean otherMaceFlag = otherMaceStack != null;
        float maceDamage = ((MaceItem)maceStack.getItem()).getDamage() * 1.5F;
        float otherMaceDamage = otherMaceFlag ? ((MaceItem)otherMaceStack.getItem()).getDamage() * 1.5F : 0.0F;
        Iterator var17 = entitiesInRange.iterator();

        while(true) {
            Entity entity;
            TamableAnimal pet;
            do {
                do {
                    do {
                        if (!var17.hasNext()) {
                            if (!player.getAbilities().instabuild) {
                                player.getCooldowns().addCooldown(maceStack.getItem(), 600);
                                if (otherMaceFlag) {
                                    player.getCooldowns().addCooldown(otherMaceStack.getItem(), 600);
                                }
                            }

                            return;
                        }

                        entity = (Entity)var17.next();
                    } while(entity == player);
                } while(entity instanceof ItemEntity);

                if (!(entity instanceof TamableAnimal)) {
                    break;
                }

                pet = (TamableAnimal)entity;
            } while(pet.getOwner() == player);

            double entityDistance = Math.sqrt(entity.distanceToSqr(vec));
            if (entityDistance <= 2.0D) {
                float seenPercent = Explosion.getSeenPercent(vec, entity);
                float maceEnchantment;
                float otherMaceEnchantment;
                if (entity instanceof LivingEntity) {
                    maceEnchantment = EnchantmentHelper.getDamageBonus(maceStack, ((LivingEntity)entity).getMobType());
                    otherMaceEnchantment = otherMaceFlag ? EnchantmentHelper.getDamageBonus(otherMaceStack, ((LivingEntity)entity).getMobType()) : 0.0F;
                } else {
                    maceEnchantment = EnchantmentHelper.getDamageBonus(maceStack, MobType.UNDEFINED);
                    otherMaceEnchantment = otherMaceFlag ? EnchantmentHelper.getDamageBonus(otherMaceStack, MobType.UNDEFINED) : 0.0F;
                }

                float totalDMG = Math.max(maceDamage + maceEnchantment, otherMaceDamage + otherMaceEnchantment);
                float bonusDMG = Math.min(maceDamage + maceEnchantment, otherMaceDamage + otherMaceEnchantment) / 2.0F;
                float finalDMG = (totalDMG + bonusDMG) * seenPercent;
                if (finalDMG > 0.0F) {
                    entity.hurt(DamageSource.playerAttack(player), (totalDMG + bonusDMG) * seenPercent);
                    player.crit(entity);
                }
            }

            if (entityDistance <= 2.0D && entity instanceof LivingEntity) {
                LivingEntity living = (LivingEntity)entity;
                living.knockback(0.10000000149011612D * Math.abs(entityDistance - 2.0D) + entityDistance > 4.0D ? 0.4000000059604645D : 0.0D, vec.x - entity.getX(), vec.z - entity.getZ());
            }
        }
    }

    private void smashParticles(Vec3 vec, Level level, BlockPos blockPos) {
        for(int x = -6; x <= 6; ++x) {
            for(int y = -1; y <= 1; ++y) {
                for(int z = -6; z <= 6; ++z) {
                    BlockPos newPos = new BlockPos(blockPos.getX() + x, blockPos.getY() + y, blockPos.getZ() + z);
                    Random r = level.getRandom();
                    Vec3 newVec = new Vec3((double)newPos.getX() + r.nextDouble(), (double)newPos.getY() + 1.0D + r.nextDouble() * 2.0D, (double)newPos.getZ() + r.nextDouble());
                    double newVecToVec = newVec.distanceTo(vec);
                    if (!level.getBlockState(newPos).isAir() && newVecToVec <= 5.0D) {
                        for(int i = 0; i < r.nextInt((int)Math.abs(newVecToVec - 6.0D) * 32); ++i) {
                            level.addParticle(new DustParticleOptions(new Vector3f(new Vec3(0.98D, 0.94D, 0.9D)), 0.8F), newVec.x, newVec.y , newVec.z , 0.0D, 0.0D, 0.0D);
                        }
                    }
                }
            }
        }

    }

    @ParametersAreNonnullByDefault
    @Nonnull
    public UseAnim getUseAnimation(ItemStack maceStack) {
        return UseAnim.SPEAR;
    }

    @ParametersAreNonnullByDefault
    public boolean canPerformAction(ItemStack stack, ToolAction toolAction) {
        return false;
    }

    @ParametersAreNonnullByDefault
    public int  getUseDuration(ItemStack maceStack) {
        return 72000;
    }

    @ParametersAreNonnullByDefault
    public int getCustomUseDuration(ItemStack maceStack, Player player) {
        return this. getUseDuration(maceStack) - player.getUseItemRemainingTicks();
    }

    public int getChargeDuration(ItemStack itemStack) {
        return 30;
    }
}
