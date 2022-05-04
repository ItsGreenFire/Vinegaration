package com.itsgreenfire.stainedwoodmod.data;

import com.itsgreenfire.stainedwoodmod.block.StainedPlanks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        super.addTables();
        // Other


        // Oak
        this.dropSelf(StainedPlanks.STAINED_OAK_PLANKS.get());
        this.dropSelf(StainedPlanks.STAINED_OAK_SLAB.get());
        this.dropSelf(StainedPlanks.STAINED_OAK_STAIRS.get());

        // Dark Oak
        this.dropSelf(StainedPlanks.STAINED_DARK_OAK_PLANKS.get());

        // Acacia
        this.dropSelf(StainedPlanks.STAINED_ACACIA_PLANKS.get());

        // Jungle
        this.dropSelf(StainedPlanks.STAINED_JUNGLE_PLANKS.get());

        // Birch
        this.dropSelf(StainedPlanks.STAINED_BIRCH_PLANKS.get());

        // Spruce
        this.dropSelf(StainedPlanks.STAINED_SPRUCE_PLANKS.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return StainedPlanks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
