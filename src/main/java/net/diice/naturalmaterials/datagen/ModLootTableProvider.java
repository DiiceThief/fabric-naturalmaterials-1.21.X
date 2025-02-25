package net.diice.naturalmaterials.datagen;

import net.diice.naturalmaterials.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PALM_PLANKS);
        addDrop(ModBlocks.PALM_STAIRS);
        addDrop(ModBlocks.PALM_SLAB, slabDrops(ModBlocks.PALM_SLAB));
        addDrop(ModBlocks.PALM_BUTTON);
        addDrop(ModBlocks.PALM_PRESSURE_PLATE);
        addDrop(ModBlocks.PALM_DOOR, doorDrops(ModBlocks.PALM_DOOR));
        addDrop(ModBlocks.PALM_TRAPDOOR);
        addDrop(ModBlocks.PALM_FENCE);
        addDrop(ModBlocks.PALM_FENCE_GATE);

        addDrop(ModBlocks.REDWOOD_PLANKS);
        addDrop(ModBlocks.REDWOOD_STAIRS);
        addDrop(ModBlocks.REDWOOD_SLAB, slabDrops(ModBlocks.REDWOOD_SLAB));
        addDrop(ModBlocks.REDWOOD_BUTTON);
        addDrop(ModBlocks.REDWOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.REDWOOD_DOOR, doorDrops(ModBlocks.REDWOOD_DOOR));
        addDrop(ModBlocks.REDWOOD_TRAPDOOR);
        addDrop(ModBlocks.REDWOOD_FENCE);
        addDrop(ModBlocks.REDWOOD_FENCE_GATE);

        addDrop(ModBlocks.CYPRESS_PLANKS);
        addDrop(ModBlocks.CYPRESS_STAIRS);
        addDrop(ModBlocks.CYPRESS_SLAB, slabDrops(ModBlocks.CYPRESS_SLAB));
        addDrop(ModBlocks.CYPRESS_BUTTON);
        addDrop(ModBlocks.CYPRESS_PRESSURE_PLATE);
        addDrop(ModBlocks.CYPRESS_DOOR, doorDrops(ModBlocks.CYPRESS_DOOR));
        addDrop(ModBlocks.CYPRESS_TRAPDOOR);
        addDrop(ModBlocks.CYPRESS_FENCE);
        addDrop(ModBlocks.CYPRESS_FENCE_GATE);

    }
}
