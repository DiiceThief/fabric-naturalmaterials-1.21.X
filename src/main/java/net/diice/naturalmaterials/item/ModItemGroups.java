package net.diice.naturalmaterials.item;

import net.diice.naturalmaterials.NaturalMaterials;
import net.diice.naturalmaterials.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup NATURAL_MATERIALS_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(NaturalMaterials.MOD_ID, "natural_materials_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PALM_PLANKS))
                    .displayName(Text.translatable("itemgroup.naturalmaterials.natural_materials_blocks"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.PALM_PLANKS);
                        entries.add(ModBlocks.PALM_STAIRS);
                        entries.add(ModBlocks.PALM_SLAB);
                        entries.add(ModBlocks.PALM_BUTTON);
                        entries.add(ModBlocks.PALM_PRESSURE_PLATE);
                        entries.add(ModBlocks.PALM_FENCE);
                        entries.add(ModBlocks.PALM_FENCE_GATE);
                        entries.add(ModBlocks.PALM_DOOR);
                        entries.add(ModBlocks.PALM_TRAPDOOR);

                    })).build());

    public static void registerItemGroups() {
        NaturalMaterials.LOGGER.info("Registering Item Groups for " + NaturalMaterials.MOD_ID);
    }
}
