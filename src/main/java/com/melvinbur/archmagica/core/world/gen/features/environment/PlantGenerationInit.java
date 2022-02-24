package com.melvinbur.archmagica.core.world.gen.features.environment;

import com.melvinbur.archmagica.core.world.PlacementFeaturesInit;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.function.Supplier;

public class PlantGenerationInit {

    public static void generatePlants(final BiomeLoadingEvent biome) {
        List<Supplier<PlacedFeature>> base =
                biome.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);


        if (biome.getCategory() == Biome.BiomeCategory.RIVER) {
            base.add(() -> PlacementFeaturesInit.WATERPLANT_PLACED);




        }


        else if (biome.getCategory() == Biome.BiomeCategory.SWAMP) {
            base.add(() -> PlacementFeaturesInit.WATERPLANT_PLACED2);



        }


    }
}



