package net.diice.naturalmaterials.datagen;

import net.diice.naturalmaterials.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        BlockStateModelGenerator.BlockTexturePool PALM_POOL = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALM_PLANKS);
        BlockStateModelGenerator.BlockTexturePool REDWOOD_POOL = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REDWOOD_PLANKS);
        BlockStateModelGenerator.BlockTexturePool CYPRESS_POOL = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYPRESS_PLANKS);

        PALM_POOL.stairs(ModBlocks.PALM_STAIRS);
        PALM_POOL.slab(ModBlocks.PALM_SLAB);
        PALM_POOL.pressurePlate(ModBlocks.PALM_PRESSURE_PLATE);
        PALM_POOL.button(ModBlocks.PALM_BUTTON);
        PALM_POOL.fence(ModBlocks.PALM_FENCE);
        PALM_POOL.fenceGate(ModBlocks.PALM_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.PALM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PALM_TRAPDOOR);

        REDWOOD_POOL.stairs(ModBlocks.REDWOOD_STAIRS);
        REDWOOD_POOL.slab(ModBlocks.REDWOOD_SLAB);
        REDWOOD_POOL.pressurePlate(ModBlocks.REDWOOD_PRESSURE_PLATE);
        REDWOOD_POOL.button(ModBlocks.REDWOOD_BUTTON);
        REDWOOD_POOL.fence(ModBlocks.REDWOOD_FENCE);
        REDWOOD_POOL.fenceGate(ModBlocks.REDWOOD_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.REDWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.REDWOOD_TRAPDOOR);

        CYPRESS_POOL.stairs(ModBlocks.CYPRESS_STAIRS);
        CYPRESS_POOL.slab(ModBlocks.CYPRESS_SLAB);
        CYPRESS_POOL.pressurePlate(ModBlocks.CYPRESS_PRESSURE_PLATE);
        CYPRESS_POOL.button(ModBlocks.CYPRESS_BUTTON);
        CYPRESS_POOL.fence(ModBlocks.CYPRESS_FENCE);
        CYPRESS_POOL.fenceGate(ModBlocks.CYPRESS_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.CYPRESS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CYPRESS_TRAPDOOR);



    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
