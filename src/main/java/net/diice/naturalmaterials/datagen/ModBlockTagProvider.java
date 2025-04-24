package net.diice.naturalmaterials.datagen;

import net.diice.naturalmaterials.block.ModBlocks;
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
                .add(ModBlocks.PALM_PLANKS)
                .add(ModBlocks.PALM_STAIRS)
                .add(ModBlocks.PALM_SLAB)
                .add(ModBlocks.PALM_PRESSURE_PLATE)
                .add(ModBlocks.PALM_BUTTON)
                .add(ModBlocks.PALM_DOOR)
                .add(ModBlocks.PALM_TRAPDOOR)
                .add(ModBlocks.PALM_FENCE)
                .add(ModBlocks.PALM_FENCE_GATE)

                .add(ModBlocks.REDWOOD_PLANKS)
                .add(ModBlocks.REDWOOD_STAIRS)
                .add(ModBlocks.REDWOOD_SLAB)
                .add(ModBlocks.REDWOOD_PRESSURE_PLATE)
                .add(ModBlocks.REDWOOD_BUTTON)
                .add(ModBlocks.REDWOOD_DOOR)
                .add(ModBlocks.REDWOOD_TRAPDOOR)
                .add(ModBlocks.REDWOOD_FENCE)
                .add(ModBlocks.REDWOOD_FENCE_GATE)

                .add(ModBlocks.CYPRESS_PLANKS)
                .add(ModBlocks.CYPRESS_STAIRS)
                .add(ModBlocks.CYPRESS_SLAB)
                .add(ModBlocks.CYPRESS_PRESSURE_PLATE)
                .add(ModBlocks.CYPRESS_BUTTON)
                .add(ModBlocks.CYPRESS_DOOR)
                .add(ModBlocks.CYPRESS_TRAPDOOR)
                .add(ModBlocks.CYPRESS_FENCE)
                .add(ModBlocks.CYPRESS_FENCE_GATE)

                .add(ModBlocks.MANAWOOD_PLANKS)
                .add(ModBlocks.MANAWOOD_STAIRS)
                .add(ModBlocks.MANAWOOD_SLAB)
                .add(ModBlocks.MANAWOOD_PRESSURE_PLATE)
                .add(ModBlocks.MANAWOOD_BUTTON)
                .add(ModBlocks.MANAWOOD_DOOR)
                .add(ModBlocks.MANAWOOD_TRAPDOOR)
                .add(ModBlocks.MANAWOOD_FENCE)
                .add(ModBlocks.MANAWOOD_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.PALM_FENCE)
                .add(ModBlocks.REDWOOD_FENCE)
                .add(ModBlocks.CYPRESS_FENCE)
                .add(ModBlocks.MANAWOOD_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.PALM_FENCE_GATE)
                .add(ModBlocks.REDWOOD_FENCE_GATE)
                .add(ModBlocks.CYPRESS_FENCE_GATE)
                .add(ModBlocks.MANAWOOD_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DUSKSLATE);
    }
}
