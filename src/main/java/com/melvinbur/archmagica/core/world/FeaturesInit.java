package com.melvinbur.archmagica.core.world;

import com.melvinbur.archmagica.core.world.gen.features.SimpleBlockMatchWaterFeature;
import com.melvinbur.archmagica.core.world.gen.features.stateproviders.DirectionalStateProvider;
import net.minecraft.resources.ResourceLocation;

import java.util.ArrayList;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProviderType;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;


@EventBusSubscriber(
        modid = "archmagica",
        bus = Bus.MOD
)
public class FeaturesInit {
    public static final ArrayList<Feature<?>> FEATURES = new ArrayList();

    public static final Feature<SimpleBlockConfiguration> SIMPLE_BLOCK_MATCH_WATER;


    public FeaturesInit() {
    }

    private static <FC extends FeatureConfiguration> Feature<FC> registerFeature(String name, Feature<FC> feature) {
        feature.setRegistryName(new ResourceLocation("archmagica", name));
        FEATURES.add(feature);
        return feature;
    }

    @SubscribeEvent
    public static void registerFeatures(Register<Feature<?>> event) {
        FEATURES.forEach((feature) -> {
            event.getRegistry().register(feature);
        });
    }

    static {

        SIMPLE_BLOCK_MATCH_WATER = registerFeature("simple_block_match_water", new SimpleBlockMatchWaterFeature(SimpleBlockConfiguration.CODEC));

    }

    @EventBusSubscriber(
            modid = "archmagica",
            bus = Bus.MOD
    )
    public static class StateProviders {
        public static final BlockStateProviderType<?> DIRECTIONAL_STATE_PROVIDER;

        public StateProviders() {
        }

        @SubscribeEvent
        public static void registerFeatures(Register<BlockStateProviderType<?>> event) {
            event.getRegistry().registerAll(new BlockStateProviderType[]{DIRECTIONAL_STATE_PROVIDER});
        }

        static {
            DIRECTIONAL_STATE_PROVIDER = (BlockStateProviderType)(new BlockStateProviderType(DirectionalStateProvider.CODEC))
                    .setRegistryName(new ResourceLocation("archmagica", "directional_state_provider"));
        }
    }
}
