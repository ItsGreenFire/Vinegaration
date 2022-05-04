package com.itsgreenfire.stainedwoodmod.event.loot;

import com.itsgreenfire.stainedwoodmod.VinegarationMod;
import com.itsgreenfire.stainedwoodmod.recipe.PicklingStationRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = VinegarationMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class StainedEventBusEvents {
    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, PicklingStationRecipe.Type.ID, PicklingStationRecipe.Type.INSTANCE);
    }
}
