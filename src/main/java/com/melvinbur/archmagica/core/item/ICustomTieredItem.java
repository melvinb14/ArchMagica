package com.melvinbur.archmagica.core.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public interface ICustomTieredItem {
    default Tier getTier() {
        return null;
    }

    default int getEnchantmentValue() {
        return this.getTier().getEnchantmentValue();
    }

    default boolean isValidRepairItem(ItemStack itemStack) {
        return this.getTier().getRepairIngredient().test(itemStack);
    }
}
