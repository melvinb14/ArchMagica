package com.melvinbur.archmagica.common.entitytypes;

import com.melvinbur.archmagica.ArchMagica;
import com.melvinbur.archmagica.common.entity.SpearEntity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType.Builder;
import net.minecraftforge.registries.ForgeRegistries;




public class ArmoryEntityTypesInit {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES;
    public static final RegistryObject<EntityType<SpearEntity>> SPEAR;


    public ArmoryEntityTypesInit() {
    }

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

    private static <T extends Entity> RegistryObject<EntityType<T>> registerEntityType(String registryName, Builder<T> builder) {
        return ENTITY_TYPES.register(registryName, () -> {
            return builder.build(registryName);
        });
    }

    static {
        ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, ArchMagica.MOD_ID);
        SPEAR = registerEntityType("spear", Builder.of(SpearEntity::new,  MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20));
    }
}
