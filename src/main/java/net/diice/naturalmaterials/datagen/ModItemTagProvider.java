package net.diice.naturalmaterials.datagen;

import net.diice.naturalmaterials.block.ModBlocks;
import net.diice.naturalmaterials.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.AMBER);

        getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.HUNTER_SMITHING_TEMPLATE);

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.PALM_LOG.asItem())
                .add(ModBlocks.PALM_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PALM_LOG.asItem())
                .add(ModBlocks.STRIPPED_PALM_WOOD.asItem())
                .add(ModBlocks.REDWOOD_LOG.asItem())
                .add(ModBlocks.REDWOOD_WOOD.asItem())
                .add(ModBlocks.STRIPPED_REDWOOD_LOG.asItem())
                .add(ModBlocks.STRIPPED_REDWOOD_WOOD.asItem())
                .add(ModBlocks.CYPRESS_LOG.asItem())
                .add(ModBlocks.CYPRESS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CYPRESS_LOG.asItem())
                .add(ModBlocks.STRIPPED_CYPRESS_WOOD.asItem())
                .add(ModBlocks.MANAWOOD_LOG.asItem())
                .add(ModBlocks.MANAWOOD_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MANAWOOD_LOG.asItem())
                .add(ModBlocks.STRIPPED_MANAWOOD_WOOD.asItem())
                .add(ModBlocks.GLOOMWOOD_LOG.asItem())
                .add(ModBlocks.GLOOMWOOD_WOOD.asItem())
                .add(ModBlocks.STRIPPED_GLOOMWOOD_LOG.asItem())
                .add(ModBlocks.STRIPPED_GLOOMWOOD_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.AMBER_BOOTS)
                .add(ModItems.AMBER_LEGGINGS)
                .add(ModItems.AMBER_CHESTPLATE)
                .add(ModItems.AMBER_HELMET)
                .add(ModItems.VIRIDIUM_BOOTS)
                .add(ModItems.VIRIDIUM_CHESTPLATE)
                .add(ModItems.VIRIDIUM_LEGGINGS)
                .add(ModItems.VIRIDIUM_HELMET)
                .add(ModItems.THALRENITE_BOOTS)
                .add(ModItems.THALRENITE_CHESTPLATE)
                .add(ModItems.THALRENITE_LEGGINGS)
                .add(ModItems.THALRENITE_HELMET);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.AMBER_SWORD)
                .add(ModItems.VIRIDIUM_SWORD)
                .add(ModItems.THALRENITE_SWORD);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.AMBER_AXE)
                .add(ModItems.VIRIDIUM_AXE)
                .add(ModItems.THALRENITE_AXE);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.AMBER_PICKAXE)
                .add(ModItems.VIRIDIUM_PICKAXE)
                .add(ModItems.THALRENITE_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.AMBER_SHOVEL)
                .add(ModItems.VIRIDIUM_SHOVEL)
                .add(ModItems.THALRENITE_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.AMBER_HOE)
                .add(ModItems.VIRIDIUM_HOE)
                .add(ModItems.THALRENITE_HOE);

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.PALM_PLANKS.asItem())
                .add(ModBlocks.CYPRESS_PLANKS.asItem())
                .add(ModBlocks.REDWOOD_PLANKS.asItem())
                .add(ModBlocks.MANAWOOD_PLANKS.asItem())
                .add(ModBlocks.GLOOMWOOD_PLANKS.asItem());

    }
}
