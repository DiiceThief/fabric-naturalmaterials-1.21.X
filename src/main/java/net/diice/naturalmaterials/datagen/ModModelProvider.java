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


    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
