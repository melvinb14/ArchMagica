package com.melvinbur.archmagica.core.world;





import com.melvinbur.archmagica.core.block.BlockInit;
import com.melvinbur.archmagica.core.block.GroundCoverBlock;

import com.melvinbur.archmagica.core.world.gen.features.stateproviders.DirectionalStateProvider;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;


import net.minecraft.world.level.levelgen.feature.stateproviders.RandomizedIntStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

import static net.minecraft.data.worldgen.features.FeatureUtils.register;


// Trees
public class ConfiguredFeatureInit {
    public static final Holder<? extends ConfiguredFeature<TreeConfiguration, ?>> CORRUPTED_TREE =
            register("corrupted_tree", Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(BlockInit.CORRUPTED_LOG.get()),
                            new GiantTrunkPlacer(5, 2, 2), BlockStateProvider.simple
                           (BlockInit.CORRUPTED_LEAVES.get()),
                            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                            new TwoLayersFeatureSize(1, 0, 2)).build());





    public static final Holder<PlacedFeature> CORRUPTED_CHECKED = PlacementUtils.register("corrupted_checked",
                            CORRUPTED_TREE, PlacementUtils.filteredByBlockSurvival(BlockInit.CORRUPTED_LEAVES.get()));


    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> CORRUPTED_SPAWN =
            FeatureUtils.register("corrupted_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(CORRUPTED_CHECKED,
                            0.5F)), CORRUPTED_CHECKED));







// Flowers
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> AAPHUSH_FLOWER = register("flower_aaphush_flower",
        Feature.FLOWER, new RandomPatchConfiguration(64, 6, 2,  PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.AAPHUSH_FLOWER.get())))));

// Environment


    public static final ConfiguredFeature<RandomPatchConfiguration, ?> WATERPLANT = FeatureUtils.register("waterplant",
            Feature.RANDOM_PATCH.configured(waterPatchConfiguration(Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.WATERPLANT.get()))))));


    public static final ConfiguredFeature<RandomPatchConfiguration, ?> FALLEN = FeatureUtils.register("fallen",
            createGroundcoverPatchFeature(1, 65, 20, BlockInit.FALLEN_ADVENTURER1.get()));

    public static final ConfiguredFeature<RandomPatchConfiguration, ?> FALLEN2 = FeatureUtils.register("fallen2",
            createGroundcoverPatchFeature(1, 65, 20, BlockInit.FALLEN_ADVENTURER2.get()));


    public static final Holder<ConfiguredFeature<SimpleBlockConfiguration, ?>> MAGIC_CRYSTAL = register("magic_crystal",
            Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.MAGIC_CRYSTAL.get())));


    public static final Holder<ConfiguredFeature<SimpleBlockConfiguration, ?>> MAGIC_CRYSTAL2 = register("magic_crystal2",
            Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.MAGIC_CRYSTAL2.get())));

    public static final Holder<ConfiguredFeature<SimpleBlockConfiguration, ?>> MAGIC_CRYSTAL3 = register("magic_crystal3",
            Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.MAGIC_CRYSTAL3.get())));







// Ores

    public static final RuleTest NATURAL_STONE = new TagMatchTest(BlockTags.BASE_STONE_OVERWORLD);
    public static final RuleTest NETHERRACK = new BlockMatchTest(Blocks.NETHERRACK);
    public static final RuleTest ENDSTONE = new BlockMatchTest(Blocks.END_STONE);
    public static final RuleTest NETHER_ORE_REPLACEABLES = new TagMatchTest(BlockTags.BASE_STONE_NETHER);



    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_JADE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.JADE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.JADE_DEEPSLATE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> JADE_ORE = register("jade_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_JADE_ORES, 9));


    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_MYTHRIL_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.MYTHRIL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.MYTHRIL_DEEPSLATE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MYTHRIL_ORE = register("mythril_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_MYTHRIL_ORES, 9));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_STYGIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.STYGIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.STYGIUM_DEEPSLATE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> STYGIUM_ORE = register("stygium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_STYGIUM_ORES, 6));


    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_CELESTINE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.CELESTINE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.CELESTINE_DEEPSLATE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CELESTINE_ORE = register("celestine_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_CELESTINE_ORES, 5));

    // Natural Stone
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BRECCIA_STONE = register("breccia_stone",
            Feature.ORE, new OreConfiguration(NATURAL_STONE, BlockInit.BRECCIA_STONE.get().defaultBlockState(), 64));

    // Nether
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORASINE_ORE = register("orasine_ore",
            Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES , BlockInit.ORASINE_ORE.get().defaultBlockState(), 8));

    // Nether Stone
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PURGATORY_STONE = register("purgatory_stone",
            Feature.ORE, new OreConfiguration(NETHERRACK , BlockInit.PURGATORY_STONE.get().defaultBlockState(), 33));

    // End
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> EDAPHINE_ORE = register("edaphine_ore",
            Feature.ORE, new OreConfiguration(ENDSTONE , BlockInit.EDAPHINE_ORE.get().defaultBlockState(), 5));


    private static  Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> createGroundcoverPatchFeature(int tries, int xzSpread, int ySpread, Block block) {
        return Feature.RANDOM_PATCH.configured(new RandomPatchConfiguration(tries, xzSpread, ySpread, () -> {
            return FeaturesInit.SIMPLE_BLOCK_MATCH_WATER.configured(new SimpleBlockConfiguration(new RandomizedIntStateProvider(new DirectionalStateProvider(block),
                    GroundCoverBlock.MODEL, UniformInt.of(0, 4)))).filtered(BlockPredicate.allOf(BlockPredicate.replaceable(),
                    BlockPredicate.not(BlockPredicate.matchesBlock(Blocks.ICE, new BlockPos(0, -1, 0)))));
        }));
    }


    private static RandomPatchConfiguration waterPatchConfiguration(Holder<PlacedFeature> feature, int tries) {
        return FeatureUtils.simpleRandomPatchConfiguration(tries, feature.filtered(BlockPredicate.matchesBlock(Blocks.WATER, BlockPos.ZERO)));
    }

    private static RandomPatchConfiguration waterPatchConfiguration(Holder<PlacedFeature> feature) {
        return waterPatchConfiguration(feature, 96);
    }


}