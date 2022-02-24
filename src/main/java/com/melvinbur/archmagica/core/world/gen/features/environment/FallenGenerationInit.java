package com.melvinbur.archmagica.core.world.gen.features.environment;

import com.melvinbur.archmagica.core.world.PlacementFeaturesInit;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

import java.util.function.Supplier;

public class FallenGenerationInit {

    public static void generateFallen(final BiomeLoadingEvent biome) {
        List<Supplier<PlacedFeature>> base =
                biome.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);




        if (biome.getCategory() == Biome.BiomeCategory.FOREST) {
            base.add(() -> PlacementFeaturesInit.FALLEN_PLACED);


        }


        else if (biome.getCategory() == Biome.BiomeCategory.JUNGLE) {
            base.add(() -> PlacementFeaturesInit.FALLEN_PLACED);

        } else {
            base.add(() -> PlacementFeaturesInit.FALLEN2_PLACED);



        }


    }
}



