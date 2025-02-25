package net.diice.naturalmaterials.datagen;

import net.diice.naturalmaterials.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import org.apache.commons.codec.digest.Md5Crypt;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        createStairsRecipe(ModBlocks.PALM_DOOR, Ingredient.ofItems(ModBlocks.PALM_PLANKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_SLAB, Ingredient.ofItems(ModBlocks.PALM_PLANKS));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.PALM_PRESSURE_PLATE, Ingredient.ofItems(ModBlocks.PALM_PLANKS));
        createTrapdoorRecipe(ModBlocks.PALM_TRAPDOOR, Ingredient.ofItems(ModBlocks.PALM_PLANKS));
        createFenceRecipe(ModBlocks.PALM_FENCE, Ingredient.ofItems(ModBlocks.PALM_PLANKS));
        createFenceGateRecipe(ModBlocks.PALM_FENCE_GATE, Ingredient.ofItems(ModBlocks.PALM_PLANKS));
        createDoorRecipe(ModBlocks.PALM_DOOR, Ingredient.ofItems(ModBlocks.PALM_PLANKS));

        createStairsRecipe(ModBlocks.REDWOOD_STAIRS, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REDWOOD_SLAB, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.REDWOOD_PRESSURE_PLATE, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS));
        createDoorRecipe(ModBlocks.REDWOOD_DOOR, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS));
        createTrapdoorRecipe(ModBlocks.REDWOOD_TRAPDOOR, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS));
        createFenceRecipe(ModBlocks.REDWOOD_FENCE, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS));
        createFenceGateRecipe(ModBlocks.REDWOOD_FENCE_GATE, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS));

    }
}
