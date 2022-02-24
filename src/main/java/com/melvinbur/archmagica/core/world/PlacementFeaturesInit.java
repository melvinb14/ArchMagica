package com.melvinbur.archmagica.core.world;


import com.melvinbur.archmagica.core.world.gen.features.ores.OrePlacementInit;

import net.minecraft.core.Direction;
import net.minecraft.data.worldgen.placement.AquaticPlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;

import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;


public class PlacementFeaturesInit {

// Trees
    public static final PlacedFeature CORRUPTED_PLACED = PlacementUtils.register("corrupted_placed",
            ConfiguredFeatureInit.CORRUPTED_TREE_CHECKED.placed(InSquarePlacement.spread(),
                     PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.countExtra(64, 0.25F, 2), BiomeFilter.biome()));

// Vegetation
    public static final PlacedFeature AAPHUSH_FLOWER_PLACED = PlacementUtils.register("aaphush_flower_placed",
    ConfiguredFeatureInit.AAPHUSH_FLOWER.placed(RarityFilter.onAverageOnceEvery(18), PlacementUtils.HEIGHTMAP, InSquarePlacement.spread(), BiomeFilter.biome()));


    public static final PlacedFeature WATERPLANT_PLACED  = PlacementUtils.register("waterplant_placed",
            ConfiguredFeatureInit.WATERPLANT.placed(RarityFilter.onAverageOnceEvery(4), InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome()));

    public static final PlacedFeature WATERPLANT_PLACED2  = PlacementUtils.register("waterplant_placed2",
            ConfiguredFeatureInit.WATERPLANT.placed(AquaticPlacements.seagrassPlacement(2)));



// Environment

    public static final PlacedFeature FALLEN_PLACED = PlacementUtils.register("fallen",
            ConfiguredFeatureInit.FALLEN.placed(worldSurfaceSquaredWithCount(1)));

    public static final PlacedFeature FALLEN2_PLACED = PlacementUtils.register("fallen2",
            ConfiguredFeatureInit.FALLEN2.placed(worldSurfaceSquaredWithCount(1)));


    public static final PlacedFeature MAGIC_CRYSTAL_PLACED = PlacementUtils.register("magic_crystal",
            ConfiguredFeatureInit.MAGIC_CRYSTAL.placed(CountPlacement.of(5), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(30)),
                    EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 2),
                    RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));


    public static final PlacedFeature MAGIC_CRYSTAL_PLACED2 = PlacementUtils.register("magic_crystal2",
            ConfiguredFeatureInit.MAGIC_CRYSTAL2.placed(CountPlacement.of(5), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(30)),
                    EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 2),
                    RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));


    public static final PlacedFeature MAGIC_CRYSTAL_PLACED3 = PlacementUtils.register("magic_crystal3",
            ConfiguredFeatureInit.MAGIC_CRYSTAL3.placed(CountPlacement.of(5), InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(30)),
                    EnvironmentScanPlacement.scanningFor(Direction.DOWN,  BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 2),
                    RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));







// Ores

    public static final PlacedFeature JADE_ORE_PLACED = PlacementUtils.register("jade_ore_placed",
            ConfiguredFeatureInit.JADE_ORE.placed(OrePlacementInit.commonOrePlacement(10, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(32)))));

    public static final PlacedFeature JADE_ORE_PLACED2 = PlacementUtils.register("jade_ore_placed2",
            ConfiguredFeatureInit.JADE_ORE.placed(OrePlacementInit.commonOrePlacement(90, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(32), VerticalAnchor.absolute(256)))));

    public static final PlacedFeature JADE_ORE_PLACED3 = PlacementUtils.register("jade_ore_placed3",
            ConfiguredFeatureInit.JADE_ORE.placed(OrePlacementInit.commonOrePlacement(10, // VeinsPerChunk
                     HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(72)))));

    public static final PlacedFeature MYTHRIL_ORE_PLACED = PlacementUtils.register("mythril_ore_placed",
            ConfiguredFeatureInit.MYTHRIL_ORE.placed(OrePlacementInit.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(12)))));

    public static final PlacedFeature MYTHRIL_ORE_PLACED2 = PlacementUtils.register("mythril_ore_placed2",
            ConfiguredFeatureInit.MYTHRIL_ORE.placed(OrePlacementInit.commonOrePlacement(15, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(5)))));

    public static final PlacedFeature MYTHRIL_ORE_PLACED3 = PlacementUtils.register("mythril_ore_placed3",
            ConfiguredFeatureInit.MYTHRIL_ORE.placed(OrePlacementInit.commonOrePlacement(10, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(46)))));

    public static final PlacedFeature STYGIUM_ORE_PLACED = PlacementUtils.register("stygium_ore_placed",
            ConfiguredFeatureInit.STYGIUM_ORE.placed(OrePlacementInit.commonOrePlacement(6, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(16)))));

    public static final PlacedFeature STYGIUM_ORE_PLACED2 = PlacementUtils.register("stygium_ore_placed2",
            ConfiguredFeatureInit.STYGIUM_ORE.placed(OrePlacementInit.rareOrePlacement(8, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final PlacedFeature STYGIUM_ORE_PLACED3 = PlacementUtils.register("stygium_ore_placed3",
            ConfiguredFeatureInit.STYGIUM_ORE.placed(OrePlacementInit.rareOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(80)))));

    public static final PlacedFeature CELESTINE_ORE_PLACED = PlacementUtils.register("celestine_ore_placed",
            ConfiguredFeatureInit.CELESTINE_ORE.placed(OrePlacementInit.commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(16)))));

    public static final PlacedFeature CELESTINE_ORE_PLACED2 = PlacementUtils.register("celestine_ore_placed2",
            ConfiguredFeatureInit.CELESTINE_ORE.placed(OrePlacementInit.rareOrePlacement(8, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final PlacedFeature CELESTINE_ORE_PLACED3 = PlacementUtils.register("celestine_ore_placed3",
            ConfiguredFeatureInit.CELESTINE_ORE.placed(OrePlacementInit.commonOrePlacement(4, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(16)))));

    public static final PlacedFeature ORASINE_ORE_PLACED = PlacementUtils.register("orasine_ore_placed",
            ConfiguredFeatureInit.ORASINE_ORE.placed(OrePlacementInit.commonOrePlacement(10, // VeinsPerChunk
                    PlacementUtils.RANGE_10_10)));

    public static final PlacedFeature EDAPHINE_ORE_PLACED = PlacementUtils.register("edaphine_ore_placed",
            ConfiguredFeatureInit.EDAPHINE_ORE.placed(OrePlacementInit.commonOrePlacement(4, // VeinsPerChunk
                    PlacementUtils.RANGE_10_10)));

    public static final PlacedFeature BRECCIA_STONE_PLACED = PlacementUtils.register("breccia_stone_placed",
            ConfiguredFeatureInit.BRECCIA_STONE.placed(OrePlacementInit.rareOrePlacement(6, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128)))));

    public static final PlacedFeature BRECCIA_STONE_PLACED2 = PlacementUtils.register("breccia_stone_placed",
            ConfiguredFeatureInit.BRECCIA_STONE.placed(OrePlacementInit.commonOrePlacement(2, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60)))));

    public static final PlacedFeature PURGATORY_STONE_PLACED = PlacementUtils.register("purgatory_stone_placed",
            ConfiguredFeatureInit.PURGATORY_STONE.placed(OrePlacementInit.commonOrePlacement(2, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(5), VerticalAnchor.absolute(31)))));



    public static List<PlacementModifier> worldSurfaceSquaredWithCount(int p_195475_) {
        return List.of(CountPlacement.of(p_195475_), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    }









}

