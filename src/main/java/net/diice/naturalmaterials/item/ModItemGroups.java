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

                        entries.add(ModBlocks.REDWOOD_PLANKS);
                        entries.add(ModBlocks.REDWOOD_STAIRS);
                        entries.add(ModBlocks.REDWOOD_SLAB);
                        entries.add(ModBlocks.REDWOOD_BUTTON);
                        entries.add(ModBlocks.REDWOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.REDWOOD_FENCE);
                        entries.add(ModBlocks.REDWOOD_FENCE_GATE);
                        entries.add(ModBlocks.REDWOOD_DOOR);
                        entries.add(ModBlocks.REDWOOD_TRAPDOOR);

                        entries.add(ModBlocks.CYPRESS_PLANKS);
                        entries.add(ModBlocks.CYPRESS_STAIRS);
                        entries.add(ModBlocks.CYPRESS_SLAB);
                        entries.add(ModBlocks.CYPRESS_BUTTON);
                        entries.add(ModBlocks.CYPRESS_PRESSURE_PLATE);
                        entries.add(ModBlocks.CYPRESS_FENCE);
                        entries.add(ModBlocks.CYPRESS_FENCE_GATE);
                        entries.add(ModBlocks.CYPRESS_DOOR);
                        entries.add(ModBlocks.CYPRESS_TRAPDOOR);

                        entries.add(ModBlocks.MANAWOOD_PLANKS);
                        entries.add(ModBlocks.MANAWOOD_STAIRS);
                        entries.add(ModBlocks.MANAWOOD_SLAB);
                        entries.add(ModBlocks.MANAWOOD_BUTTON);
                        entries.add(ModBlocks.MANAWOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.MANAWOOD_FENCE);
                        entries.add(ModBlocks.MANAWOOD_FENCE_GATE);
                        entries.add(ModBlocks.MANAWOOD_DOOR);
                        entries.add(ModBlocks.MANAWOOD_TRAPDOOR);

                        entries.add(ModBlocks.DUSKSLATE);
                        entries.add(ModBlocks.DUSKSLATE_STAIRS);
                        entries.add(ModBlocks.DUSKSLATE_SLAB);
                        entries.add(ModBlocks.DUSKSLATE_WALL);
                        entries.add(ModBlocks.DUSKSLATE_BUTTON);

                        entries.add(ModBlocks.POLISHED_DUSKSLATE);
                        entries.add(ModBlocks.POLISHED_DUSKSLATE_STAIRS);
                        entries.add(ModBlocks.POLISHED_DUSKSLATE_SLAB);
                        entries.add(ModBlocks.POLISHED_DUSKSLATE_WALL);
                        entries.add(ModBlocks.POLISHED_DUSKSLATE_BUTTON);


                    })).build());

    public static void registerItemGroups() {
        NaturalMaterials.LOGGER.info("Registering Item Groups for " + NaturalMaterials.MOD_ID);
    }
}
