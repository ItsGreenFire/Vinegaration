package com.itsgreenfire.stainedwoodmod.block.entity;

import com.itsgreenfire.stainedwoodmod.VinegarationMod;
import com.itsgreenfire.stainedwoodmod.block.StainedPlanks;
import com.itsgreenfire.stainedwoodmod.block.entity.custom.PicklingStationBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, VinegarationMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<PicklingStationBlockEntity>> PICKLING_STATION_BLOCK_ENTITY =
        BLOCK_ENTITIES.register("pickling_station_block_entity", () ->
                BlockEntityType.Builder.of(PicklingStationBlockEntity::new,
                        StainedPlanks.PICKLING_STATION.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
