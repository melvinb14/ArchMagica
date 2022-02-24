package com.melvinbur.archmagica.core.block;
import com.melvinbur.archmagica.ArchMagica;
import com.melvinbur.archmagica.core.item.CreativeModeTabInit;
import com.melvinbur.archmagica.core.item.ItemInit;
import com.melvinbur.archmagica.core.world.gen.features.trees.CorruptedTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ArchMagica.MOD_ID);



    public static final RegistryObject<Block> BRECCIA_STONE = registerBlock("breccia_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(1.5f,6f)));

    public static final RegistryObject<Block> POLISHED_BRECCIA = registerBlock("polished_breccia",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(1.5f,6f)));

    public static final RegistryObject<Block> BRECCIA_SLAB = registerBlock("breccia_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));


    public static final RegistryObject<Block> BRECCIA_BUTTON = registerBlock("breccia_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON)));

    public static final RegistryObject<Block> BRECCIA_PRESSURE_PLATE = registerBlock("breccia_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, (BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE))));


    public static final RegistryObject<Block> PURGATORY_STONE = registerBlock("purgatory_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f,6f)));

    public static final RegistryObject<Block> RUNIC_STONE = registerBlock("runic_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(1.5f,6f)));

    public static final RegistryObject<Block> CORRUPTED_GRASS = registerBlock("corrupted_grass",
            () -> new Block(BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.WET_GRASS).requiresCorrectToolForDrops().strength(0.5f,0.5f)));

    public static final RegistryObject<Block> CORRUPTED_LEAVES = registerBlock("corrupted_leaves",  () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
        @Override
        public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
            return true;
        }

        @Override
        public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
            return 60;
        }

        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
            return 30;
        }
    });


    // Nature
     public static final RegistryObject<Block> CORRUPTED_SAPLING	= registerBlock("corrupted_sapling",
             () -> new SaplingBlock(new CorruptedTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> AAPHUSH_FLOWER = registerBlock("aaphush_flower",
            () -> new FlowerBlock(MobEffects.HEAL, 2,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> POTTED_AAPHUSH_FLOWER = BLOCKS.register("potted_aaphush_flower",
            () -> new FlowerPotBlock(null , BlockInit.AAPHUSH_FLOWER,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));



    // Wood
    public static final RegistryObject<Block> CORRUPTED_LOG	= registerBlock("corrupted_log",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    public static final RegistryObject<Block> CORRUPTED_WOOD	= registerBlock("corrupted_wood",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    public static final RegistryObject<Block> STRIPPED_CORRUPTED_LOG	= registerBlock("stripped_corrupted_log",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG)));


    public static final RegistryObject<Block> STRIPPED_CORRUPTED_WOOD = registerBlock("stripped_corrupted_wood",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));

    public static final RegistryObject<Block> CORRUPTED_PLANKS	= registerBlock("corrupted_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            });
    // Stairs, ETC

   public static final RegistryObject<Block> CORRUPTED_SIGN = BLOCKS.register("corrupted_sign",
            () -> new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.CORRUPTED));

    public static final RegistryObject<Block> CORRUPTED_WALL_SIGN = BLOCKS.register("corrupted_wall_sign",
            () -> new WallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), WoodTypeInit.CORRUPTED));

    public static final RegistryObject<Block> CORRUPTED_STAIRS = registerBlock("corrupted_stairs",
            () -> new StairBlock(() -> CORRUPTED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DARK_OAK_STAIRS)));

    public static final RegistryObject<Block> CORRUPTED_FENCE = registerBlock("corrupted_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_FENCE)));

    public static final RegistryObject<Block> CORRUPTED_FENCE_GATE = registerBlock("corrupted_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_FENCE_GATE)));

    public static final RegistryObject<Block> CORRUPTED_SLAB = registerBlock("corrupted_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_SLAB)));


    public static final RegistryObject<Block> CORRUPTED_BUTTON = registerBlock("corrupted_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_BUTTON)));

    public static final RegistryObject<Block> CORRUPTED_PRESSURE_PLATE = registerBlock("corrupted_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, (BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PRESSURE_PLATE))));

    public static final RegistryObject<Block> CORRUPTED_DOOR = registerBlock("corrupted_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_DOOR)));

    public static final RegistryObject<Block> CORRUPTED_TRAPDOOR = registerBlock("corrupted_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_TRAPDOOR)));

    public static final RegistryObject<Block> BRECCIA_STAIRS = registerBlock("breccia_stairs",
            () -> new StairBlock(() -> BRECCIA_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.ANDESITE_STAIRS)));






    // Blockbench

    public static final RegistryObject<Block> WITCH_OVEN = registerBlock("witch_oven",
            () -> new WitchOvenBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f, 6f).noOcclusion()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> BLACKSMITH_ANVIL = registerBlock("blacksmith_anvil",
            () -> new BlackSmithAnvilBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f, 6f).noOcclusion()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> MAGIC_CRYSTAL = registerBlock("magic_crystal",
            () -> new MagicCrystalBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .noOcclusion()
                    .strength(1.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
                    .lightLevel((p_50870_) -> 15)));

    public static final RegistryObject<Block> MAGIC_CRYSTAL2 = registerBlock("magic_crystal2",
            () -> new MagicCrystal2Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .noOcclusion()
                    .strength(1.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
                    .lightLevel((p_50870_) -> 15)));

    public static final RegistryObject<Block> MAGIC_CRYSTAL3 = registerBlock("magic_crystal3",
            () -> new MagicCrystal3Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .noOcclusion()
                    .strength(1.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
                    .lightLevel((p_50870_) -> 15)));

    public static final RegistryObject<Block> FALLEN_ADVENTURER1 = registerBlock("fallen_adventurer1",
            () -> new FallingAdventurer1Block(BlockBehaviour.Properties.of(Material.STONE)
                    .noOcclusion()
                    .noCollission()
                    .strength(3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> FALLEN_ADVENTURER2 = registerBlock("fallen_adventurer2",
            () -> new FallingAdventurer2Block(BlockBehaviour.Properties.of(Material.STONE)
                    .noOcclusion()
                    .noCollission()
                    .strength(2.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> WATERPLANT = registerBlock("waterplant",
            () -> new WaterplantBlock(BlockBehaviour.Properties.of(Material.PLANT)
                    .noOcclusion()
                    .noCollission()
                    .instabreak()
                    .sound(SoundType.BIG_DRIPLEAF)
                    .lightLevel((p_50870_) -> 8)));









    // Materials
    public static final RegistryObject<Block> CELESTINE_BLOCK = registerBlock("celestine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(10f, 7f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> EDAPHINE_BLOCK = registerBlock("edaphine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(10f, 7f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> ORICHALGUM_BLOCK = registerBlock("orichalgum_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(10f, 7f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> ETHRIL_BLOCK = registerBlock("ethril_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(10f, 7f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRIMSONSTEEL_BLOCK = registerBlock("crimsonsteel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(8.5f, 7f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> SOULSTEEL_BLOCK = registerBlock("soulsteel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(8.5f, 7f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> STYGIUM_BLOCK = registerBlock("stygium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(8f, 6f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> ORASINE_BLOCK = registerBlock("orasine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7.5f, 6f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> MYTHRIL_BLOCK = registerBlock("mythril_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7f, 6f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> JADE_BLOCK = registerBlock("jade_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f, 6f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f, 6f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));


    // Ores
    public static final RegistryObject<Block> CELESTINE_ORE	= registerBlock("celestine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(10f, 7f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> CELESTINE_DEEPSLATE_ORE	= registerBlock("celestine_deepslate_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(11.5f, 7f).requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));


    public static final RegistryObject<Block> EDAPHINE_ORE	= registerBlock("edaphine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(10f, 7f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> STYGIUM_ORE	= registerBlock("stygium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(8f, 6f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> STYGIUM_DEEPSLATE_ORE	= registerBlock("stygium_deepslate_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9.5f, 6f).requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> ORASINE_ORE	= registerBlock("orasine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7.5f, 6f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> MYTHRIL_ORE	= registerBlock("mythril_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f, 6f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> MYTHRIL_DEEPSLATE_ORE	= registerBlock("mythril_deepslate_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(8.5f, 6f).requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> JADE_ORE	= registerBlock("jade_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f, 6f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> JADE_DEEPSLATE_ORE	= registerBlock("jade_deepslate_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6.5f, 6f).requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));








    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(CreativeModeTabInit.ARCHMAGICA_TAB2)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}