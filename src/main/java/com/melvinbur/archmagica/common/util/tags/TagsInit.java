package com.melvinbur.archmagica.common.util.tags;

import com.melvinbur.archmagica.ArchMagica;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


public class TagsInit {

    public static class Blocks {

        // Blocks
        public static final TagKey<Block> BRECCIA_STONE =
                createTag("breccia_stone");

        public static final TagKey<Block> PURGATORY_STONE =
                createTag("purgatory_stone");


        // Tag Types
        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(new ResourceLocation(ArchMagica.MOD_ID, name));
        }

        private static TagKey<Block> createForgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {

        // Items
        public static final TagKey<Item> STEEL_INGOT =
                createForgeTag("ingots/steel_ingot");

        public static final TagKey<Item> JADE =
                createForgeTag("gems/jade");
        // Tag Types
        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(new ResourceLocation("archmagica", name));
        }

        private static TagKey<Item> createForgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }

    }
}
