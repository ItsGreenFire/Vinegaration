package com.itsgreenfire.stainedwoodmod.data;

import com.itsgreenfire.stainedwoodmod.VinegarationMod;
import com.itsgreenfire.stainedwoodmod.block.StainedPlanks;
import com.itsgreenfire.stainedwoodmod.item.StainedItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapelessRecipeBuilder.shapeless(StainedPlanks.STAINED_OAK_PLANKS.get())
            .requires(Items.OAK_PLANKS, 1)
            .requires(StainedItems.VINEGAR_ITEM.get(), 1)
            .unlockedBy("has_material", has(StainedItems.VINEGAR_ITEM.get()))
            .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(StainedPlanks.STAINED_OAK_SLAB.get())
            .define('O', StainedPlanks.STAINED_OAK_PLANKS.get())
            .pattern("OOO")
            .pattern("   ")
            .pattern("   ")
            .unlockedBy("has_material", has(StainedPlanks.STAINED_OAK_PLANKS.get()))
            .save(pFinishedRecipeConsumer, modId("stained_oak_slab"));
    }

    private static ResourceLocation modId(String path) {
        return new ResourceLocation(VinegarationMod.MOD_ID, path);
    }
}
