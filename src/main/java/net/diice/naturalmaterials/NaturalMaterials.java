package net.diice.naturalmaterials;

import net.diice.naturalmaterials.block.ModBlocks;
import net.diice.naturalmaterials.item.ModItemGroups;
import net.diice.naturalmaterials.item.ModItems;
import net.diice.naturalmaterials.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.FireBlock;
import net.minecraft.data.client.Models;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NaturalMaterials implements ModInitializer {
	public static final String MOD_ID = "naturalmaterials";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();

		StrippableBlockRegistry.register(ModBlocks.PALM_LOG, ModBlocks.STRIPPED_PALM_LOG);
		StrippableBlockRegistry.register(ModBlocks.PALM_WOOD, ModBlocks.STRIPPED_PALM_WOOD);

		StrippableBlockRegistry.register(ModBlocks.REDWOOD_LOG, ModBlocks.STRIPPED_REDWOOD_LOG);
		StrippableBlockRegistry.register(ModBlocks.REDWOOD_WOOD, ModBlocks.STRIPPED_REDWOOD_WOOD);

		StrippableBlockRegistry.register(ModBlocks.CYPRESS_LOG, ModBlocks.STRIPPED_CYPRESS_LOG);
		StrippableBlockRegistry.register(ModBlocks.CYPRESS_WOOD, ModBlocks.STRIPPED_CYPRESS_WOOD);

		StrippableBlockRegistry.register(ModBlocks.MANAWOOD_LOG, ModBlocks.STRIPPED_MANAWOOD_LOG);
		StrippableBlockRegistry.register(ModBlocks.MANAWOOD_WOOD, ModBlocks.STRIPPED_MANAWOOD_WOOD);

		StrippableBlockRegistry.register(ModBlocks.GLOOMWOOD_LOG, ModBlocks.STRIPPED_GLOOMWOOD_LOG);
		StrippableBlockRegistry.register(ModBlocks.GLOOMWOOD_WOOD, ModBlocks.STRIPPED_GLOOMWOOD_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PALM_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PALM_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_LEAVES, 30, 60);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.REDWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_REDWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.REDWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_REDWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.REDWOOD_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.REDWOOD_LEAVES, 30, 60);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYPRESS_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CYPRESS_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYPRESS_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CYPRESS_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYPRESS_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYPRESS_LEAVES, 30, 60);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANAWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MANAWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANAWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MANAWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANAWOOD_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANAWOOD_LEAVES, 30, 60);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GLOOMWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_GLOOMWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GLOOMWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_GLOOMWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GLOOMWOOD_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GLOOMWOOD_LEAVES, 30, 60);

	}
}