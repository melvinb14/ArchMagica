package com.melvinbur.archmagica;


import com.melvinbur.archmagica.client.sound.SoundsInit;
import com.melvinbur.archmagica.core.block.BlockInit;
import com.melvinbur.archmagica.core.block.WoodTypeInit;

import com.melvinbur.archmagica.core.item.ItemInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

import net.minecraft.client.renderer.Sheets;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.MinecraftForge;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;





@Mod(ArchMagica.MOD_ID)
public class ArchMagica {
    public static final String MOD_ID = "archmagica";

    // Directly reference a log4j logger.






    public ArchMagica() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.register(eventBus);
        ItemInit.register(eventBus);

        SoundsInit.register(eventBus);




        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CORRUPTED_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CORRUPTED_TRAPDOOR.get(), RenderType.cutout());


        ItemBlockRenderTypes.setRenderLayer(BlockInit.AAPHUSH_FLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_AAPHUSH_FLOWER.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.CORRUPTED_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CORRUPTED_SAPLING.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.WITCH_OVEN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKSMITH_ANVIL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.MAGIC_CRYSTAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.MAGIC_CRYSTAL2.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.MAGIC_CRYSTAL3.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.FALLEN_ADVENTURER1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.FALLEN_ADVENTURER2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.WATERPLANT.get(), RenderType.cutout());



        WoodType.register(WoodTypeInit.CORRUPTED);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.AAPHUSH_FLOWER.getId(), BlockInit.POTTED_AAPHUSH_FLOWER);
            Sheets.addWoodType(WoodTypeInit.CORRUPTED);
        });


    }
}