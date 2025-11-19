package net.diice.naturalmaterials.datagen;

import net.diice.naturalmaterials.block.ModBlocks;
import net.diice.naturalmaterials.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.*;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        BlockStateModelGenerator.BlockTexturePool PALM_POOL = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALM_PLANKS);
        BlockStateModelGenerator.BlockTexturePool REDWOOD_POOL = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REDWOOD_PLANKS);
        BlockStateModelGenerator.BlockTexturePool CYPRESS_POOL = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYPRESS_PLANKS);
        BlockStateModelGenerator.BlockTexturePool MANAWOOD_POOL = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MANAWOOD_PLANKS);
        BlockStateModelGenerator.BlockTexturePool GLOOMWOOD_POOL = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GLOOMWOOD_PLANKS);
        BlockStateModelGenerator.BlockTexturePool DUSKSLATE_POOL = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DUSKSLATE);
        BlockStateModelGenerator.BlockTexturePool POLISHED_DUSKSLATE_POOL = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DUSKSLATE);
        BlockStateModelGenerator.BlockTexturePool BLUESHIST_POOL = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUESHIST);
        BlockStateModelGenerator.BlockTexturePool POLISHED_BLUESHIST_POOL = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_BLUESHIST);

        PALM_POOL.stairs(ModBlocks.PALM_STAIRS);
        PALM_POOL.slab(ModBlocks.PALM_SLAB);
        PALM_POOL.pressurePlate(ModBlocks.PALM_PRESSURE_PLATE);
        PALM_POOL.button(ModBlocks.PALM_BUTTON);
        PALM_POOL.fence(ModBlocks.PALM_FENCE);
        PALM_POOL.fenceGate(ModBlocks.PALM_FENCE_GATE);

        blockStateModelGenerator.registerLog(ModBlocks.PALM_LOG).log(ModBlocks.PALM_LOG).wood(ModBlocks.PALM_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PALM_LOG).log(ModBlocks.STRIPPED_PALM_LOG).wood(ModBlocks.STRIPPED_PALM_WOOD);

        blockStateModelGenerator.registerDoor(ModBlocks.PALM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PALM_TRAPDOOR);

        blockStateModelGenerator.registerSingleton(ModBlocks.PALM_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.PALM_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        REDWOOD_POOL.stairs(ModBlocks.REDWOOD_STAIRS);
        REDWOOD_POOL.slab(ModBlocks.REDWOOD_SLAB);
        REDWOOD_POOL.pressurePlate(ModBlocks.REDWOOD_PRESSURE_PLATE);
        REDWOOD_POOL.button(ModBlocks.REDWOOD_BUTTON);
        REDWOOD_POOL.fence(ModBlocks.REDWOOD_FENCE);
        REDWOOD_POOL.fenceGate(ModBlocks.REDWOOD_FENCE_GATE);

        blockStateModelGenerator.registerLog(ModBlocks.REDWOOD_LOG).log(ModBlocks.REDWOOD_LOG).wood(ModBlocks.REDWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_REDWOOD_LOG).log(ModBlocks.STRIPPED_REDWOOD_LOG).wood(ModBlocks.STRIPPED_REDWOOD_WOOD);

        blockStateModelGenerator.registerDoor(ModBlocks.REDWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.REDWOOD_TRAPDOOR);

        blockStateModelGenerator.registerSingleton(ModBlocks.REDWOOD_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.REDWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        CYPRESS_POOL.stairs(ModBlocks.CYPRESS_STAIRS);
        CYPRESS_POOL.slab(ModBlocks.CYPRESS_SLAB);
        CYPRESS_POOL.pressurePlate(ModBlocks.CYPRESS_PRESSURE_PLATE);
        CYPRESS_POOL.button(ModBlocks.CYPRESS_BUTTON);
        CYPRESS_POOL.fence(ModBlocks.CYPRESS_FENCE);
        CYPRESS_POOL.fenceGate(ModBlocks.CYPRESS_FENCE_GATE);

        blockStateModelGenerator.registerLog(ModBlocks.CYPRESS_LOG).log(ModBlocks.CYPRESS_LOG).wood(ModBlocks.CYPRESS_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_CYPRESS_LOG).log(ModBlocks.STRIPPED_CYPRESS_LOG).wood(ModBlocks.STRIPPED_CYPRESS_WOOD);

        blockStateModelGenerator.registerDoor(ModBlocks.CYPRESS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CYPRESS_TRAPDOOR);

        blockStateModelGenerator.registerSingleton(ModBlocks.CYPRESS_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.CYPRESS_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        MANAWOOD_POOL.stairs(ModBlocks.MANAWOOD_STAIRS);
        MANAWOOD_POOL.slab(ModBlocks.MANAWOOD_SLAB);
        MANAWOOD_POOL.pressurePlate(ModBlocks.MANAWOOD_PRESSURE_PLATE);
        MANAWOOD_POOL.button(ModBlocks.MANAWOOD_BUTTON);
        MANAWOOD_POOL.fence(ModBlocks.MANAWOOD_FENCE);
        MANAWOOD_POOL.fenceGate(ModBlocks.MANAWOOD_FENCE_GATE);

        blockStateModelGenerator.registerLog(ModBlocks.MANAWOOD_LOG).log(ModBlocks.MANAWOOD_LOG).wood(ModBlocks.MANAWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_MANAWOOD_LOG).log(ModBlocks.STRIPPED_MANAWOOD_LOG).wood(ModBlocks.STRIPPED_MANAWOOD_WOOD);

        blockStateModelGenerator.registerDoor(ModBlocks.MANAWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.MANAWOOD_TRAPDOOR);

        blockStateModelGenerator.registerSingleton(ModBlocks.MANAWOOD_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.MANAWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        GLOOMWOOD_POOL.stairs(ModBlocks.GLOOMWOOD_STAIRS);
        GLOOMWOOD_POOL.slab(ModBlocks.GLOOMWOOD_SLAB);
        GLOOMWOOD_POOL.pressurePlate(ModBlocks.GLOOMWOOD_PRESSURE_PLATE);
        GLOOMWOOD_POOL.button(ModBlocks.GLOOMWOOD_BUTTON);
        GLOOMWOOD_POOL.fence(ModBlocks.GLOOMWOOD_FENCE);
        GLOOMWOOD_POOL.fenceGate(ModBlocks.GLOOMWOOD_FENCE_GATE);

        blockStateModelGenerator.registerLog(ModBlocks.GLOOMWOOD_LOG).log(ModBlocks.GLOOMWOOD_LOG).wood(ModBlocks.GLOOMWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_GLOOMWOOD_LOG).log(ModBlocks.STRIPPED_GLOOMWOOD_LOG).wood(ModBlocks.STRIPPED_GLOOMWOOD_WOOD);

        blockStateModelGenerator.registerDoor(ModBlocks.GLOOMWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.GLOOMWOOD_TRAPDOOR);

        blockStateModelGenerator.registerSingleton(ModBlocks.GLOOMWOOD_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.GLOOMWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        DUSKSLATE_POOL.stairs(ModBlocks.DUSKSLATE_STAIRS);
        DUSKSLATE_POOL.slab(ModBlocks.DUSKSLATE_SLAB);
        DUSKSLATE_POOL.wall(ModBlocks.DUSKSLATE_WALL);
        DUSKSLATE_POOL.button(ModBlocks.DUSKSLATE_BUTTON);
        DUSKSLATE_POOL.pressurePlate(ModBlocks.DUSKSLATE_PRESSURE_PLATE);

        POLISHED_DUSKSLATE_POOL.stairs(ModBlocks.POLISHED_DUSKSLATE_STAIRS);
        POLISHED_DUSKSLATE_POOL.slab(ModBlocks.POLISHED_DUSKSLATE_SLAB);
        POLISHED_DUSKSLATE_POOL.wall(ModBlocks.POLISHED_DUSKSLATE_WALL);
        POLISHED_DUSKSLATE_POOL.button(ModBlocks.POLISHED_DUSKSLATE_BUTTON);
        POLISHED_DUSKSLATE_POOL.pressurePlate(ModBlocks.POLISHED_DUSKSLATE_PRESSURE_PLATE);

        BLUESHIST_POOL.stairs(ModBlocks.BLUESHIST_STAIRS);
        BLUESHIST_POOL.slab(ModBlocks.BLUESHIST_SLAB);
        BLUESHIST_POOL.wall(ModBlocks.BLUESHIST_WALL);
        BLUESHIST_POOL.button(ModBlocks.BLUESHIST_BUTTON);
        BLUESHIST_POOL.pressurePlate(ModBlocks.BLUESHIST_PRESSURE_PLATE);

        POLISHED_BLUESHIST_POOL.stairs(ModBlocks.POLISHED_BLUESHIST_STAIRS);
        POLISHED_BLUESHIST_POOL.slab(ModBlocks.POLISHED_BLUESHIST_SLAB);
        POLISHED_BLUESHIST_POOL.wall(ModBlocks.POLISHED_BLUESHIST_WALL);
        POLISHED_BLUESHIST_POOL.button(ModBlocks.POLISHED_BLUESHIST_BUTTON);
        POLISHED_BLUESHIST_POOL.pressurePlate(ModBlocks.POLISHED_BLUESHIST_PRESSURE_PLATE);

    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModBlocks.CYPRESS_SAPLING.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.PALM_SAPLING.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.REDWOOD_SAPLING.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.MANAWOOD_SAPLING.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.GLOOMWOOD_SAPLING.asItem(), Models.GENERATED);


        itemModelGenerator.register(ModItems.AMBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.HUNTER_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMBER_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMBER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMBER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMBER_HELMET));

        itemModelGenerator.register(ModItems.AMBER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMBER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMBER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMBER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMBER_HOE, Models.HANDHELD);
    }
}
