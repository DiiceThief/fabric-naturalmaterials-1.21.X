package net.diice.naturalmaterials;

import net.diice.naturalmaterials.block.ModBlocks;
import net.diice.naturalmaterials.item.ModItemGroups;
import net.diice.naturalmaterials.item.ModItems;
import net.fabricmc.api.ModInitializer;

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

	}
}