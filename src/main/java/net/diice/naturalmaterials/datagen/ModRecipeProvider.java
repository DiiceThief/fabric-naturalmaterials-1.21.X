package net.diice.naturalmaterials.datagen;

import net.diice.naturalmaterials.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        createStairsRecipe(ModBlocks.PALM_DOOR, Ingredient.ofItems(ModBlocks.PALM_PLANKS)).offerTo(recipeExporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_SLAB, Ingredient.ofItems(ModBlocks.PALM_PLANKS)).offerTo(recipeExporter);
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.PALM_PRESSURE_PLATE, Ingredient.ofItems(ModBlocks.PALM_PLANKS)).offerTo(recipeExporter);
        createDoorRecipe(ModBlocks.PALM_DOOR, Ingredient.ofItems(ModBlocks.PALM_PLANKS)).offerTo(recipeExporter);
        createTrapdoorRecipe(ModBlocks.PALM_TRAPDOOR, Ingredient.ofItems(ModBlocks.PALM_PLANKS)).offerTo(recipeExporter);
        createFenceRecipe(ModBlocks.PALM_FENCE, Ingredient.ofItems(ModBlocks.PALM_PLANKS)).offerTo(recipeExporter);
        createFenceGateRecipe(ModBlocks.PALM_FENCE_GATE, Ingredient.ofItems(ModBlocks.PALM_PLANKS)).offerTo(recipeExporter);

        createStairsRecipe(ModBlocks.REDWOOD_DOOR, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS)).offerTo(recipeExporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REDWOOD_SLAB, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS)).offerTo(recipeExporter);
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.REDWOOD_PRESSURE_PLATE, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS)).offerTo(recipeExporter);
        createDoorRecipe(ModBlocks.REDWOOD_DOOR, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS)).offerTo(recipeExporter);
        createTrapdoorRecipe(ModBlocks.REDWOOD_TRAPDOOR, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS)).offerTo(recipeExporter);
        createFenceRecipe(ModBlocks.REDWOOD_FENCE, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS)).offerTo(recipeExporter);
        createFenceGateRecipe(ModBlocks.REDWOOD_FENCE_GATE, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS)).offerTo(recipeExporter);

    }
}
