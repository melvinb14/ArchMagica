package com.melvinbur.archmagica.common.entitytypes;

import com.melvinbur.archmagica.ArchMagica;
import com.melvinbur.archmagica.core.block.BlockInit;



import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class BlockEntitiesInit {


    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ArchMagica.MOD_ID);

    public static final RegistryObject<BlockEntityType<SignBlockEntityInit>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("sign_block_entity", () ->
                    BlockEntityType.Builder.of(SignBlockEntityInit::new,
                            BlockInit.CORRUPTED_WALL_SIGN.get(),
                            BlockInit.CORRUPTED_SIGN.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}