package net.diice.naturalmaterials.block;

import net.diice.naturalmaterials.NaturalMaterials;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block PALM_PLANKS = registerBlock("palm_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block PALM_STAIRS = registerBlock("palm_stairs",
            new StairsBlock(ModBlocks.PALM_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));
    public static final Block PALM_SLAB = registerBlock("palm_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));
    public static final Block PALM_BUTTON = registerBlock("palm_button",
            new ButtonBlock(BlockSetType.OAK, 2, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));
    public static final Block PALM_PRESSURE_PLATE = registerBlock("palm_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final Block PALM_FENCE = registerBlock("palm_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));
    public static final Block PALM_FENCE_GATE = registerBlock("palm_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));
    public static final Block PALM_DOOR = registerBlock("palm_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_DOOR)));
    public static final Block PALM_TRAPDOOR = registerBlock("palm_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)));

    public static final Block REDWOOD_PLANKS = registerBlock("redwood_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block REDWOOD_STAIRS = registerBlock("redwood_stairs",
            new StairsBlock(ModBlocks.REDWOOD_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));
    public static final Block REDWOOD_SLAB = registerBlock("redwood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));
    public static final Block REDWOOD_BUTTON = registerBlock("redwood_button",
            new ButtonBlock(BlockSetType.OAK, 2, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));
    public static final Block REDWOOD_PRESSURE_PLATE = registerBlock("redwood_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final Block REDWOOD_FENCE = registerBlock("redwood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));
    public static final Block REDWOOD_FENCE_GATE = registerBlock("redwood_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));
    public static final Block REDWOOD_DOOR = registerBlock("redwood_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_DOOR)));
    public static final Block REDWOOD_TRAPDOOR = registerBlock("redwood_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)));

    public static final Block CYPRESS_PLANKS = registerBlock("cypress_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block CYPRESS_STAIRS = registerBlock("cypress_stairs",
            new StairsBlock(ModBlocks.CYPRESS_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));
    public static final Block CYPRESS_SLAB = registerBlock("cypress_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));
    public static final Block CYPRESS_BUTTON = registerBlock("cypress_button",
            new ButtonBlock(BlockSetType.OAK, 2, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));
    public static final Block CYPRESS_PRESSURE_PLATE = registerBlock("cypress_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final Block CYPRESS_FENCE = registerBlock("cypress_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));
    public static final Block CYPRESS_FENCE_GATE = registerBlock("cypress_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));
    public static final Block CYPRESS_DOOR = registerBlock("cypress_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).nonOpaque()));
    public static final Block CYPRESS_TRAPDOOR = registerBlock("cypress_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)));

    public static final Block MANAWOOD_PLANKS = registerBlock("manawood_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block MANAWOOD_STAIRS = registerBlock("manawood_stairs",
            new StairsBlock(ModBlocks.MANAWOOD_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));
    public static final Block MANAWOOD_SLAB = registerBlock("manawood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));
    public static final Block MANAWOOD_BUTTON = registerBlock("manawood_button",
            new ButtonBlock(BlockSetType.OAK, 2, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));
    public static final Block MANAWOOD_PRESSURE_PLATE = registerBlock("manawood_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final Block MANAWOOD_FENCE = registerBlock("manawood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));
    public static final Block MANAWOOD_FENCE_GATE = registerBlock("manawood_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));
    public static final Block MANAWOOD_DOOR = registerBlock("manawood_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).nonOpaque()));
    public static final Block MANAWOOD_TRAPDOOR = registerBlock("manawood_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)));

    public static final Block DUSKSLATE = registerBlock("duskslate",
            new PillarBlock(AbstractBlock.Settings.create().requiresTool()
                    .strength(3.0f, 6.0f)
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block DUSKSLATE_STAIRS = registerBlock("duskslate_stairs",
            new StairsBlock(ModBlocks.DUSKSLATE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_STAIRS)));
    public static final Block DUSKSLATE_SLAB = registerBlock("duskslate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_SLAB)));
    public static final Block DUSKSLATE_BUTTON = registerBlock("duskslate_button",
            new ButtonBlock(BlockSetType.STONE, 2, AbstractBlock.Settings.copy(Blocks.STONE_BUTTON)));
    public static final Block DUSKSLATE_WALL = registerBlock("duskslate_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_WALL)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(NaturalMaterials.MOD_ID, name), block);
    }
    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(NaturalMaterials.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        NaturalMaterials.LOGGER.info("Registering Mod Blocks for " + NaturalMaterials.MOD_ID);
    }
}
