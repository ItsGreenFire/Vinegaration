package com.itsgreenfire.stainedwoodmod.item;

import com.itsgreenfire.stainedwoodmod.VinegarationMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class StainedItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VinegarationMod.MOD_ID);

    public static final RegistryObject<Item> VINEGAR_ITEM = ITEMS.register("vinegar_item",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> VINEGAR_BUCKET = ITEMS.register("vinegar_bucket",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
