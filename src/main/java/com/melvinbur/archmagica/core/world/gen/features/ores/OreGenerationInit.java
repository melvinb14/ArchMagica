package com.melvinbur.archmagica.core.world.gen.features.ores;


import com.melvinbur.archmagica.core.world.PlacementFeaturesInit;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import java.util.List;
import java.util.function.Supplier;

public class OreGenerationInit {

        @SubscribeEvent
        public static void generateOres(final BiomeLoadingEvent biome) {
                List<Supplier<PlacedFeature>> base =
                        biome.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);


                if (biome.getCategory() == Biome.BiomeCategory.NETHER) {
                        base.add(() -> PlacementFeaturesInit.ORASINE_ORE_PLACED);
                        base.add(() -> PlacementFeaturesInit.PURGATORY_STONE_PLACED);

                } else if (biome.getCategory() == Biome.BiomeCategory.THEEND) {
                        base.add(() -> PlacementFeaturesInit.EDAPHINE_ORE_PLACED);

                } else {
                        base.add(() -> PlacementFeaturesInit.JADE_ORE_PLACED);
                        base.add(() -> PlacementFeaturesInit.JADE_ORE_PLACED2);
                        base.add(() -> PlacementFeaturesInit.JADE_ORE_PLACED3);
                        base.add(() -> PlacementFeaturesInit.MYTHRIL_ORE_PLACED);
                        base.add(() -> PlacementFeaturesInit.MYTHRIL_ORE_PLACED2);
                        base.add(() -> PlacementFeaturesInit.MYTHRIL_ORE_PLACED3);
                        base.add(() -> PlacementFeaturesInit.STYGIUM_ORE_PLACED);
                        base.add(() -> PlacementFeaturesInit.STYGIUM_ORE_PLACED2);
                        base.add(() -> PlacementFeaturesInit.STYGIUM_ORE_PLACED3);
                        base.add(() -> PlacementFeaturesInit.BRECCIA_STONE_PLACED);
                        base.add(() -> PlacementFeaturesInit.BRECCIA_STONE_PLACED2);

                }


                if (biome.getCategory() == Biome.BiomeCategory.ICY) {
                        base.add(() -> PlacementFeaturesInit.CELESTINE_ORE_PLACED);
                        base.add(() -> PlacementFeaturesInit.CELESTINE_ORE_PLACED2);
                        base.add(() -> PlacementFeaturesInit.CELESTINE_ORE_PLACED3);


                }


        }
}



