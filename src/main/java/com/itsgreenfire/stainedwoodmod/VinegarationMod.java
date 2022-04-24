package com.itsgreenfire.stainedwoodmod;

import com.itsgreenfire.stainedwoodmod.block.StainedPlanks;
import com.itsgreenfire.stainedwoodmod.block.entity.ModBlockEntities;
import com.itsgreenfire.stainedwoodmod.item.StainedItems;
import com.itsgreenfire.stainedwoodmod.recipe.StainedRecipes;
import com.itsgreenfire.stainedwoodmod.screen.ModMenuTypes;
import com.itsgreenfire.stainedwoodmod.screen.PicklingStationScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(VinegarationMod.MOD_ID)
public class VinegarationMod
{
    public static final String MOD_ID = "stainedwoodmod";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogManager.getLogger();

    public VinegarationMod() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        StainedItems.register(eventBus);
        StainedPlanks.register(eventBus);

        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);

        StainedRecipes.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void clientSetup(final FMLClientSetupEvent event) {
        MenuScreens.register(ModMenuTypes.PICKLING_STATION_MENU.get(), PicklingStationScreen::new);

        ItemBlockRenderTypes.setRenderLayer(StainedPlanks.PICKLING_STATION.get(), RenderType.translucent());
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("Don't Drink Vinegar. Apply it to wood instead :)");
    }
}
