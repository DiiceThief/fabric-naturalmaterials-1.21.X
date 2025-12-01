package net.diice.naturalmaterials.block;

import net.diice.naturalmaterials.NaturalMaterials;
import net.diice.naturalmaterials.block.custom.ModSaplingBlock;
import net.diice.naturalmaterials.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.createFlowerPotBlock;
import static net.minecraft.block.Blocks.register;

public class ModBlocks {

   public static final Block PALM_LOG = registerBlock("palm_log",
           new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
   public static final Block STRIPPED_PALM_LOG = registerBlock("stripped_palm_log",
           new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
   public static final Block PALM_WOOD = registerBlock("palm_wood",
           new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
   public static final Block STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood",
           new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
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
    public static final Block PALM_LEAVES = registerBlock("palm_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block PALM_SAPLING = registerBlock("palm_sapling",
            new ModSaplingBlock(ModSaplingGenerators.PALM, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING), Blocks.SAND));

    public static final Block REDWOOD_LOG = registerBlock("redwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_REDWOOD_LOG = registerBlock("stripped_redwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block REDWOOD_WOOD = registerBlock("redwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_REDWOOD_WOOD = registerBlock("stripped_redwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
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
    public static final Block REDWOOD_LEAVES = registerBlock("redwood_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block REDWOOD_SAPLING = registerBlock("redwood_sapling",
            new SaplingBlock(ModSaplingGenerators.REDWOOD, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));


 public static final Block CYPRESS_LEAVES = registerBlock("cypress_leaves",
         new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block CYPRESS_LOG = registerBlock("cypress_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_CYPRESS_LOG = registerBlock("stripped_cypress_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block CYPRESS_WOOD = registerBlock("cypress_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_CYPRESS_WOOD = registerBlock("stripped_cypress_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
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
    public static final Block CYPRESS_SAPLING = registerBlock("cypress_sapling",
            new ModSaplingBlock(ModSaplingGenerators.CYPRESS, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING), Blocks.MUD));


    public static final Block MANAWOOD_LOG = registerBlock("manawood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_MANAWOOD_LOG = registerBlock("stripped_manawood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block MANAWOOD_WOOD = registerBlock("manawood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_MANAWOOD_WOOD = registerBlock("stripped_manawood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
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
    public static final Block MANAWOOD_LEAVES = registerBlock("manawood_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block MANAWOOD_SAPLING = registerBlock("manawood_sapling",
            new SaplingBlock(ModSaplingGenerators.MANAWOOD, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));


    public static final Block GLOOMWOOD_LOG = registerBlock("gloomwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_GLOOMWOOD_LOG = registerBlock("stripped_gloomwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block GLOOMWOOD_WOOD = registerBlock("gloomwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_GLOOMWOOD_WOOD = registerBlock("stripped_gloomwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block GLOOMWOOD_PLANKS = registerBlock("gloomwood_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block GLOOMWOOD_STAIRS = registerBlock("gloomwood_stairs",
            new StairsBlock(ModBlocks.GLOOMWOOD_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));
    public static final Block GLOOMWOOD_SLAB = registerBlock("gloomwood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));
    public static final Block GLOOMWOOD_BUTTON = registerBlock("gloomwood_button",
            new ButtonBlock(BlockSetType.OAK, 2, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));
    public static final Block GLOOMWOOD_PRESSURE_PLATE = registerBlock("gloomwood_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final Block GLOOMWOOD_FENCE = registerBlock("gloomwood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));
    public static final Block GLOOMWOOD_FENCE_GATE = registerBlock("gloomwood_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));
    public static final Block GLOOMWOOD_DOOR = registerBlock("gloomwood_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).nonOpaque()));
    public static final Block GLOOMWOOD_TRAPDOOR = registerBlock("gloomwood_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)));
    public static final Block GLOOMWOOD_LEAVES = registerBlock("gloomwood_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block GLOOMWOOD_SAPLING = registerBlock("gloomwood_sapling",
            new SaplingBlock(ModSaplingGenerators.GLOOMWOOD, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));


    public static final Block DUSKSLATE = registerBlock("duskslate",
            new Block(AbstractBlock.Settings.create().requiresTool()
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
    public static final Block DUSKSLATE_PRESSURE_PLATE = registerBlock("duskslate_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));


    public static final Block POLISHED_DUSKSLATE = registerBlock("polished_duskslate",
            new Block(AbstractBlock.Settings.copy(ModBlocks.DUSKSLATE)));
    public static final Block POLISHED_DUSKSLATE_STAIRS = registerBlock("polished_duskslate_stairs",
            new StairsBlock(ModBlocks.POLISHED_DUSKSLATE.getDefaultState(),
                    AbstractBlock.Settings.copy(ModBlocks.DUSKSLATE_STAIRS)));
    public static final Block POLISHED_DUSKSLATE_SLAB = registerBlock("polished_duskslate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.DUSKSLATE_SLAB)));
    public static final Block POLISHED_DUSKSLATE_BUTTON = registerBlock("polished_duskslate_button",
            new ButtonBlock(BlockSetType.STONE, 2, AbstractBlock.Settings.copy(ModBlocks.DUSKSLATE_BUTTON)));
    public static final Block POLISHED_DUSKSLATE_WALL = registerBlock("polished_duskslate_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.DUSKSLATE_WALL)));
    public static final Block POLISHED_DUSKSLATE_PRESSURE_PLATE = registerBlock("polished_duskslate_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));


    public static final Block BLUESHIST = registerBlock("blueshist",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block BLUESHIST_STAIRS = registerBlock("blueshist_stairs",
            new StairsBlock(ModBlocks.BLUESHIST.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.STONE_STAIRS)));
    public static final Block BLUESHIST_SLAB = registerBlock("blueshist_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB)));
    public static final Block BLUESHIST_BUTTON = registerBlock("blueshist_button",
            new ButtonBlock(BlockSetType.STONE, 2, AbstractBlock.Settings.copy(Blocks.STONE_BUTTON)));
    public static final Block BLUESHIST_WALL = registerBlock("blueshist_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_WALL)));
    public static final Block BLUESHIST_PRESSURE_PLATE = registerBlock("blueshist_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));


    public static final Block POLISHED_BLUESHIST = registerBlock("polished_blueshist",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block POLISHED_BLUESHIST_STAIRS = registerBlock("polished_blueshist_stairs",
            new StairsBlock(ModBlocks.BLUESHIST.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.STONE_STAIRS)));
    public static final Block POLISHED_BLUESHIST_SLAB = registerBlock("polished_blueshist_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB)));
    public static final Block POLISHED_BLUESHIST_BUTTON = registerBlock("polished_blueshist_button",
            new ButtonBlock(BlockSetType.STONE, 2, AbstractBlock.Settings.copy(Blocks.STONE_BUTTON)));
    public static final Block POLISHED_BLUESHIST_WALL = registerBlock("polished_blueshist_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_WALL)));
    public static final Block POLISHED_BLUESHIST_PRESSURE_PLATE = registerBlock("polished_blueshist_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final Block VIRIDIUM_BLOCK = registerBlock("viridium_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block RAW_VIRIDIUM_BLOCK = registerBlock("raw_viridium_block",
           new Block(AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK)));
    public static final Block VIRIDIUM_STAIRS = registerBlock("viridium_stairs",
            new StairsBlock(ModBlocks.VIRIDIUM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.STONE_STAIRS)));
    public static final Block VIRIDIUM_SLAB = registerBlock("viridium_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB)));
    public static final Block VIRIDIUM_WALL = registerBlock("viridium_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_WALL)));
    public static final Block VIRIDIUM_PRESSURE_PLATE = registerBlock("viridium_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.copy(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE)));

    public static final Block THALRENITE_BLOCK = registerBlock("thalrenite_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block RAW_THALRENITE_BLOCK = registerBlock("raw_thalrenite_block",
            new Block(AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK)));
    public static final Block THALRENITE_STAIRS = registerBlock("thalrenite_stairs",
            new StairsBlock(ModBlocks.THALRENITE_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.STONE_STAIRS)));
    public static final Block THALRENITE_SLAB = registerBlock("thalrenite_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB)));
    public static final Block THALRENITE_WALL = registerBlock("thalrenite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_WALL)));
    public static final Block THALRENITE_PRESSURE_PLATE = registerBlock("thalrenite_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.copy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)));

    public static final Block ENDRITE_BLOCK = registerBlock("endrite_block",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));



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
