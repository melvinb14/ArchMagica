package com.melvinbur.archmagica.common.entity;

import com.melvinbur.archmagica.common.entitytypes.ArmoryEntityTypesInit;
import com.melvinbur.archmagica.core.item.ItemInit;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class SpearEntity extends AbstractThrownWeaponEntity {



    public SpearEntity(Level level, LivingEntity livingEntity, ItemStack spearStack) {
        super(ArmoryEntityTypesInit.SPEAR.get(), livingEntity, level, spearStack);
    }

    public SpearEntity(EntityType<SpearEntity> entityType, Level level) {
        super(entityType, level);

    }

    protected String onHitDamageSource() {
        return "Spear";
    }

    protected SoundEvent onHitSoundEvent() {
        return SoundEvents.TRIDENT_HIT;
    }

    @NotNull
    protected SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.TRIDENT_HIT_GROUND;
    }

    protected Item getDefaultItem() {
        return ItemInit.IRON_SPEAR.get();
    }
}
