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

    public static final ItemGroup NATURAL_MATERIALS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(NaturalMaterials.MOD_ID, "natural_materials_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.AMBER))
                    .displayName(Text.translatable("itemgroup.naturalmaterials.natural_materials_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.AMBER);

                        entries.add(ModItems.HUNTER_SMITHING_TEMPLATE);

                        entries.add(ModItems.AMBER_HELMET);
                        entries.add(ModItems.AMBER_CHESTPLATE);
                        entries.add(ModItems.AMBER_LEGGINGS);
                        entries.add(ModItems.AMBER_BOOTS);

                        entries.add(ModItems.AMBER_SWORD);
                        entries.add(ModItems.AMBER_AXE);
                        entries.add(ModItems.AMBER_PICKAXE);
                        entries.add(ModItems.AMBER_SHOVEL);
                        entries.add(ModItems.AMBER_HOE);

                    }).build());
    public static final ItemGroup NATURAL_MATERIALS_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(NaturalMaterials.MOD_ID, "natural_materials_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PALM_PLANKS))
                    .displayName(Text.translatable("itemgroup.naturalmaterials.natural_materials_blocks"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.PALM_LOG);
                        entries.add(ModBlocks.PALM_WOOD);
                        entries.add(ModBlocks.STRIPPED_PALM_LOG);
                        entries.add(ModBlocks.STRIPPED_PALM_WOOD);
                        entries.add(ModBlocks.PALM_PLANKS);
                        entries.add(ModBlocks.PALM_STAIRS);
                        entries.add(ModBlocks.PALM_SLAB);
                        entries.add(ModBlocks.PALM_BUTTON);
                        entries.add(ModBlocks.PALM_PRESSURE_PLATE);
                        entries.add(ModBlocks.PALM_FENCE);
                        entries.add(ModBlocks.PALM_FENCE_GATE);
                        entries.add(ModBlocks.PALM_DOOR);
                        entries.add(ModBlocks.PALM_TRAPDOOR);
                        entries.add(ModBlocks.PALM_LEAVES);
                        entries.add(ModBlocks.PALM_SAPLING);

                        entries.add(ModBlocks.REDWOOD_LOG);
                        entries.add(ModBlocks.REDWOOD_WOOD);
                        entries.add(ModBlocks.STRIPPED_REDWOOD_LOG);
                        entries.add(ModBlocks.STRIPPED_REDWOOD_WOOD);
                        entries.add(ModBlocks.REDWOOD_PLANKS);
                        entries.add(ModBlocks.REDWOOD_STAIRS);
                        entries.add(ModBlocks.REDWOOD_SLAB);
                        entries.add(ModBlocks.REDWOOD_BUTTON);
                        entries.add(ModBlocks.REDWOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.REDWOOD_FENCE);
                        entries.add(ModBlocks.REDWOOD_FENCE_GATE);
                        entries.add(ModBlocks.REDWOOD_DOOR);
                        entries.add(ModBlocks.REDWOOD_TRAPDOOR);
                        entries.add(ModBlocks.REDWOOD_LEAVES);
                        entries.add(ModBlocks.REDWOOD_SAPLING);

                        entries.add(ModBlocks.CYPRESS_LOG);
                        entries.add(ModBlocks.CYPRESS_WOOD);
                        entries.add(ModBlocks.STRIPPED_CYPRESS_LOG);
                        entries.add(ModBlocks.STRIPPED_CYPRESS_WOOD);
                        entries.add(ModBlocks.CYPRESS_PLANKS);
                        entries.add(ModBlocks.CYPRESS_STAIRS);
                        entries.add(ModBlocks.CYPRESS_SLAB);
                        entries.add(ModBlocks.CYPRESS_BUTTON);
                        entries.add(ModBlocks.CYPRESS_PRESSURE_PLATE);
                        entries.add(ModBlocks.CYPRESS_FENCE);
                        entries.add(ModBlocks.CYPRESS_FENCE_GATE);
                        entries.add(ModBlocks.CYPRESS_DOOR);
                        entries.add(ModBlocks.CYPRESS_TRAPDOOR);
                        entries.add(ModBlocks.CYPRESS_LEAVES);
                        entries.add(ModBlocks.CYPRESS_SAPLING);

                        entries.add(ModBlocks.MANAWOOD_LOG);
                        entries.add(ModBlocks.MANAWOOD_WOOD);
                        entries.add(ModBlocks.STRIPPED_MANAWOOD_LOG);
                        entries.add(ModBlocks.STRIPPED_MANAWOOD_WOOD);
                        entries.add(ModBlocks.MANAWOOD_PLANKS);
                        entries.add(ModBlocks.MANAWOOD_STAIRS);
                        entries.add(ModBlocks.MANAWOOD_SLAB);
                        entries.add(ModBlocks.MANAWOOD_BUTTON);
                        entries.add(ModBlocks.MANAWOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.MANAWOOD_FENCE);
                        entries.add(ModBlocks.MANAWOOD_FENCE_GATE);
                        entries.add(ModBlocks.MANAWOOD_DOOR);
                        entries.add(ModBlocks.MANAWOOD_TRAPDOOR);
                        entries.add(ModBlocks.MANAWOOD_LEAVES);
                        entries.add(ModBlocks.MANAWOOD_SAPLING);

                        entries.add(ModBlocks.DUSKSLATE);
                        entries.add(ModBlocks.DUSKSLATE_STAIRS);
                        entries.add(ModBlocks.DUSKSLATE_SLAB);
                        entries.add(ModBlocks.DUSKSLATE_WALL);
                        entries.add(ModBlocks.DUSKSLATE_BUTTON);
                        entries.add(ModBlocks.DUSKSLATE_PRESSURE_PLATE);

                        entries.add(ModBlocks.POLISHED_DUSKSLATE);
                        entries.add(ModBlocks.POLISHED_DUSKSLATE_STAIRS);
                        entries.add(ModBlocks.POLISHED_DUSKSLATE_SLAB);
                        entries.add(ModBlocks.POLISHED_DUSKSLATE_WALL);
                        entries.add(ModBlocks.POLISHED_DUSKSLATE_BUTTON);
                        entries.add(ModBlocks.POLISHED_DUSKSLATE_PRESSURE_PLATE);

                        entries.add(ModBlocks.BLUESHIST);
                        entries.add(ModBlocks.BLUESHIST_STAIRS);
                        entries.add(ModBlocks.BLUESHIST_SLAB);
                        entries.add(ModBlocks.BLUESHIST_WALL);
                        entries.add(ModBlocks.BLUESHIST_BUTTON);
                        entries.add(ModBlocks.BLUESHIST_PRESSURE_PLATE);

                        entries.add(ModBlocks.POLISHED_BLUESHIST);
                        entries.add(ModBlocks.POLISHED_BLUESHIST_STAIRS);
                        entries.add(ModBlocks.POLISHED_BLUESHIST_SLAB);
                        entries.add(ModBlocks.POLISHED_BLUESHIST_WALL);
                        entries.add(ModBlocks.POLISHED_BLUESHIST_BUTTON);
                        entries.add(ModBlocks.POLISHED_BLUESHIST_PRESSURE_PLATE);


                    })).build());

    public static void registerItemGroups() {
        NaturalMaterials.LOGGER.info("Registering Item Groups for " + NaturalMaterials.MOD_ID);
    }
}
