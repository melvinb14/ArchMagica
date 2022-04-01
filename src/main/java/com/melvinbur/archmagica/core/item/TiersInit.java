package com.melvinbur.archmagica.core.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TiersInit {
    public static final ForgeTier JADE = new ForgeTier(1, 184, 5.0F, 2.0F, 19, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ItemInit.JADE.get()));

    public static final ForgeTier STEEL = new ForgeTier(1, 276, 6.0F, 2.0F, 12, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ItemInit.STEEL_INGOT.get()));

    public static final ForgeTier MYTHRIL = new ForgeTier(2, 640, 7.0F, 2.0F, 15, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ItemInit.MYTHRIL_INGOT.get()));

    public static final ForgeTier ORASINE = new ForgeTier(2, 820, 7.0F, 2.0F, 9, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ItemInit.ORASINE_INGOT.get()));

    public static final ForgeTier STYGIUM = new ForgeTier(3, 1731, 8.0F, 3.0F, 4, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ItemInit.STYGIUM_INGOT.get()));
}