package com.melvinbur.archmagica.core.world.gen.features.caves;


import com.melvinbur.archmagica.core.world.PlacementFeaturesInit;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.List;
import java.util.function.Supplier;

public class CaveGenerationInit {

        @SubscribeEvent
        public static void generateCaves(final BiomeLoadingEvent biome) {
                List<Supplier<PlacedFeature>> base =
                        biome.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_DECORATION);


                if (biome.getCategory() == Biome.BiomeCategory.ICY) {
                        base.add(() -> PlacementFeaturesInit.MAGIC_CRYSTAL_PLACED2);

                } else if(biome.getCategory() == Biome.BiomeCategory.OCEAN) {
                        base.add(() -> PlacementFeaturesInit.MAGIC_CRYSTAL_PLACED);

                } else {
                        base.add(() -> PlacementFeaturesInit.MAGIC_CRYSTAL_PLACED3);


                }
        }
}



