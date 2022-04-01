package com.melvinbur.archmagica.core.item;

import com.melvinbur.archmagica.ArchMagica;

import com.melvinbur.archmagica.configs.CreativeModeTabInit;
import com.melvinbur.archmagica.core.block.BlockInit;
import com.melvinbur.archmagica.core.material.CustomArmorMaterial;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.Rarity;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ItemInit {




    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArchMagica.MOD_ID);

    public static final RegistryObject<Item> ARCH_CRYSTAL = ITEMS.register("arch_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> ABYSSAL_ORB = ITEMS.register("abyssal_orb",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> ARCANE_CRYSTAL = ITEMS.register("arcane_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> ARMOR_FRAGMENT = ITEMS.register("armor_fragment",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> CERBERUS_HIDE = ITEMS.register("cerberus_hide",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> CERBERUS_TOOTH = ITEMS.register("cerberus_tooth",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> CUSPID_FANG = ITEMS.register("cuspid_fang",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> ENHANCE_STONE = ITEMS.register("enhance_stone",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> FAIRY_DUST = ITEMS.register("fairy_dust",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> GOLD_RING = ITEMS.register("gold_ring",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> HARDBONE = ITEMS.register("hardbone",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> INFERNAL_CORE = ITEMS.register("infernal_core",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> INFERNAL_POWDER = ITEMS.register("infernal_powder",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> IVORY_CHARM = ITEMS.register("ivory_charm",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> LOST_LETTER = ITEMS.register("lost_letter",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> LOST_PENDANT = ITEMS.register("lost_pendant",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> MANA_CRYSTAL = ITEMS.register("mana_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> MAGIC_DUST = ITEMS.register("magic_dust",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> MAGICAL_LEAF = ITEMS.register("magical_leaf",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> MINOTAUR_HORN = ITEMS.register("minotaur_horn",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> OMINOUS_ORB = ITEMS.register("ominous_orb",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> PIXIE_DUST = ITEMS.register("pixie_dust",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> POISON_STINGER = ITEMS.register("poison_stinger",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> SHARP_SPIKE = ITEMS.register("sharp_spike",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> SPIDER_SILK = ITEMS.register("spider_silk",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> SWORD_FRAGMENT = ITEMS.register("sword_fragment",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> WEDDING_RING = ITEMS.register("wedding_ring",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> WISDOM_AMULET = ITEMS.register("wisdom_amulet",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> ENGRAVING_STONE = ITEMS.register("engraving_stone",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> ENCHANT = ITEMS.register("enchant",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> GOBLIN_EYE = ITEMS.register("goblin_eye",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> AWAKENED_ENCHANT = ITEMS.register("awakened_enchant",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));


    // Runes

    public static final RegistryObject<Item> BLUE_RUNE = ITEMS.register("blue_rune",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> CYAN_RUNE = ITEMS.register("cyan_rune",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> GRAY_RUNE = ITEMS.register("gray_rune",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> GREEN_RUNE = ITEMS.register("green_rune",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> ORANGE_RUNE = ITEMS.register("orange_rune",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> PURPLE_RUNE = ITEMS.register("purple_rune",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> RED_RUNE = ITEMS.register("red_rune",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> WHITE_RUNE = ITEMS.register("white_rune",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> YELLOW_RUNE = ITEMS.register("yellow_rune",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));



    // Buckets & Signs
    public static final RegistryObject<Item> OMINOUS_FLUID_BUCKET = ITEMS.register("ominous_fluid_bucket",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> CORRUPTED_SIGN_ITEM = ITEMS.register("corrupted_sign",
            () -> new SignItem(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB2).stacksTo(16),
                    BlockInit.CORRUPTED_SIGN.get(), BlockInit.CORRUPTED_WALL_SIGN.get()));



    // Tiered Items
    public static final RegistryObject<Item> AWAKENING_STONE1 = ITEMS.register("awakening_stone1",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> AWAKENING_STONE2 = ITEMS.register("awakening_stone2",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> AWAKENING_STONE3 = ITEMS.register("awakening_stone3",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> AWAKENING_STONE4 = ITEMS.register("awakening_stone4",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> AWAKENING_STONE5 = ITEMS.register("awakening_stone5",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> DEMON_BLOOD1 = ITEMS.register("demon_blood1",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> DEMON_BLOOD2 = ITEMS.register("demon_blood2",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> DEMON_BLOOD3 = ITEMS.register("demon_blood3",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> DEMON_BLOOD4 = ITEMS.register("demon_blood4",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> DEMON_BLOOD5 = ITEMS.register("demon_blood5",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> WATER_LIFE1 = ITEMS.register("water_life1",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> WATER_LIFE2 = ITEMS.register("water_life2",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> WATER_LIFE3 = ITEMS.register("water_life3",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> WATER_LIFE4 = ITEMS.register("water_life4",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> WATER_LIFE5 = ITEMS.register("water_life5",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));


    // Ingots & Nuggets

    public static final RegistryObject<Item> CELESTINE_INGOT = ITEMS.register("celestine_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> CELESTINE_NUGGET = ITEMS.register("celestine_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> CRIMSONSTEEL_INGOT = ITEMS.register("crimsonsteel_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> CRIMSONSTEEL_NUGGET = ITEMS.register("crimsonsteel_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> EDAPHINE_INGOT = ITEMS.register("edaphine_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> EDAPHINE_NUGGET = ITEMS.register("edaphine_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> ETHRIL_INGOT = ITEMS.register("ethril_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> ETHRIL_NUGGET = ITEMS.register("ethril_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> MYTHRIL_INGOT = ITEMS.register("mythril_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> MYTHRIL_NUGGET = ITEMS.register("mythril_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> ORASINE_INGOT = ITEMS.register("orasine_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> ORASINE_NUGGET = ITEMS.register("orasine_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> ORICHALGUM_INGOT = ITEMS.register("orichalgum_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> ORICHALGUM_NUGGET = ITEMS.register("orichalgum_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> SOULSTEEL_INGOT = ITEMS.register("soulsteel_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> SOULSTEEL_NUGGET = ITEMS.register("soulsteel_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> STYGIUM_INGOT = ITEMS.register("stygium_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> STYGIUM_NUGGET = ITEMS.register("stygium_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    public static final RegistryObject<Item> JADE = ITEMS.register("jade",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB)));

    // Armor

    public static final RegistryObject<Item> CELESTINE_HELMET = ITEMS.register("celestine_helmet",
            () -> new ArmorItem(CustomArmorMaterial.CELESTINE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> CELESTINE_CHESTPLATE = ITEMS.register("celestine_chestplate",
            () -> new ArmorItem(CustomArmorMaterial.CELESTINE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> CELESTINE_LEGGINGS = ITEMS.register("celestine_leggings",
            () -> new ArmorItem(CustomArmorMaterial.CELESTINE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> CELESTINE_BOOTS = ITEMS.register("celestine_boots",
            () -> new ArmorItem(CustomArmorMaterial.CELESTINE, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> EDAPHINE_HELMET = ITEMS.register("edaphine_helmet",
            () -> new ArmorItem(CustomArmorMaterial.EDAPHINE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> EDAPHINE_CHESTPLATE = ITEMS.register("edaphine_chestplate",
            () -> new ArmorItem(CustomArmorMaterial.EDAPHINE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> EDAPHINE_LEGGINGS = ITEMS.register("edaphine_leggings",
            () -> new ArmorItem(CustomArmorMaterial.EDAPHINE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> EDAPHINE_BOOTS = ITEMS.register("edaphine_boots",
            () -> new ArmorItem(CustomArmorMaterial.EDAPHINE, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> ORICHALGUM_HELMET = ITEMS.register("orichalgum_helmet",
            () -> new ArmorItem(CustomArmorMaterial.ORICHALGUM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> ORICHALGUM_CHESTPLATE = ITEMS.register("orichalgum_chestplate",
            () -> new ArmorItem(CustomArmorMaterial.ORICHALGUM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> ORICHALGUM_LEGGINGS = ITEMS.register("orichalgum_leggings",
            () -> new ArmorItem(CustomArmorMaterial.ORICHALGUM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> ORICHALGUM_BOOTS = ITEMS.register("orichalgum_boots",
            () -> new ArmorItem(CustomArmorMaterial.ORICHALGUM, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> ETHRIL_HELMET = ITEMS.register("ethril_helmet",
            () -> new ArmorItem(CustomArmorMaterial.ETHRIL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> ETHRIL_CHESTPLATE = ITEMS.register("ethril_chestplate",
            () -> new ArmorItem(CustomArmorMaterial.ETHRIL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> ETHRIL_LEGGINGS = ITEMS.register("ethril_leggings",
            () -> new ArmorItem(CustomArmorMaterial.ETHRIL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> ETHRIL_BOOTS = ITEMS.register("ethril_boots",
            () -> new ArmorItem(CustomArmorMaterial.ETHRIL, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> CRIMSONSTEEL_HELMET = ITEMS.register("crimsonsteel_helmet",
            () -> new ArmorItem(CustomArmorMaterial.CRIMSONSTEEL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> CRIMSONSTEEL_CHESTPLATE = ITEMS.register("crimsonsteel_chestplate",
            () -> new ArmorItem(CustomArmorMaterial.CRIMSONSTEEL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> CRIMSONSTEEL_LEGGINGS = ITEMS.register("crimsonsteel_leggings",
            () -> new ArmorItem(CustomArmorMaterial.CRIMSONSTEEL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> CRIMSONSTEEL_BOOTS = ITEMS.register("crimsonsteel_boots",
            () -> new ArmorItem(CustomArmorMaterial.CRIMSONSTEEL, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> SOULSTEEL_HELMET = ITEMS.register("soulsteel_helmet",
            () -> new ArmorItem(CustomArmorMaterial.SOULSTEEL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> SOULSTEEL_CHESTPLATE = ITEMS.register("soulsteel_chestplate",
            () -> new ArmorItem(CustomArmorMaterial.SOULSTEEL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> SOULSTEEL_LEGGINGS = ITEMS.register("soulsteel_leggings",
            () -> new ArmorItem(CustomArmorMaterial.SOULSTEEL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> SOULSTEEL_BOOTS = ITEMS.register("soulsteel_boots",
            () -> new ArmorItem(CustomArmorMaterial.SOULSTEEL, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> STYGIUM_HELMET = ITEMS.register("stygium_helmet",
            () -> new ArmorItem(CustomArmorMaterial.STYGIUM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> STYGIUM_CHESTPLATE = ITEMS.register("stygium_chestplate",
            () -> new ArmorItem(CustomArmorMaterial.STYGIUM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> STYGIUM_LEGGINGS = ITEMS.register("stygium_leggings",
            () -> new ArmorItem(CustomArmorMaterial.STYGIUM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> STYGIUM_BOOTS = ITEMS.register("stygium_boots",
            () -> new ArmorItem(CustomArmorMaterial.STYGIUM, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> ORASINE_HELMET = ITEMS.register("orasine_helmet",
            () -> new ArmorItem(CustomArmorMaterial.ORASINE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> ORASINE_CHESTPLATE = ITEMS.register("orasine_chestplate",
            () -> new ArmorItem(CustomArmorMaterial.ORASINE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> ORASINE_LEGGINGS = ITEMS.register("orasine_leggings",
            () -> new ArmorItem(CustomArmorMaterial.ORASINE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> ORASINE_BOOTS = ITEMS.register("orasine_boots",
            () -> new ArmorItem(CustomArmorMaterial.ORASINE, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> MYTHRIL_HELMET = ITEMS.register("mythril_helmet",
            () -> new ArmorItem(CustomArmorMaterial.MYTHRIL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> MYTHRIL_CHESTPLATE = ITEMS.register("mythril_chestplate",
            () -> new ArmorItem(CustomArmorMaterial.MYTHRIL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> MYTHRIL_LEGGINGS = ITEMS.register("mythril_leggings",
            () -> new ArmorItem(CustomArmorMaterial.MYTHRIL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> MYTHRIL_BOOTS = ITEMS.register("mythril_boots",
            () -> new ArmorItem(CustomArmorMaterial.MYTHRIL, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> JADE_HELMET = ITEMS.register("jade_helmet",
            () -> new ArmorItem(CustomArmorMaterial.JADE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> JADE_CHESTPLATE = ITEMS.register("jade_chestplate",
            () -> new ArmorItem(CustomArmorMaterial.JADE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> JADE_LEGGINGS = ITEMS.register("jade_leggings",
            () -> new ArmorItem(CustomArmorMaterial.JADE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> JADE_BOOTS = ITEMS.register("jade_boots",
            () -> new ArmorItem(CustomArmorMaterial.JADE, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(CustomArmorMaterial.STEEL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(CustomArmorMaterial.STEEL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(CustomArmorMaterial.STEEL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));

    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(CustomArmorMaterial.STEEL, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3)));


    // Weapons


    // Thinsword
    public static final RegistryObject<ThinSwordItem> IRON_THINSWORD =  ITEMS.register("iron_thinsword",
            () -> new ThinSwordItem(Tiers.IRON, 2, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<ThinSwordItem> JADE_THINSWORD =  ITEMS.register("jade_thinsword",
            () -> new ThinSwordItem(TiersInit.JADE, 2, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<ThinSwordItem> STEEL_THINSWORD =  ITEMS.register("steel_thinsword",
            () -> new ThinSwordItem(TiersInit.STEEL, 2, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<ThinSwordItem> MYTHRIL_THINSWORD =  ITEMS.register("mythril_thinsword",
            () -> new ThinSwordItem(TiersInit.MYTHRIL, 2, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<ThinSwordItem> ORASINE_THINSWORD =  ITEMS.register("orasine_thinsword",
            () -> new ThinSwordItem(TiersInit.ORASINE, 2, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<ThinSwordItem> STYGIUM_THINSWORD =  ITEMS.register("stygium_thinsword",
            () -> new ThinSwordItem(TiersInit.STYGIUM, 2, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    // Herosword
    public static final RegistryObject<HeroSwordItem> IRON_HEROSWORD =  ITEMS.register("iron_herosword",
            () -> new HeroSwordItem(Tiers.IRON, 3, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<HeroSwordItem> DIAMOND_HEROSWORD =  ITEMS.register("diamond_herosword",
            () -> new HeroSwordItem(Tiers.DIAMOND, 3, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<HeroSwordItem> STEEL_HEROSWORD =  ITEMS.register("steel_herosword",
            () -> new HeroSwordItem(TiersInit.STEEL, 3, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    // Mercenarysword
    public static final RegistryObject<MercenarySwordItem> IRON_MERCENARYSWORD =  ITEMS.register("iron_mercenarysword",
            () -> new MercenarySwordItem(Tiers.IRON, 2, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<MercenarySwordItem> DIAMOND_MERCENARYSWORD =  ITEMS.register("diamond_mercenarysword",
            () -> new MercenarySwordItem(Tiers.DIAMOND, 2, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<MercenarySwordItem> STEEL_MERCENARYSWORD =  ITEMS.register("steel_mercenarysword",
            () -> new MercenarySwordItem(TiersInit.STEEL, 2, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    // Mace
    public static final RegistryObject<MaceItem> IRON_MACE =  ITEMS.register("iron_mace",
            () -> new MaceItem(Tiers.IRON, 4, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<MaceItem> DIAMOND_MACE =  ITEMS.register("diamond_mace",
            () -> new MaceItem(Tiers.DIAMOND, 4, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<MaceItem> STEEL_MACE =  ITEMS.register("steel_mace",
            () -> new MaceItem(TiersInit.STEEL, 4, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    // Halberd
    public static final RegistryObject<HalberdItem> IRON_HALBERD =  ITEMS.register("iron_halberd",
            () -> new HalberdItem(Tiers.IRON, 6, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<HalberdItem> DIAMOND_HALBERD =  ITEMS.register("diamond_halberd",
            () -> new HalberdItem(Tiers.DIAMOND, 6, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<HalberdItem> JADE_HALBERD =  ITEMS.register("jade_halberd",
            () -> new HalberdItem(TiersInit.JADE, 6, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<HalberdItem> STEEL_HALBERD =  ITEMS.register("steel_halberd",
            () -> new HalberdItem(TiersInit.STEEL, 6, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<HalberdItem> MYTHRIL_HALBERD =  ITEMS.register("mythril_halberd",
            () -> new HalberdItem(TiersInit.MYTHRIL, 6, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<HalberdItem> ORASINE_HALBERD =  ITEMS.register("orasine_halberd",
            () -> new HalberdItem(TiersInit.ORASINE, 6, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<HalberdItem> STYGIUM_HALBERD =  ITEMS.register("stygium_halberd",
            () -> new HalberdItem(TiersInit.STYGIUM, 6, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));



    // Battleaxe
    public static final RegistryObject<BattleaxeItem> IRON_BATTLEAXE =  ITEMS.register("iron_battleaxe",
            () -> new BattleaxeItem(Tiers.IRON, 4, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<BattleaxeItem> JADE_BATTLEAXE =  ITEMS.register("jade_battleaxe",
            () -> new BattleaxeItem(TiersInit.JADE, 4, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<BattleaxeItem> STEEL_BATTLEAXE =  ITEMS.register("steel_battleaxe",
            () -> new BattleaxeItem(TiersInit.STEEL, 4, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<BattleaxeItem> ORASINE_BATTLEAXE =  ITEMS.register("orasine_battleaxe",
            () -> new BattleaxeItem(TiersInit.ORASINE, 4, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<BattleaxeItem> MYTHRIL_BATTLEAXE =  ITEMS.register("mythril_battleaxe",
            () -> new BattleaxeItem(TiersInit.MYTHRIL, 4, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));

    public static final RegistryObject<BattleaxeItem> STYGIUM_BATTLEAXE =  ITEMS.register("stygium_battleaxe",
            () -> new BattleaxeItem(TiersInit.STYGIUM, 4, (new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB3))));







    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

