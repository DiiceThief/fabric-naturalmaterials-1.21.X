package net.diice.naturalmaterials.datagen;

import net.diice.naturalmaterials.block.ModBlocks;
import net.diice.naturalmaterials.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.PALM_LOG)
                .add(ModBlocks.STRIPPED_PALM_LOG)
                .add(ModBlocks.PALM_WOOD)
                .add(ModBlocks.STRIPPED_PALM_WOOD)
                .add(ModBlocks.PALM_PLANKS)
                .add(ModBlocks.PALM_STAIRS)
                .add(ModBlocks.PALM_SLAB)
                .add(ModBlocks.PALM_PRESSURE_PLATE)
                .add(ModBlocks.PALM_BUTTON)
                .add(ModBlocks.PALM_DOOR)
                .add(ModBlocks.PALM_TRAPDOOR)
                .add(ModBlocks.PALM_FENCE)
                .add(ModBlocks.PALM_FENCE_GATE)

                .add(ModBlocks.REDWOOD_LOG)
                .add(ModBlocks.STRIPPED_REDWOOD_LOG)
                .add(ModBlocks.REDWOOD_WOOD)
                .add(ModBlocks.STRIPPED_REDWOOD_WOOD)
                .add(ModBlocks.REDWOOD_PLANKS)
                .add(ModBlocks.REDWOOD_STAIRS)
                .add(ModBlocks.REDWOOD_SLAB)
                .add(ModBlocks.REDWOOD_PRESSURE_PLATE)
                .add(ModBlocks.REDWOOD_BUTTON)
                .add(ModBlocks.REDWOOD_DOOR)
                .add(ModBlocks.REDWOOD_TRAPDOOR)
                .add(ModBlocks.REDWOOD_FENCE)
                .add(ModBlocks.REDWOOD_FENCE_GATE)

                .add(ModBlocks.CYPRESS_LOG)
                .add(ModBlocks.STRIPPED_CYPRESS_LOG)
                .add(ModBlocks.CYPRESS_WOOD)
                .add(ModBlocks.STRIPPED_CYPRESS_WOOD)
                .add(ModBlocks.CYPRESS_PLANKS)
                .add(ModBlocks.CYPRESS_STAIRS)
                .add(ModBlocks.CYPRESS_SLAB)
                .add(ModBlocks.CYPRESS_PRESSURE_PLATE)
                .add(ModBlocks.CYPRESS_BUTTON)
                .add(ModBlocks.CYPRESS_DOOR)
                .add(ModBlocks.CYPRESS_TRAPDOOR)
                .add(ModBlocks.CYPRESS_FENCE)
                .add(ModBlocks.CYPRESS_FENCE_GATE)

                .add(ModBlocks.MANAWOOD_LOG)
                .add(ModBlocks.STRIPPED_MANAWOOD_LOG)
                .add(ModBlocks.MANAWOOD_WOOD)
                .add(ModBlocks.STRIPPED_MANAWOOD_WOOD)
                .add(ModBlocks.MANAWOOD_PLANKS)
                .add(ModBlocks.MANAWOOD_STAIRS)
                .add(ModBlocks.MANAWOOD_SLAB)
                .add(ModBlocks.MANAWOOD_PRESSURE_PLATE)
                .add(ModBlocks.MANAWOOD_BUTTON)
                .add(ModBlocks.MANAWOOD_DOOR)
                .add(ModBlocks.MANAWOOD_TRAPDOOR)
                .add(ModBlocks.MANAWOOD_FENCE)
                .add(ModBlocks.MANAWOOD_FENCE_GATE)

                .add(ModBlocks.GLOOMWOOD_LOG)
                .add(ModBlocks.STRIPPED_GLOOMWOOD_LOG)
                .add(ModBlocks.GLOOMWOOD_WOOD)
                .add(ModBlocks.STRIPPED_GLOOMWOOD_WOOD)
                .add(ModBlocks.GLOOMWOOD_PLANKS)
                .add(ModBlocks.GLOOMWOOD_STAIRS)
                .add(ModBlocks.GLOOMWOOD_SLAB)
                .add(ModBlocks.GLOOMWOOD_PRESSURE_PLATE)
                .add(ModBlocks.GLOOMWOOD_BUTTON)
                .add(ModBlocks.GLOOMWOOD_DOOR)
                .add(ModBlocks.GLOOMWOOD_TRAPDOOR)
                .add(ModBlocks.GLOOMWOOD_FENCE)
                .add(ModBlocks.GLOOMWOOD_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.PALM_FENCE)
                .add(ModBlocks.REDWOOD_FENCE)
                .add(ModBlocks.CYPRESS_FENCE)
                .add(ModBlocks.MANAWOOD_FENCE)
                .add(ModBlocks.GLOOMWOOD_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.PALM_FENCE_GATE)
                .add(ModBlocks.REDWOOD_FENCE_GATE)
                .add(ModBlocks.CYPRESS_FENCE_GATE)
                .add(ModBlocks.MANAWOOD_FENCE_GATE)
                .add(ModBlocks.GLOOMWOOD_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DUSKSLATE)
                .add(ModBlocks.DUSKSLATE_STAIRS)
                .add(ModBlocks.DUSKSLATE_SLAB)
                .add(ModBlocks.DUSKSLATE_WALL)
                .add(ModBlocks.DUSKSLATE_BUTTON)
                .add(ModBlocks.DUSKSLATE_PRESSURE_PLATE)
                .add(ModBlocks.POLISHED_DUSKSLATE)
                .add(ModBlocks.POLISHED_DUSKSLATE_STAIRS)
                .add(ModBlocks.POLISHED_DUSKSLATE_SLAB)
                .add(ModBlocks.POLISHED_DUSKSLATE_BUTTON)
                .add(ModBlocks.POLISHED_DUSKSLATE_WALL)
                .add(ModBlocks.POLISHED_DUSKSLATE_PRESSURE_PLATE)
                .add(ModBlocks.BLUESHIST)
                .add(ModBlocks.BLUESHIST_STAIRS)
                .add(ModBlocks.BLUESHIST_SLAB)
                .add(ModBlocks.BLUESHIST_BUTTON)
                .add(ModBlocks.BLUESHIST_WALL)
                .add(ModBlocks.BLUESHIST_PRESSURE_PLATE)
                .add(ModBlocks.POLISHED_BLUESHIST)
                .add(ModBlocks.POLISHED_BLUESHIST_STAIRS)
                .add(ModBlocks.POLISHED_BLUESHIST_SLAB)
                .add(ModBlocks.POLISHED_BLUESHIST_BUTTON)
                .add(ModBlocks.POLISHED_BLUESHIST_WALL)
                .add(ModBlocks.POLISHED_BLUESHIST_PRESSURE_PLATE)
                .add(ModBlocks.VIRIDIUM_BLOCK)
                .add(ModBlocks.VIRIDIUM_STAIRS)
                .add(ModBlocks.VIRIDIUM_SLAB)
                .add(ModBlocks.VIRIDIUM_WALL)
                .add(ModBlocks.RAW_VIRIDIUM_BLOCK)
                .add(ModBlocks.VIRIDIUM_PRESSURE_PLATE)
                .add(ModBlocks.THALRENITE_BLOCK)
                .add(ModBlocks.THALRENITE_STAIRS)
                .add(ModBlocks.THALRENITE_SLAB)
                .add(ModBlocks.THALRENITE_WALL)
                .add(ModBlocks.THALRENITE_PRESSURE_PLATE)
                .add(ModBlocks.RAW_THALRENITE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.VIRIDIUM_BLOCK)
                .add(ModBlocks.VIRIDIUM_STAIRS)
                .add(ModBlocks.VIRIDIUM_SLAB)
                .add(ModBlocks.VIRIDIUM_WALL)
                .add(ModBlocks.RAW_VIRIDIUM_BLOCK)
                .add(ModBlocks.VIRIDIUM_PRESSURE_PLATE)
                .add(ModBlocks.THALRENITE_BLOCK)
                .add(ModBlocks.THALRENITE_STAIRS)
                .add(ModBlocks.THALRENITE_SLAB)
                .add(ModBlocks.THALRENITE_WALL)
                .add(ModBlocks.THALRENITE_PRESSURE_PLATE)
                .add(ModBlocks.RAW_THALRENITE_BLOCK);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.DUSKSLATE_WALL)
                .add(ModBlocks.POLISHED_DUSKSLATE_WALL)
                .add(ModBlocks.BLUESHIST_WALL)
                .add(ModBlocks.POLISHED_BLUESHIST_WALL)
                .add(ModBlocks.VIRIDIUM_WALL)
                .add(ModBlocks.THALRENITE_WALL);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PALM_LOG)
                .add(ModBlocks.PALM_WOOD)
                .add(ModBlocks.STRIPPED_PALM_LOG)
                .add(ModBlocks.STRIPPED_PALM_WOOD)
                .add(ModBlocks.REDWOOD_LOG)
                .add(ModBlocks.REDWOOD_WOOD)
                .add(ModBlocks.STRIPPED_REDWOOD_LOG)
                .add(ModBlocks.STRIPPED_REDWOOD_WOOD)
                .add(ModBlocks.CYPRESS_LOG)
                .add(ModBlocks.CYPRESS_WOOD)
                .add(ModBlocks.STRIPPED_CYPRESS_LOG)
                .add(ModBlocks.STRIPPED_CYPRESS_WOOD)
                .add(ModBlocks.MANAWOOD_LOG)
                .add(ModBlocks.MANAWOOD_WOOD)
                .add(ModBlocks.STRIPPED_MANAWOOD_LOG)
                .add(ModBlocks.STRIPPED_MANAWOOD_WOOD)
                .add(ModBlocks.GLOOMWOOD_LOG)
                .add(ModBlocks.GLOOMWOOD_WOOD)
                .add(ModBlocks.STRIPPED_GLOOMWOOD_LOG)
                .add(ModBlocks.STRIPPED_GLOOMWOOD_WOOD);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_AMBER_TOOL)
                .forceAddTag(BlockTags.NEEDS_STONE_TOOL);
    }
}
