package com.melvinbur.archmagica.core.world;


import com.melvinbur.archmagica.ArchMagica;
import com.melvinbur.archmagica.core.world.gen.features.caves.CaveGenerationInit;
import com.melvinbur.archmagica.core.world.gen.features.environment.FallenGenerationInit;
import com.melvinbur.archmagica.core.world.gen.features.flower.FlowerGenerationInit;
import com.melvinbur.archmagica.core.world.gen.features.environment.PlantGenerationInit;
import com.melvinbur.archmagica.core.world.gen.features.ores.OreGenerationInit;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ArchMagica.MOD_ID)
public class WorldEventInit {

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        OreGenerationInit.generateOres(event);
        CaveGenerationInit.generateCaves(event);


        FallenGenerationInit.generateFallen(event);
        PlantGenerationInit.generatePlants(event);
        FlowerGenerationInit.generateFlowers(event);
    }
}



