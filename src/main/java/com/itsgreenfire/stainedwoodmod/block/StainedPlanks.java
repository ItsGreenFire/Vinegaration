package com.itsgreenfire.stainedwoodmod.block;

import com.itsgreenfire.stainedwoodmod.CustomCreativeTab;
import com.itsgreenfire.stainedwoodmod.VinegarationMod;
import com.itsgreenfire.stainedwoodmod.block.custom.PicklingStationBlock;
import com.itsgreenfire.stainedwoodmod.item.StainedItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class StainedPlanks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, VinegarationMod.MOD_ID);

    //Stairs
    public static final RegistryObject<Block> STAINED_OAK_STAIRS = registerBlock("stained_oak_stairs",
            () -> new StairBlock(() -> StainedPlanks.STAINED_OAK_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), 
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_BIRCH_STAIRS = registerBlock("stained_birch_stairs",
            () -> new StairBlock(() -> StainedPlanks.STAINED_OAK_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_JUNGLE_STAIRS = registerBlock("stained_jungle_stairs",
            () -> new StairBlock(() -> StainedPlanks.STAINED_OAK_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_SPRUCE_STAIRS = registerBlock("stained_spruce_stairs",
            () -> new StairBlock(() -> StainedPlanks.STAINED_OAK_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_DARK_OAK_STAIRS = registerBlock("stained_dark_oak_stairs",
            () -> new StairBlock(() -> StainedPlanks.STAINED_OAK_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_ACACIA_STAIRS = registerBlock("stained_acacia_stairs",
            () -> new StairBlock(() -> StainedPlanks.STAINED_OAK_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);


    // Slabs
    public static final RegistryObject<Block> STAINED_OAK_SLAB = registerBlock("stained_oak_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_BIRCH_SLAB = registerBlock("stained_birch_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_JUNGLE_SLAB = registerBlock("stained_jungle_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_SPRUCE_SLAB = registerBlock("stained_spruce_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_DARK_OAK_SLAB = registerBlock("stained_dark_oak_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_ACACIA_SLAB = registerBlock("stained_acacia_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);


    // Fences
    public static final RegistryObject<Block> STAINED_OAK_FENCE = registerBlock("stained_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_BIRCH_FENCE = registerBlock("stained_birch_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_JUNGLE_FENCE = registerBlock("stained_jungle_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_SPRUCE_FENCE = registerBlock("stained_spruce_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_DARK_OAK_FENCE = registerBlock("stained_dark_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_ACACIA_FENCE = registerBlock("stained_acacia_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);


    // Gates
    public static final RegistryObject<Block> STAINED_OAK_GATE = registerBlock("stained_oak_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_BIRCH_GATE = registerBlock("stained_birch_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_JUNGLE_GATE = registerBlock("stained_jungle_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_SPRUCE_GATE = registerBlock("stained_spruce_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_DARK_OAK_GATE = registerBlock("stained_dark_oak_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);
    public static final RegistryObject<Block> STAINED_ACACIA_GATE = registerBlock("stained_acacia_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)),
            CustomCreativeTab.STAINED_WOOD_TAB);


    // Blocks

    public static final RegistryObject<Block> STAINED_OAK_PLANKS = registerBlock("stained_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), CustomCreativeTab.STAINED_WOOD_TAB);

    public static final RegistryObject<Block> STAINED_SPRUCE_PLANKS = registerBlock("stained_spruce_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), CustomCreativeTab.STAINED_WOOD_TAB);

    public static final RegistryObject<Block> STAINED_DARK_OAK_PLANKS = registerBlock("stained_dark_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), CustomCreativeTab.STAINED_WOOD_TAB);

    public static final RegistryObject<Block> STAINED_BIRCH_PLANKS = registerBlock("stained_birch_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), CustomCreativeTab.STAINED_WOOD_TAB);

    public static final RegistryObject<Block> STAINED_JUNGLE_PLANKS = registerBlock("stained_jungle_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), CustomCreativeTab.STAINED_WOOD_TAB);

    public static final RegistryObject<Block> STAINED_ACACIA_PLANKS = registerBlock("stained_acacia_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), CustomCreativeTab.STAINED_WOOD_TAB);

    // Stations

    public static final RegistryObject<Block> PICKLING_STATION = registerBlock("pickling_station",
            () -> new PicklingStationBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            CustomCreativeTab.STAINED_WOOD_TAB);

    // Registry & Boring Stuff

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return StainedItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }
}
