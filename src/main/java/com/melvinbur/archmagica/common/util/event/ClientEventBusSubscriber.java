package com.melvinbur.archmagica.common.util.event;

import com.melvinbur.archmagica.ArchMagica;
import com.melvinbur.archmagica.client.model.SpearEntityRenderer;
import com.melvinbur.archmagica.common.entitytypes.ArmoryEntityTypesInit;
import com.melvinbur.archmagica.core.item.HalberdItem;
import com.melvinbur.archmagica.core.item.ItemInit;
import com.melvinbur.archmagica.core.item.SpearItem;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(
        modid = "archmagica",
        bus = Bus.MOD,
        value = {Dist.CLIENT}
)
public class ClientEventBusSubscriber {
    public ClientEventBusSubscriber() {
    }

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        ArchMagica.LOGGER.debug("Running client setup.");
        EntityRenderers.register((EntityType) ArmoryEntityTypesInit.SPEAR.get(), SpearEntityRenderer::new);
        event.enqueueWork(() -> {



            int var1 = 0;
            int var2;
            for (var2 = 0; var2 < var1; ++var2) {

                HalberdItem[] halberds = new HalberdItem[]{(HalberdItem) ItemInit.IRON_HALBERD.get()};
                HalberdItem[] var7 = halberds;
                var2 = halberds.length;

                int var10;
                for (var10 = 0; var10 < var2; ++var10) {
                    HalberdItem halberdItem = var7[var10];
                    ItemProperties.register(halberdItem, new ResourceLocation("blocking"), (halberdStack, clientLevel, living, k) -> {
                        return living != null && living.isUsingItem() && living.getUseItem() == halberdStack ? 1.0F : 0.0F;
                    });
                }

            SpearItem[] spears = new SpearItem[]{(SpearItem) ItemInit.IRON_SPEAR.get()};
                SpearItem[] var9 = spears;
                var10 = spears.length;

                for (int var11 = 0; var11 < var10; ++var11) {
                    SpearItem spearItem = var9[var11];
                    ItemProperties.register(spearItem, new ResourceLocation("throwing"), (spearStack, clientLevel, living, k) -> {
                        return living != null && living.isUsingItem() && living.getUseItem() == spearStack ? 1.0F : 0.0F;
                    });
                }
            }
        });
    }
}
