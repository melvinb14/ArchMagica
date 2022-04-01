package com.melvinbur.archmagica.common.util.event;

import com.melvinbur.archmagica.ArchMagica;
import com.melvinbur.archmagica.core.item.HalberdItem;
import com.melvinbur.archmagica.core.item.ItemInit;


import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;


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

        event.enqueueWork(() -> {



            int var1 = 0;
            int var2;
            for (var2 = 0; var2 < var1; ++var2) {

                HalberdItem[] halberds = new HalberdItem[]{(HalberdItem)
                        ItemInit.IRON_HALBERD.get(), (HalberdItem)ItemInit.DIAMOND_HALBERD.get(), (HalberdItem)ItemInit.JADE_HALBERD.get(),
                        (HalberdItem)ItemInit.STEEL_HALBERD.get(), (HalberdItem)ItemInit.MYTHRIL_HALBERD.get(), (HalberdItem)ItemInit.ORASINE_HALBERD.get(), (HalberdItem)ItemInit.STYGIUM_HALBERD.get()};
                HalberdItem[] var7 = halberds;
                var2 = halberds.length;

                int var10;
                for (var10 = 0; var10 < var2; ++var10) {
                    HalberdItem halberdItem = var7[var10];
                    ItemProperties.register(halberdItem, new ResourceLocation("blocking"), (halberdStack, clientLevel, living, k) -> {
                        return living != null && living.isUsingItem() && living.getUseItem() == halberdStack ? 1.0F : 0.0F;
                    });
                }


            }
        });
    }
}
