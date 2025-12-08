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
        addDrop(ModBlocks.PALM_LOG);
        addDrop(ModBlocks.STRIPPED_PALM_LOG);
        addDrop(ModBlocks.PALM_WOOD);
        addDrop(ModBlocks.STRIPPED_PALM_WOOD);
        addDrop(ModBlocks.PALM_LEAVES, leavesDrops(ModBlocks.PALM_LEAVES, ModBlocks.PALM_SAPLING, 0.0635f));
        addDrop(ModBlocks.PALM_SAPLING);
        addDrop(ModBlocks.PALM_SIGN, ModBlocks.PALM_SIGN);
        addDrop(ModBlocks.PALM_WALL_SIGN, ModBlocks.PALM_SIGN);
        addDrop(ModBlocks.PALM_HANGING_SIGN, ModBlocks.PALM_HANGING_SIGN);
        addDrop(ModBlocks.PALM_WALL_HANGING_SIGN, ModBlocks.PALM_HANGING_SIGN);


        addPottedPlantDrops(ModBlocks.POTTED_PALM_SAPLING);

        addDrop(ModBlocks.REDWOOD_PLANKS);
        addDrop(ModBlocks.REDWOOD_STAIRS);
        addDrop(ModBlocks.REDWOOD_SLAB, slabDrops(ModBlocks.REDWOOD_SLAB));
        addDrop(ModBlocks.REDWOOD_BUTTON);
        addDrop(ModBlocks.REDWOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.REDWOOD_DOOR, doorDrops(ModBlocks.REDWOOD_DOOR));
        addDrop(ModBlocks.REDWOOD_TRAPDOOR);
        addDrop(ModBlocks.REDWOOD_FENCE);
        addDrop(ModBlocks.REDWOOD_FENCE_GATE);
        addDrop(ModBlocks.REDWOOD_LOG);
        addDrop(ModBlocks.STRIPPED_REDWOOD_LOG);
        addDrop(ModBlocks.REDWOOD_WOOD);
        addDrop(ModBlocks.STRIPPED_REDWOOD_WOOD);
        addDrop(ModBlocks.REDWOOD_LEAVES, leavesDrops(ModBlocks.REDWOOD_LEAVES, ModBlocks.REDWOOD_SAPLING, 0.0625f));
        addDrop(ModBlocks.REDWOOD_SAPLING);

        addPottedPlantDrops(ModBlocks.POTTED_REDWOOD_SAPLING);

        addDrop(ModBlocks.CYPRESS_PLANKS);
        addDrop(ModBlocks.CYPRESS_STAIRS);
        addDrop(ModBlocks.CYPRESS_SLAB, slabDrops(ModBlocks.CYPRESS_SLAB));
        addDrop(ModBlocks.CYPRESS_BUTTON);
        addDrop(ModBlocks.CYPRESS_PRESSURE_PLATE);
        addDrop(ModBlocks.CYPRESS_DOOR, doorDrops(ModBlocks.CYPRESS_DOOR));
        addDrop(ModBlocks.CYPRESS_TRAPDOOR);
        addDrop(ModBlocks.CYPRESS_FENCE);
        addDrop(ModBlocks.CYPRESS_FENCE_GATE);
        addDrop(ModBlocks.CYPRESS_LOG);
        addDrop(ModBlocks.STRIPPED_CYPRESS_LOG);
        addDrop(ModBlocks.CYPRESS_WOOD);
        addDrop(ModBlocks.STRIPPED_CYPRESS_WOOD);
        addDrop(ModBlocks.CYPRESS_LEAVES, leavesDrops(ModBlocks.CYPRESS_LEAVES, ModBlocks.CYPRESS_SAPLING, 0.1250f));
        addDrop(ModBlocks.CYPRESS_SAPLING);

        addPottedPlantDrops(ModBlocks.POTTED_CYPRESS_SAPLING);

        addDrop(ModBlocks.MANAWOOD_PLANKS);
        addDrop(ModBlocks.MANAWOOD_STAIRS);
        addDrop(ModBlocks.MANAWOOD_SLAB, slabDrops(ModBlocks.MANAWOOD_SLAB));
        addDrop(ModBlocks.MANAWOOD_BUTTON);
        addDrop(ModBlocks.MANAWOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.MANAWOOD_DOOR, doorDrops(ModBlocks.MANAWOOD_DOOR));
        addDrop(ModBlocks.MANAWOOD_TRAPDOOR);
        addDrop(ModBlocks.MANAWOOD_FENCE);
        addDrop(ModBlocks.MANAWOOD_FENCE_GATE);
        addDrop(ModBlocks.MANAWOOD_LOG);
        addDrop(ModBlocks.STRIPPED_MANAWOOD_LOG);
        addDrop(ModBlocks.MANAWOOD_WOOD);
        addDrop(ModBlocks.STRIPPED_MANAWOOD_WOOD);
        addDrop(ModBlocks.MANAWOOD_SAPLING);
        addDrop(ModBlocks.MANAWOOD_LEAVES, leavesDrops(ModBlocks.MANAWOOD_LEAVES, ModBlocks.MANAWOOD_SAPLING, 0.0625f));

        addPottedPlantDrops(ModBlocks.POTTED_MANAWOOD_SAPLING);

        addDrop(ModBlocks.GLOOMWOOD_PLANKS);
        addDrop(ModBlocks.GLOOMWOOD_STAIRS);
        addDrop(ModBlocks.GLOOMWOOD_SLAB, slabDrops(ModBlocks.GLOOMWOOD_SLAB));
        addDrop(ModBlocks.GLOOMWOOD_BUTTON);
        addDrop(ModBlocks.GLOOMWOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.GLOOMWOOD_DOOR, doorDrops(ModBlocks.GLOOMWOOD_DOOR));
        addDrop(ModBlocks.GLOOMWOOD_TRAPDOOR);
        addDrop(ModBlocks.GLOOMWOOD_FENCE);
        addDrop(ModBlocks.GLOOMWOOD_FENCE_GATE);
        addDrop(ModBlocks.GLOOMWOOD_LOG);
        addDrop(ModBlocks.STRIPPED_GLOOMWOOD_LOG);
        addDrop(ModBlocks.GLOOMWOOD_WOOD);
        addDrop(ModBlocks.STRIPPED_GLOOMWOOD_WOOD);
        addDrop(ModBlocks.GLOOMWOOD_SAPLING);
        addDrop(ModBlocks.GLOOMWOOD_LEAVES, leavesDrops(ModBlocks.GLOOMWOOD_LEAVES, ModBlocks.GLOOMWOOD_SAPLING, 0.0625f));

        addPottedPlantDrops(ModBlocks.POTTED_GLOOMWOOD_SAPLING);

        addDrop(ModBlocks.DUSKSLATE);
        addDrop(ModBlocks.DUSKSLATE_STAIRS);
        addDrop(ModBlocks.DUSKSLATE_SLAB, slabDrops(ModBlocks.DUSKSLATE_SLAB));
        addDrop(ModBlocks.DUSKSLATE_WALL);
        addDrop(ModBlocks.DUSKSLATE_BUTTON);
        addDrop(ModBlocks.DUSKSLATE_PRESSURE_PLATE);

        addDrop(ModBlocks.POLISHED_DUSKSLATE);
        addDrop(ModBlocks.POLISHED_DUSKSLATE_STAIRS);
        addDrop(ModBlocks.POLISHED_DUSKSLATE_SLAB, slabDrops(ModBlocks.POLISHED_DUSKSLATE_SLAB));
        addDrop(ModBlocks.POLISHED_DUSKSLATE_BUTTON);
        addDrop(ModBlocks.POLISHED_DUSKSLATE_WALL);
        addDrop(ModBlocks.POLISHED_DUSKSLATE_PRESSURE_PLATE);

        addDrop(ModBlocks.BLUESHIST);
        addDrop(ModBlocks.BLUESHIST_STAIRS);
        addDrop(ModBlocks.BLUESHIST_SLAB, slabDrops(ModBlocks.BLUESHIST_SLAB));
        addDrop(ModBlocks.BLUESHIST_BUTTON);
        addDrop(ModBlocks.BLUESHIST_WALL);
        addDrop(ModBlocks.BLUESHIST_PRESSURE_PLATE);

        addDrop(ModBlocks.POLISHED_BLUESHIST);
        addDrop(ModBlocks.POLISHED_BLUESHIST_STAIRS);
        addDrop(ModBlocks.POLISHED_BLUESHIST_SLAB, slabDrops(ModBlocks.POLISHED_BLUESHIST_SLAB));
        addDrop(ModBlocks.POLISHED_BLUESHIST_BUTTON);
        addDrop(ModBlocks.POLISHED_BLUESHIST_WALL);
        addDrop(ModBlocks.POLISHED_BLUESHIST_PRESSURE_PLATE);

        addDrop(ModBlocks.VIRIDIUM_BLOCK);
        addDrop(ModBlocks.RAW_VIRIDIUM_BLOCK);
        addDrop(ModBlocks.VIRIDIUM_STAIRS);
        addDrop(ModBlocks.VIRIDIUM_SLAB, slabDrops(ModBlocks.VIRIDIUM_SLAB));
        addDrop(ModBlocks.VIRIDIUM_WALL);
        addDrop(ModBlocks.VIRIDIUM_PRESSURE_PLATE);

        addDrop(ModBlocks.THALRENITE_BLOCK);
        addDrop(ModBlocks.RAW_THALRENITE_BLOCK);
        addDrop(ModBlocks.THALRENITE_STAIRS);
        addDrop(ModBlocks.THALRENITE_SLAB, slabDrops(ModBlocks.THALRENITE_SLAB));
        addDrop(ModBlocks.THALRENITE_WALL);
        addDrop(ModBlocks.THALRENITE_PRESSURE_PLATE);

        addDrop(ModBlocks.ENDRITE_BLOCK);

    }
}
