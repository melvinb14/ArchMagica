package com.melvinbur.archmagica.core.world;


import com.melvinbur.archmagica.core.world.gen.features.ores.OrePlacementInit;

import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.AquaticPlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;

import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;


public class PlacementFeaturesInit {

// Trees

    public static final Holder<PlacedFeature> CORRUPTED_PLACED =
            PlacementUtils.register("corrupted_placed",
                    ConfiguredFeatureInit.CORRUPTED_SPAWN, VegetationPlacements.treePlacement(
                            PlacementUtils.countExtra(1, 0.1f, 2)));

// Vegetation
    public static final Holder<PlacedFeature> AAPHUSH_FLOWER_PLACED = PlacementUtils.register("aaphush_flower_placed",
    ConfiguredFeatureInit.AAPHUSH_FLOWER, RarityFilter.onAverageOnceEvery(18), PlacementUtils.HEIGHTMAP, InSquarePlacement.spread(), BiomeFilter.biome());


    public static final Holder<PlacedFeature> WATERPLANT_PLACED  = PlacementUtils.register("waterplant_placed",
            ConfiguredFeatureInit.WATERPLANT, RarityFilter.onAverageOnceEvery(4), InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome());

    public static final Holder<PlacedFeature> WATERPLANT_PLACED2  = PlacementUtils.register("waterplant_placed2",
            ConfiguredFeatureInit.WATERPLANT, (AquaticPlacements.seagrassPlacement(2)));





// Environment


    public static final Holder<PlacedFeature> FALLEN_PLACED = PlacementUtils.register("fallen",
            ConfiguredFeatureInit.FALLEN, (worldSurfaceSquaredWithCount(1)));

    public static final Holder<PlacedFeature> FALLEN2_PLACED = PlacementUtils.register("fallen2",
            ConfiguredFeatureInit.FALLEN2, (worldSurfaceSquaredWithCount(1)));


    public static final Holder<PlacedFeature> MAGIC_CRYSTAL_PLACED = PlacementUtils.register("magic_crystal",
            ConfiguredFeatureInit.MAGIC_CRYSTAL, CountPlacement.of(5), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(30)),
                    EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 2),
                    RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome());


    public static final Holder<PlacedFeature> MAGIC_CRYSTAL_PLACED2 = PlacementUtils.register("magic_crystal2",
            ConfiguredFeatureInit.MAGIC_CRYSTAL2, CountPlacement.of(5), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(30)),
                    EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 2),
                    RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome());


    public static final Holder<PlacedFeature> MAGIC_CRYSTAL_PLACED3 = PlacementUtils.register("magic_crystal3",
            ConfiguredFeatureInit.MAGIC_CRYSTAL3, CountPlacement.of(5), InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(30)),
                    EnvironmentScanPlacement.scanningFor(Direction.DOWN,  BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 2),
                    RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome());







// Ores

    public static final Holder<PlacedFeature> JADE_ORE_PLACED = PlacementUtils.register("jade_ore_placed",
            ConfiguredFeatureInit.JADE_ORE, OrePlacementInit.commonOrePlacement(10, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(32))));

    public static final Holder<PlacedFeature>  JADE_ORE_PLACED2 = PlacementUtils.register("jade_ore_placed2",
            ConfiguredFeatureInit.JADE_ORE, OrePlacementInit.commonOrePlacement(90, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(32), VerticalAnchor.absolute(256))));

    public static final Holder<PlacedFeature> JADE_ORE_PLACED3 = PlacementUtils.register("jade_ore_placed3",
            ConfiguredFeatureInit.JADE_ORE, OrePlacementInit.commonOrePlacement(10, // VeinsPerChunk
                     HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(72))));

    public static final Holder<PlacedFeature> MYTHRIL_ORE_PLACED = PlacementUtils.register("mythril_ore_placed",
            ConfiguredFeatureInit.MYTHRIL_ORE, OrePlacementInit.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(12))));

    public static final Holder<PlacedFeature> MYTHRIL_ORE_PLACED2 = PlacementUtils.register("mythril_ore_placed2",
            ConfiguredFeatureInit.MYTHRIL_ORE, OrePlacementInit.commonOrePlacement(15, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(5))));

    public static final Holder<PlacedFeature> MYTHRIL_ORE_PLACED3 = PlacementUtils.register("mythril_ore_placed3",
            ConfiguredFeatureInit.MYTHRIL_ORE,OrePlacementInit.commonOrePlacement(10, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(46))));

    public static final Holder<PlacedFeature> STYGIUM_ORE_PLACED = PlacementUtils.register("stygium_ore_placed",
            ConfiguredFeatureInit.STYGIUM_ORE, OrePlacementInit.commonOrePlacement(6, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(16))));

    public static final Holder<PlacedFeature> STYGIUM_ORE_PLACED2 = PlacementUtils.register("stygium_ore_placed2",
            ConfiguredFeatureInit.STYGIUM_ORE, OrePlacementInit.rareOrePlacement(8, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> STYGIUM_ORE_PLACED3 = PlacementUtils.register("stygium_ore_placed3",
            ConfiguredFeatureInit.STYGIUM_ORE, OrePlacementInit.rareOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> CELESTINE_ORE_PLACED = PlacementUtils.register("celestine_ore_placed",
            ConfiguredFeatureInit.CELESTINE_ORE, OrePlacementInit.commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(16))));

    public static final Holder<PlacedFeature> CELESTINE_ORE_PLACED2 = PlacementUtils.register("celestine_ore_placed2",
            ConfiguredFeatureInit.CELESTINE_ORE, OrePlacementInit.rareOrePlacement(8, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> CELESTINE_ORE_PLACED3 = PlacementUtils.register("celestine_ore_placed3",
            ConfiguredFeatureInit.CELESTINE_ORE, OrePlacementInit.commonOrePlacement(4, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(16))));

    public static final Holder<PlacedFeature> ORASINE_ORE_PLACED = PlacementUtils.register("orasine_ore_placed",
            ConfiguredFeatureInit.ORASINE_ORE, OrePlacementInit.commonOrePlacement(10, // VeinsPerChunk
                    PlacementUtils.RANGE_10_10));

    public static final Holder<PlacedFeature> EDAPHINE_ORE_PLACED = PlacementUtils.register("edaphine_ore_placed",
            ConfiguredFeatureInit.EDAPHINE_ORE, OrePlacementInit.commonOrePlacement(4, // VeinsPerChunk
                    PlacementUtils.RANGE_10_10));

    public static final Holder<PlacedFeature> BRECCIA_STONE_PLACED = PlacementUtils.register("breccia_stone_placed",
            ConfiguredFeatureInit.BRECCIA_STONE, OrePlacementInit.rareOrePlacement(6, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128))));

    public static final Holder<PlacedFeature> BRECCIA_STONE_PLACED2 = PlacementUtils.register("breccia_stone_placed",
            ConfiguredFeatureInit.BRECCIA_STONE, OrePlacementInit.commonOrePlacement(2, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));

    public static final Holder<PlacedFeature> PURGATORY_STONE_PLACED = PlacementUtils.register("purgatory_stone_placed",
            ConfiguredFeatureInit.PURGATORY_STONE, OrePlacementInit.commonOrePlacement(2, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(5), VerticalAnchor.absolute(31))));





    public static List<PlacementModifier> worldSurfaceSquaredWithCount(int p_195475_) {
        return List.of(CountPlacement.of(p_195475_), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    }









}

