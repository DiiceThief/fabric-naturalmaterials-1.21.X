package net.diice.naturalmaterials.datagen;

import net.diice.naturalmaterials.NaturalMaterials;
import net.diice.naturalmaterials.block.ModBlocks;
import net.diice.naturalmaterials.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import org.apache.commons.codec.digest.Md5Crypt;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        offerSmithingTrimRecipe(recipeExporter, ModItems.HUNTER_SMITHING_TEMPLATE, Identifier.of(NaturalMaterials.MOD_ID, "hunter"));

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
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.PALM_LOG)
                .criterion(hasItem(ModBlocks.PALM_LOG), conditionsFromItem(ModBlocks.PALM_LOG))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_PALM_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.STRIPPED_PALM_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_PALM_LOG), conditionsFromItem(ModBlocks.STRIPPED_PALM_LOG))
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REDWOOD_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.REDWOOD_LOG)
                .criterion(hasItem(ModBlocks.REDWOOD_LOG), conditionsFromItem(ModBlocks.REDWOOD_LOG))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_REDWOOD_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.STRIPPED_REDWOOD_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_REDWOOD_LOG), conditionsFromItem(ModBlocks.STRIPPED_REDWOOD_LOG))
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYPRESS_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.CYPRESS_LOG)
                .criterion(hasItem(ModBlocks.CYPRESS_LOG), conditionsFromItem(ModBlocks.CYPRESS_LOG))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CYPRESS_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.STRIPPED_CYPRESS_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_CYPRESS_LOG), conditionsFromItem(ModBlocks.STRIPPED_CYPRESS_LOG))
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANAWOOD_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.MANAWOOD_LOG)
                .criterion(hasItem(ModBlocks.MANAWOOD_LOG), conditionsFromItem(ModBlocks.MANAWOOD_LOG))
                .offerTo(recipeExporter);

        createStairsRecipe(ModBlocks.GLOOMWOOD_STAIRS, Ingredient.ofItems(ModBlocks.GLOOMWOOD_PLANKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLOOMWOOD_SLAB, Ingredient.ofItems(ModBlocks.GLOOMWOOD_PLANKS));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.GLOOMWOOD_PRESSURE_PLATE, Ingredient.ofItems(ModBlocks.GLOOMWOOD_PRESSURE_PLATE));
        createDoorRecipe(ModBlocks.GLOOMWOOD_DOOR, Ingredient.ofItems(ModBlocks.GLOOMWOOD_PLANKS));
        createTrapdoorRecipe(ModBlocks.GLOOMWOOD_TRAPDOOR, Ingredient.ofItems(ModBlocks.GLOOMWOOD_PLANKS));
        createFenceRecipe(ModBlocks.GLOOMWOOD_FENCE, Ingredient.ofItems(ModBlocks.GLOOMWOOD_PLANKS));
        createFenceGateRecipe(ModBlocks.GLOOMWOOD_FENCE_GATE, Ingredient.ofItems(ModBlocks.GLOOMWOOD_PLANKS));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GLOOMWOOD_PLANKS, 1)
                .input(ModBlocks.GLOOMWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.GLOOMWOOD_PLANKS), conditionsFromItem(ModBlocks.GLOOMWOOD_PLANKS))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLOOMWOOD_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.GLOOMWOOD_LOG)
                .criterion(hasItem(ModBlocks.GLOOMWOOD_LOG), conditionsFromItem(ModBlocks.GLOOMWOOD_LOG))
                .offerTo(recipeExporter);

        createStairsRecipe(ModBlocks.DUSKSLATE_STAIRS, Ingredient.ofItems(ModBlocks.DUSKSLATE));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DUSKSLATE_SLAB, Ingredient.ofItems(ModBlocks.DUSKSLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.DUSKSLATE_PRESSURE_PLATE, Ingredient.ofItems(ModBlocks.DUSKSLATE));
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

        createStairsRecipe(ModBlocks.POLISHED_DUSKSLATE_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_DUSKSLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.POLISHED_DUSKSLATE_PRESSURE_PLATE,
                Ingredient.ofItems(ModBlocks.POLISHED_DUSKSLATE_PRESSURE_PLATE));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DUSKSLATE_SLAB, Ingredient.ofItems(ModBlocks.POLISHED_DUSKSLATE));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.POLISHED_DUSKSLATE_BUTTON, 1)
                .input(ModBlocks.POLISHED_DUSKSLATE)
                .criterion(hasItem(ModBlocks.POLISHED_DUSKSLATE), conditionsFromItem(ModBlocks.POLISHED_DUSKSLATE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DUSKSLATE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.POLISHED_DUSKSLATE)
                .criterion(hasItem(ModBlocks.POLISHED_DUSKSLATE), conditionsFromItem(ModBlocks.POLISHED_DUSKSLATE))
                .offerTo(recipeExporter);

        createStairsRecipe(ModBlocks.BLUESHIST_STAIRS, Ingredient.ofItems(ModBlocks.BLUESHIST));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.BLUESHIST_PRESSURE_PLATE, Ingredient.ofItems(ModBlocks.BLUESHIST));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUESHIST_SLAB, Ingredient.ofItems(ModBlocks.BLUESHIST_SLAB));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.BLUESHIST_BUTTON, 1)
                .input(ModBlocks.BLUESHIST)
                .criterion(hasItem(ModBlocks.BLUESHIST), conditionsFromItem(ModBlocks.BLUESHIST))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUESHIST_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.BLUESHIST)
                .criterion(hasItem(ModBlocks.BLUESHIST), conditionsFromItem(ModBlocks.BLUESHIST))
                .offerTo(recipeExporter);

        createStairsRecipe(ModBlocks.POLISHED_BLUESHIST_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_BLUESHIST));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.POLISHED_BLUESHIST_PRESSURE_PLATE,
                Ingredient.ofItems(ModBlocks.POLISHED_BLUESHIST_PRESSURE_PLATE));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLUESHIST_SLAB, Ingredient.ofItems(ModBlocks.POLISHED_BLUESHIST));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.POLISHED_BLUESHIST_BUTTON, 1)
                .input(ModBlocks.POLISHED_BLUESHIST)
                .criterion(hasItem(ModBlocks.POLISHED_BLUESHIST), conditionsFromItem(ModBlocks.POLISHED_BLUESHIST))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLUESHIST_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.POLISHED_BLUESHIST)
                .criterion(hasItem(ModBlocks.POLISHED_BLUESHIST), conditionsFromItem(ModBlocks.POLISHED_BLUESHIST))
                .offerTo(recipeExporter);

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.RAW_VIRIDIUM, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_VIRIDIUM_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.VIRIDIUM_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIRIDIUM_BLOCK);
        createStairsRecipe(ModBlocks.VIRIDIUM_STAIRS, Ingredient.ofItems(ModItems.VIRIDIUM_INGOT));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIRIDIUM_SLAB, Ingredient.ofItems(ModItems.VIRIDIUM_INGOT));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.VIRIDIUM_PRESSURE_PLATE, Ingredient.ofItems(ModItems.VIRIDIUM_INGOT));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIRIDIUM_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.VIRIDIUM_INGOT)
                .criterion(hasItem(ModItems.VIRIDIUM_INGOT), conditionsFromItem(ModItems.VIRIDIUM_INGOT))
                .offerTo(recipeExporter);

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.RAW_THALRENITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_THALRENITE_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.THALRENITE_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.THALRENITE_BLOCK);
        createStairsRecipe(ModBlocks.THALRENITE_STAIRS, Ingredient.ofItems(ModItems.THALRENITE_INGOT));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.THALRENITE_SLAB, Ingredient.ofItems(ModItems.THALRENITE_INGOT));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.THALRENITE_PRESSURE_PLATE, Ingredient.ofItems(ModItems.THALRENITE_INGOT));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.THALRENITE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.THALRENITE_INGOT)
                .criterion(hasItem(ModItems.THALRENITE_INGOT), conditionsFromItem(ModItems.THALRENITE_INGOT))
                .offerTo(recipeExporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMBER_PICKAXE, 1)
                .pattern("###")
                .pattern(" s ")
                .pattern(" s ")
                .input('#', ModItems.AMBER)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMBER_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("s")
                .input('#', ModItems.AMBER)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMBER_AXE, 1)
                .pattern("##")
                .pattern("s#")
                .pattern("s ")
                .input('#', ModItems.AMBER)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMBER_SHOVEL, 1)
                .pattern("#")
                .pattern("s")
                .pattern("s")
                .input('#', ModItems.AMBER)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMBER_HOE, 1)
                .pattern("##")
                .pattern(" s")
                .pattern(" s")
                .input('#', ModItems.AMBER)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMBER_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.AMBER)
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMBER_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.AMBER)
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMBER_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.AMBER)
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMBER_BOOTS, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.AMBER)
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.VIRIDIUM_PICKAXE, 1)
                .pattern("###")
                .pattern(" s ")
                .pattern(" s ")
                .input('#', ModItems.VIRIDIUM_INGOT)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.VIRIDIUM_INGOT), conditionsFromItem(ModItems.VIRIDIUM_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.VIRIDIUM_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("s")
                .input('#', ModItems.VIRIDIUM_INGOT)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.VIRIDIUM_INGOT), conditionsFromItem(ModItems.VIRIDIUM_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.VIRIDIUM_AXE, 1)
                .pattern("##")
                .pattern("s#")
                .pattern("s ")
                .input('#', ModItems.AMBER)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.VIRIDIUM_SHOVEL, 1)
                .pattern("#")
                .pattern("s")
                .pattern("s")
                .input('#', ModItems.VIRIDIUM_INGOT)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.VIRIDIUM_INGOT), conditionsFromItem(ModItems.VIRIDIUM_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.VIRIDIUM_HOE, 1)
                .pattern("##")
                .pattern(" s")
                .pattern(" s")
                .input('#', ModItems.VIRIDIUM_INGOT)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.VIRIDIUM_INGOT), conditionsFromItem(ModItems.VIRIDIUM_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.VIRIDIUM_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.VIRIDIUM_INGOT)
                .criterion(hasItem(ModItems.VIRIDIUM_INGOT), conditionsFromItem(ModItems.VIRIDIUM_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.VIRIDIUM_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.VIRIDIUM_INGOT)
                .criterion(hasItem(ModItems.VIRIDIUM_INGOT), conditionsFromItem(ModItems.VIRIDIUM_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.VIRIDIUM_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.VIRIDIUM_INGOT)
                .criterion(hasItem(ModItems.VIRIDIUM_INGOT), conditionsFromItem(ModItems.VIRIDIUM_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.VIRIDIUM_BOOTS, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.VIRIDIUM_INGOT)
                .criterion(hasItem(ModItems.VIRIDIUM_INGOT), conditionsFromItem(ModItems.VIRIDIUM_BOOTS))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.THALRENITE_PICKAXE, 1)
                .pattern("###")
                .pattern(" s ")
                .pattern(" s ")
                .input('#', ModItems.THALRENITE_INGOT)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.THALRENITE_INGOT), conditionsFromItem(ModItems.THALRENITE_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.THALRENITE_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("s")
                .input('#', ModItems.THALRENITE_INGOT)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.THALRENITE_INGOT), conditionsFromItem(ModItems.THALRENITE_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.THALRENITE_AXE, 1)
                .pattern("##")
                .pattern("s#")
                .pattern("s ")
                .input('#', ModItems.THALRENITE_INGOT)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.THALRENITE_INGOT), conditionsFromItem(ModItems.THALRENITE_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.THALRENITE_SHOVEL, 1)
                .pattern("#")
                .pattern("s")
                .pattern("s")
                .input('#', ModItems.THALRENITE_INGOT)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.THALRENITE_INGOT), conditionsFromItem(ModItems.THALRENITE_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.THALRENITE_HOE, 1)
                .pattern("##")
                .pattern(" s")
                .pattern(" s")
                .input('#', ModItems.THALRENITE_INGOT)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.THALRENITE_INGOT), conditionsFromItem(ModItems.THALRENITE_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.THALRENITE_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.THALRENITE_INGOT)
                .criterion(hasItem(ModItems.THALRENITE_INGOT), conditionsFromItem(ModItems.THALRENITE_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.THALRENITE_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.THALRENITE_INGOT)
                .criterion(hasItem(ModItems.THALRENITE_INGOT), conditionsFromItem(ModItems.THALRENITE_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.THALRENITE_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.THALRENITE_INGOT)
                .criterion(hasItem(ModItems.THALRENITE_INGOT), conditionsFromItem(ModItems.THALRENITE_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.THALRENITE_BOOTS, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.THALRENITE_INGOT)
                .criterion(hasItem(ModItems.THALRENITE_INGOT), conditionsFromItem(ModItems.THALRENITE_INGOT))
                .offerTo(recipeExporter);

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.ENDRITE_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDRITE_BLOCK);
    }
}
