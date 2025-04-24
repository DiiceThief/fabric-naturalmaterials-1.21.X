package net.diice.naturalmaterials.datagen;

import net.diice.naturalmaterials.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapelessRecipe;
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

        createStairsRecipe(ModBlocks.PALM_STAIRS, Ingredient.ofItems(ModBlocks.PALM_PLANKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_SLAB, Ingredient.ofItems(ModBlocks.PALM_PLANKS));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.PALM_PRESSURE_PLATE, Ingredient.ofItems(ModBlocks.PALM_PLANKS));
        createTrapdoorRecipe(ModBlocks.PALM_TRAPDOOR, Ingredient.ofItems(ModBlocks.PALM_PLANKS));
        createFenceRecipe(ModBlocks.PALM_FENCE, Ingredient.ofItems(ModBlocks.PALM_PLANKS));
        createFenceGateRecipe(ModBlocks.PALM_FENCE_GATE, Ingredient.ofItems(ModBlocks.PALM_PLANKS));
        createDoorRecipe(ModBlocks.PALM_DOOR, Ingredient.ofItems(ModBlocks.PALM_PLANKS));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PALM_BUTTON, 1)
                        .input(ModBlocks.PALM_PLANKS)
                                .criterion(hasItem(ModBlocks.PALM_PLANKS), conditionsFromItem(ModBlocks.PALM_PLANKS))
                                        .offerTo(recipeExporter);

        createStairsRecipe(ModBlocks.REDWOOD_STAIRS, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REDWOOD_SLAB, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.REDWOOD_PRESSURE_PLATE, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS));
        createDoorRecipe(ModBlocks.REDWOOD_DOOR, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS));
        createTrapdoorRecipe(ModBlocks.REDWOOD_TRAPDOOR, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS));
        createFenceRecipe(ModBlocks.REDWOOD_FENCE, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS));
        createFenceGateRecipe(ModBlocks.REDWOOD_FENCE_GATE, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.REDWOOD_BUTTON, 1)
                .input(ModBlocks.REDWOOD_PLANKS)
            .criterion(hasItem(ModBlocks.REDWOOD_PLANKS), conditionsFromItem(ModBlocks.REDWOOD_PLANKS))
                .offerTo(recipeExporter);

        createStairsRecipe(ModBlocks.CYPRESS_STAIRS, Ingredient.ofItems(ModBlocks.CYPRESS_PLANKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYPRESS_SLAB, Ingredient.ofItems(ModBlocks.CYPRESS_PLANKS));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.CYPRESS_PRESSURE_PLATE, Ingredient.ofItems(ModBlocks.CYPRESS_PLANKS));
        createDoorRecipe(ModBlocks.CYPRESS_DOOR, Ingredient.ofItems(ModBlocks.CYPRESS_PLANKS));
        createTrapdoorRecipe(ModBlocks.CYPRESS_TRAPDOOR, Ingredient.ofItems(ModBlocks.CYPRESS_PLANKS));
        createFenceRecipe(ModBlocks.CYPRESS_FENCE, Ingredient.ofItems(ModBlocks.CYPRESS_PLANKS));
        createFenceGateRecipe(ModBlocks.CYPRESS_FENCE_GATE, Ingredient.ofItems(ModBlocks.CYPRESS_PLANKS));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CYPRESS_BUTTON, 1)
                .input(ModBlocks.CYPRESS_PLANKS)
                .criterion(hasItem(ModBlocks.CYPRESS_PLANKS), conditionsFromItem(ModBlocks.CYPRESS_PLANKS))
                .offerTo(recipeExporter);

        createStairsRecipe(ModBlocks.MANAWOOD_STAIRS, Ingredient.ofItems(ModBlocks.MANAWOOD_PLANKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANAWOOD_SLAB, Ingredient.ofItems(ModBlocks.MANAWOOD_PLANKS));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.MANAWOOD_PRESSURE_PLATE, Ingredient.ofItems(ModBlocks.MANAWOOD_PRESSURE_PLATE));
        createDoorRecipe(ModBlocks.MANAWOOD_DOOR, Ingredient.ofItems(ModBlocks.MANAWOOD_PLANKS));
        createTrapdoorRecipe(ModBlocks.MANAWOOD_TRAPDOOR, Ingredient.ofItems(ModBlocks.MANAWOOD_PLANKS));
        createFenceRecipe(ModBlocks.MANAWOOD_FENCE, Ingredient.ofItems(ModBlocks.MANAWOOD_PLANKS));
        createFenceGateRecipe(ModBlocks.MANAWOOD_FENCE_GATE, Ingredient.ofItems(ModBlocks.MANAWOOD_PLANKS));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.MANAWOOD_BUTTON, 1)
                .input(ModBlocks.MANAWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.MANAWOOD_PLANKS), conditionsFromItem(ModBlocks.MANAWOOD_PLANKS))
                .offerTo(recipeExporter);

        createStairsRecipe(ModBlocks.DUSKSLATE_STAIRS, Ingredient.ofItems(ModBlocks.DUSKSLATE));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DUSKSLATE_SLAB, Ingredient.ofItems(ModBlocks.DUSKSLATE));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DUSKSLATE_BUTTON, 1)
                .input(ModBlocks.DUSKSLATE)
                .criterion(hasItem(ModBlocks.DUSKSLATE), conditionsFromItem(ModBlocks.DUSKSLATE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DUSKSLATE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.DUSKSLATE)
                .criterion(hasItem(ModBlocks.DUSKSLATE), conditionsFromItem(ModBlocks.DUSKSLATE))
                .offerTo(recipeExporter);

    }
}
