package com.itsgreenfire.stainedwoodmod;

import com.itsgreenfire.stainedwoodmod.block.StainedPlanks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CustomCreativeTab {
    public static final CreativeModeTab STAINED_WOOD_TAB = new CreativeModeTab("stained_wood_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(StainedPlanks.STAINED_OAK_PLANKS.get());
        }
    };
}
