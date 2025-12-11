package net.diice.naturalmaterials.block;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import net.diice.naturalmaterials.NaturalMaterials;
import net.diice.naturalmaterials.block.custom.ModSaplingBlock;
import net.diice.naturalmaterials.item.ModItems;
import net.diice.naturalmaterials.util.BlockSetTypeList;
import net.diice.naturalmaterials.util.ModTags;
import net.diice.naturalmaterials.util.WoodTypeList;
import net.diice.naturalmaterials.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

   public static final Block PALM_LOG = registerWithItem("palm_log",
           Blocks.createLogBlock(MapColor.OAK_TAN, MapColor.OAK_TAN));
   public static final Block STRIPPED_PALM_LOG = registerWithItem("stripped_palm_log",
          Blocks.createLogBlock(MapColor.OAK_TAN, MapColor.OAK_TAN));
   public static final Block PALM_WOOD = registerWithItem("palm_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OAK_TAN)
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
   public static final Block STRIPPED_PALM_WOOD = registerWithItem("stripped_palm_wood",
           new PillarBlock(AbstractBlock.Settings.create()
                   .mapColor(MapColor.OAK_TAN)
                   .instrument(NoteBlockInstrument.BANJO)
                   .strength(2.0F)
                   .sounds(BlockSoundGroup.WOOD)
                   .burnable()));
    public static final Block PALM_PLANKS = registerWithItem("palm_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.OAK_TAN)));
    public static final StairsBlock PALM_STAIRS = registerWithItem("palm_stairs",
            new StairsBlock(PALM_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).mapColor(MapColor.OAK_TAN)));
    public static final Block PALM_SLAB = registerWithItem("palm_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(PALM_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block PALM_BUTTON = registerWithItem("palm_button",
            Blocks.createWoodenButtonBlock(BlockSetTypeList.PALM));
    public static final PressurePlateBlock PALM_PRESSURE_PLATE = registerWithItem("palm_pressure_plate",
            new PressurePlateBlock(BlockSetTypeList.PALM, AbstractBlock.Settings.create()
                    .mapColor(PALM_PLANKS.getDefaultMapColor())
                    .solid()
                    .noCollision()
                    .strength(0.5F)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final FenceBlock PALM_FENCE = registerWithItem("palm_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .mapColor(PALM_PLANKS.getDefaultMapColor())
                    .solid()
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final FenceGateBlock PALM_FENCE_GATE = registerWithItem("palm_fence_gate",
            new FenceGateBlock(WoodTypeList.PALM, AbstractBlock.Settings.create()
                    .mapColor(PALM_PLANKS.getDefaultMapColor())
                    .solid()
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(2.0F, 3.0F)
                    .burnable()));
    public static final DoorBlock PALM_DOOR = registerWithItem("palm_door",
            new DoorBlock(BlockSetTypeList.PALM, AbstractBlock.Settings.create()
                    .mapColor(PALM_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(3.0F)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PALM_TRAPDOOR = registerWithItem("palm_trapdoor",
            new TrapdoorBlock(BlockSetTypeList.PALM, AbstractBlock.Settings.create()
                    .mapColor(PALM_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(3.0F)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .burnable()));
    public static final LeavesBlock PALM_LEAVES = registerWithItem("palm_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_GREEN)
                    .strength(2.0F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final SaplingBlock PALM_SAPLING = registerWithItem("palm_sapling",
            new ModSaplingBlock(ModSaplingGenerators.PALM, AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_GREEN)
                    .ticksRandomly()
                    .strength(0.0f)
                    .sounds(BlockSoundGroup.GRASS)
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never), Blocks.SAND));
    public static final Block POTTED_PALM_SAPLING = registerWithItem("potted_palm_sapling",
            Blocks.createFlowerPotBlock(PALM_SAPLING));

    private static final Identifier PALM_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/palm");
    private static final Identifier PALM_HANGING_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/hanging/palm");
    private static final Identifier PALM_HANGING_SIGN_GUI_TEXTURE = NaturalMaterials.id("textures/gui/hanging_signs/palm");
    public static final TerraformSignBlock PALM_SIGN = registerWithItem("palm_sign",
            new TerraformSignBlock(PALM_SIGN_TEXTURE, AbstractBlock.Settings.create()
                    .mapColor(MapColor.OAK_TAN)
                    .solid()
                    .instrument(NoteBlockInstrument.BASS)
                    .noCollision()
                    .strength(1.0F)
                    .burnable()));
    public static final TerraformWallSignBlock PALM_WALL_SIGN = registerBlock("palm_wall_sign",
            new TerraformWallSignBlock(PALM_SIGN_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(PALM_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .burnable()
                            .strength(1.0F)));
    public static final TerraformHangingSignBlock PALM_HANGING_SIGN = registerWithItem("palm_hanging_sign",
            new TerraformHangingSignBlock(PALM_HANGING_SIGN_TEXTURE, PALM_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(PALM_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));
    public static final TerraformWallHangingSignBlock PALM_WALL_HANGING_SIGN = registerBlock("palm_wall_hanging_sign",
            new TerraformWallHangingSignBlock(PALM_HANGING_SIGN_TEXTURE, PALM_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(PALM_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));



    public static final Block REDWOOD_LOG = registerWithItem("redwood_log",
            Blocks.createLogBlock(MapColor.RED, MapColor.TERRACOTTA_BROWN));
public static final Block STRIPPED_REDWOOD_LOG = registerWithItem("stripped_redwood_log",
            Blocks.createLogBlock(MapColor.RED, MapColor.RED));
    public static final Block REDWOOD_WOOD = registerWithItem("redwood_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block STRIPPED_REDWOOD_WOOD = registerWithItem("stripped_redwood_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block REDWOOD_PLANKS = registerWithItem("redwood_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.BRIGHT_RED)));
    public static final Block REDWOOD_STAIRS = registerBlock("redwood_stairs",
            new StairsBlock(ModBlocks.REDWOOD_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).mapColor(MapColor.BRIGHT_RED)));
    public static final Block REDWOOD_SLAB = registerWithItem("redwood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.BRIGHT_RED)));
    public static final Block REDWOOD_BUTTON = registerWithItem("redwood_button",
            Blocks.createWoodenButtonBlock(BlockSetTypeList.REDWOOD));
    public static final Block REDWOOD_PRESSURE_PLATE = registerWithItem("redwood_pressure_plate",
            new PressurePlateBlock(BlockSetTypeList.REDWOOD, AbstractBlock.Settings.create()
                    .mapColor(REDWOOD_PLANKS.getDefaultMapColor())
                    .solid()
                    .noCollision()
                    .strength(0.5F)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block REDWOOD_FENCE = registerWithItem("redwood_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .mapColor(REDWOOD_PLANKS.getDefaultMapColor())
                    .solid()
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block REDWOOD_FENCE_GATE = registerWithItem("redwood_fence_gate",
            new FenceGateBlock(WoodTypeList.REDWOOD, AbstractBlock.Settings.create()
                    .mapColor(REDWOOD_PLANKS.getDefaultMapColor())
                    .solid()
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .burnable()));
    public static final Block REDWOOD_DOOR = registerWithItem("redwood_door",
            new DoorBlock(BlockSetTypeList.REDWOOD, AbstractBlock.Settings.create()
                    .mapColor(REDWOOD_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block REDWOOD_TRAPDOOR = registerWithItem("redwood_trapdoor",
            new TrapdoorBlock(BlockSetTypeList.REDWOOD, AbstractBlock.Settings.create()
                    .mapColor(REDWOOD_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .burnable()));
    public static final Block REDWOOD_LEAVES = registerWithItem("redwood_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LICHEN_GREEN)
                    .strength(2.0F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final Block REDWOOD_SAPLING = registerWithItem("redwood_sapling",
            new SaplingBlock(ModSaplingGenerators.REDWOOD, AbstractBlock.Settings.create()
                    .mapColor(MapColor.DULL_RED)
                    .ticksRandomly()
                    .strength(0.0f)
                    .sounds(BlockSoundGroup.GRASS)
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final Block POTTED_REDWOOD_SAPLING = registerWithItem("potted_redwood_sapling",
            Blocks.createFlowerPotBlock(REDWOOD_SAPLING));

    private static final Identifier REDWOOD_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/redwood");
    private static final Identifier REDWOOD_HANGING_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/hanging/redwood");
    private static final Identifier REDWOOD_HANGING_SIGN_GUI_TEXTURE = NaturalMaterials.id("textures/gui/hanging_signs/redwood");
    public static final TerraformSignBlock REDWOOD_SIGN = registerWithItem("redwood_sign",
            new TerraformSignBlock(REDWOOD_SIGN_TEXTURE, AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .solid()
                    .instrument(NoteBlockInstrument.BASS)
                    .noCollision()
                    .strength(1.0F)
                    .burnable()));
    public static final TerraformWallSignBlock REDWOOD_WALL_SIGN = registerBlock("redwood_wall_sign",
            new TerraformWallSignBlock(REDWOOD_SIGN_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(REDWOOD_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .burnable()
                            .strength(1.0F)));
    public static final TerraformHangingSignBlock REDWOOD_HANGING_SIGN = registerWithItem("redwood_hanging_sign",
            new TerraformHangingSignBlock(REDWOOD_HANGING_SIGN_TEXTURE, REDWOOD_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(REDWOOD_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));
    public static final TerraformWallHangingSignBlock REDWOOD_WALL_HANGING_SIGN = registerBlock("redwood_wall_hanging_sign",
            new TerraformWallHangingSignBlock(REDWOOD_HANGING_SIGN_TEXTURE, REDWOOD_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(REDWOOD_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));


    public static final Block CYPRESS_LEAVES = registerWithItem("cypress_leaves",
         new LeavesBlock(AbstractBlock.Settings.create()
                 .mapColor(MapColor.LICHEN_GREEN)
                 .strength(2.0F)
                 .ticksRandomly()
                 .sounds(BlockSoundGroup.GRASS)
                 .nonOpaque()
                 .allowsSpawning(Blocks::canSpawnOnLeaves)
                 .suffocates(Blocks::never)
                 .burnable()
                 .pistonBehavior(PistonBehavior.DESTROY)
                 .solidBlock(Blocks::never)));
    public static final Block CYPRESS_LOG = registerWithItem("cypress_log",
            Blocks.createLogBlock(MapColor.GREEN, MapColor.DARK_GREEN));
    public static final Block STRIPPED_CYPRESS_LOG = registerWithItem("stripped_cypress_log",
            Blocks.createLogBlock(MapColor.GREEN, MapColor.DARK_GREEN));
    public static final Block CYPRESS_WOOD = registerWithItem("cypress_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_GREEN)
                    .instrument(NoteBlockInstrument.DIDGERIDOO)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block STRIPPED_CYPRESS_WOOD = registerWithItem("stripped_cypress_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.GREEN)
                    .instrument(NoteBlockInstrument.DIDGERIDOO)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block CYPRESS_PLANKS = registerWithItem("cypress_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN)));
    public static final Block CYPRESS_STAIRS = registerWithItem("cypress_stairs",
            new StairsBlock(ModBlocks.CYPRESS_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).mapColor(MapColor.PALE_GREEN)));
    public static final Block CYPRESS_SLAB = registerWithItem("cypress_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.PALE_GREEN)));
    public static final Block CYPRESS_BUTTON = registerWithItem("cypress_button",
            Blocks.createWoodenButtonBlock(BlockSetTypeList.CYPRESS));
    public static final Block CYPRESS_PRESSURE_PLATE = registerWithItem("cypress_pressure_plate",
            new PressurePlateBlock(BlockSetTypeList.CYPRESS, AbstractBlock.Settings.create()
                    .mapColor(CYPRESS_PLANKS.getDefaultMapColor())
                    .solid()
                    .noCollision()
                    .strength(0.5F)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CYPRESS_FENCE = registerWithItem("cypress_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .mapColor(CYPRESS_PLANKS.getDefaultMapColor())
                    .solid()
                    .instrument(NoteBlockInstrument.DIDGERIDOO)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block CYPRESS_FENCE_GATE = registerWithItem("cypress_fence_gate",
            new FenceGateBlock(WoodTypeList.CYPRESS, AbstractBlock.Settings.create()
                    .mapColor(CYPRESS_PLANKS.getDefaultMapColor())
                    .solid()
                    .instrument(NoteBlockInstrument.DIDGERIDOO)
                    .strength(2.0F, 3.0F)
                    .burnable()));
    public static final Block CYPRESS_DOOR = registerWithItem("cypress_door",
            new DoorBlock(BlockSetTypeList.CYPRESS, AbstractBlock.Settings.create()
                    .mapColor(CYPRESS_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.DIDGERIDOO)
                    .strength(3.0F)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CYPRESS_TRAPDOOR = registerWithItem("cypress_trapdoor",
            new TrapdoorBlock(BlockSetTypeList.CYPRESS, AbstractBlock.Settings.create()
                    .mapColor(CYPRESS_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.DIDGERIDOO)
                    .strength(3.0F)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .burnable()));
    public static final Block CYPRESS_SAPLING = registerWithItem("cypress_sapling",
            new SaplingBlock(ModSaplingGenerators.CYPRESS, AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_GREEN)
                    .ticksRandomly()
                    .strength(0.0f)
                    .sounds(BlockSoundGroup.GRASS)
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final Block POTTED_CYPRESS_SAPLING = registerWithItem("potted_cypress_sapling",
            Blocks.createFlowerPotBlock(CYPRESS_SAPLING));

    private static final Identifier CYPRESS_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/cypress");
    private static final Identifier CYPRESS_HANGING_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/hanging/cypress");
    private static final Identifier CYPRESS_HANGING_SIGN_GUI_TEXTURE = NaturalMaterials.id("textures/gui/hanging_signs/cypress");
    public static final TerraformSignBlock CYPRESS_SIGN = registerWithItem("cypress_sign",
            new TerraformSignBlock(CYPRESS_SIGN_TEXTURE, AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_GREEN)
                    .solid()
                    .instrument(NoteBlockInstrument.BASS)
                    .noCollision()
                    .strength(1.0F)
                    .burnable()));
    public static final TerraformWallSignBlock CYPRESS_WALL_SIGN = registerBlock("cypress_wall_sign",
            new TerraformWallSignBlock(CYPRESS_SIGN_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(CYPRESS_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .burnable()
                            .strength(1.0F)));
    public static final TerraformHangingSignBlock CYPRESS_HANGING_SIGN = registerWithItem("cypress_hanging_sign",
            new TerraformHangingSignBlock(CYPRESS_HANGING_SIGN_TEXTURE, CYPRESS_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(PALM_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));
    public static final TerraformWallHangingSignBlock CYPRESS_WALL_HANGING_SIGN = registerBlock("palm_wall_hanging_sign",
            new TerraformWallHangingSignBlock(CYPRESS_HANGING_SIGN_TEXTURE, CYPRESS_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(CYPRESS_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));


    public static final Block MANAWOOD_LOG = registerWithItem("manawood_log",
            Blocks.createLogBlock(MapColor.BLUE, MapColor.LAPIS_BLUE));
    public static final Block STRIPPED_MANAWOOD_LOG = registerWithItem("stripped_manawood_log",
            Blocks.createLogBlock(MapColor.LIGHT_BLUE_GRAY, MapColor.LIGHT_BLUE_GRAY));
    public static final Block MANAWOOD_WOOD = registerWithItem("manawood_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE_GRAY)
                    .instrument(NoteBlockInstrument.CHIME)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block STRIPPED_MANAWOOD_WOOD = registerWithItem("stripped_manawood_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE_GRAY)
                    .instrument(NoteBlockInstrument.CHIME)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block MANAWOOD_PLANKS = registerWithItem("manawood_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.BLUE)));
    public static final Block MANAWOOD_STAIRS = registerWithItem("manawood_stairs",
            new StairsBlock(ModBlocks.MANAWOOD_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).mapColor(MapColor.BLUE)));
    public static final Block MANAWOOD_SLAB = registerWithItem("manawood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.BLUE)));
    public static final Block MANAWOOD_BUTTON = registerWithItem("manawood_button",
            Blocks.createWoodenButtonBlock(BlockSetTypeList.MANAWOOD));
    public static final Block MANAWOOD_PRESSURE_PLATE = registerWithItem("manawood_pressure_plate",
            new PressurePlateBlock(BlockSetTypeList.MANAWOOD, AbstractBlock.Settings.create()
                    .mapColor(MANAWOOD_PLANKS.getDefaultMapColor())
                    .solid()
                    .noCollision()
                    .strength(0.5F)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MANAWOOD_FENCE = registerWithItem("manawood_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .mapColor(MANAWOOD_PLANKS.getDefaultMapColor())
                    .solid()
                    .instrument(NoteBlockInstrument.CHIME)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block MANAWOOD_FENCE_GATE = registerWithItem("manawood_fence_gate",
            new FenceGateBlock(WoodTypeList.MANAWOOD, AbstractBlock.Settings.create()
                    .mapColor(MANAWOOD_PLANKS.getDefaultMapColor())
                    .solid()
                    .instrument(NoteBlockInstrument.CHIME)
                    .strength(2.0F, 3.0F)
                    .burnable()));
    public static final Block MANAWOOD_DOOR = registerWithItem("manawood_door",
            new DoorBlock(BlockSetTypeList.MANAWOOD, AbstractBlock.Settings.create()
                    .mapColor(MANAWOOD_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.CHIME)
                    .strength(3.0F)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MANAWOOD_TRAPDOOR = registerWithItem("manawood_trapdoor",
            new TrapdoorBlock(BlockSetTypeList.MANAWOOD, AbstractBlock.Settings.create()
                    .mapColor(MANAWOOD_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.CHIME)
                    .strength(3.0F)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .burnable()));
    public static final Block MANAWOOD_LEAVES = registerWithItem("manawood_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .strength(2.0F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final Block MANAWOOD_SAPLING = registerWithItem("manawood_sapling",
            new SaplingBlock(ModSaplingGenerators.MANAWOOD, AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .ticksRandomly()
                    .strength(0.0f)
                    .sounds(BlockSoundGroup.GRASS)
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final Block POTTED_MANAWOOD_SAPLING = registerWithItem("potted_manawood_sapling",
            Blocks.createFlowerPotBlock(MANAWOOD_SAPLING));

    private static final Identifier MANAWOOD_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/manawoood");
    private static final Identifier MANAWOOD_HANGING_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/hanging/manawood");
    private static final Identifier MANAWOOD_HANGING_SIGN_GUI_TEXTURE = NaturalMaterials.id("textures/gui/hanging_signs/manawood");
    public static final TerraformSignBlock MANAWOOD_SIGN = registerWithItem("manawood_sign",
            new TerraformSignBlock(PALM_SIGN_TEXTURE, AbstractBlock.Settings.create()
                    .mapColor(MapColor.OAK_TAN)
                    .solid()
                    .instrument(NoteBlockInstrument.BASS)
                    .noCollision()
                    .strength(1.0F)
                    .burnable()));
    public static final TerraformWallSignBlock MANAWOOD_WALL_SIGN = registerBlock("manawood_wall_sign",
            new TerraformWallSignBlock(MANAWOOD_SIGN_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(MANAWOOD_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .burnable()
                            .strength(1.0F)));
    public static final TerraformHangingSignBlock MANAWOOD_HANGING_SIGN = registerWithItem("manawood_hanging_sign",
            new TerraformHangingSignBlock(MANAWOOD_HANGING_SIGN_TEXTURE, MANAWOOD_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(MANAWOOD_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));
    public static final TerraformWallHangingSignBlock MANAWOOD_WALL_HANGING_SIGN = registerBlock("manawood_wall_hanging_sign",
            new TerraformWallHangingSignBlock(MANAWOOD_HANGING_SIGN_TEXTURE, MANAWOOD_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(MANAWOOD_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));


    public static final Block GLOOMWOOD_LOG = registerWithItem("gloomwood_log",
            Blocks.createLogBlock(MapColor.GRAY, MapColor.DEEPSLATE_GRAY));
    public static final Block STRIPPED_GLOOMWOOD_LOG = registerWithItem("stripped_gloomwood_log",
            Blocks.createLogBlock(MapColor.GRAY, MapColor.GRAY));
    public static final Block GLOOMWOOD_WOOD = registerWithItem("gloomwood_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block STRIPPED_GLOOMWOOD_WOOD = registerWithItem("stripped_gloomwood_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block GLOOMWOOD_PLANKS = registerWithItem("gloomwood_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.DEEPSLATE_GRAY)));
    public static final Block GLOOMWOOD_STAIRS = registerWithItem("gloomwood_stairs",
            new StairsBlock(ModBlocks.MANAWOOD_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).mapColor(MapColor.DEEPSLATE_GRAY)));
    public static final Block GLOOMWOOD_SLAB = registerWithItem("gloomwood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.DEEPSLATE_GRAY)));
    public static final Block GLOOMWOOD_BUTTON = registerWithItem("gloomwood_button",
            Blocks.createWoodenButtonBlock(BlockSetTypeList.GLOOMWOOD));
    public static final Block GLOOMWOOD_PRESSURE_PLATE = registerWithItem("gloomwood_pressure_plate",
            new PressurePlateBlock(BlockSetTypeList.GLOOMWOOD, AbstractBlock.Settings.create()
                    .mapColor(GLOOMWOOD_PLANKS.getDefaultMapColor())
                    .solid()
                    .noCollision()
                    .strength(0.5F)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GLOOMWOOD_FENCE = registerWithItem("gloomwood_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .mapColor(GLOOMWOOD_PLANKS.getDefaultMapColor())
                    .solid()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block GLOOMWOOD_FENCE_GATE = registerWithItem("gloomwood_fence_gate",
            new FenceGateBlock(WoodTypeList.GLOOMWOOD, AbstractBlock.Settings.create()
                    .mapColor(GLOOMWOOD_PLANKS.getDefaultMapColor())
                    .solid()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(2.0F, 3.0F)
                    .burnable()));
    public static final Block GLOOMWOOD_DOOR = registerWithItem("gloomwood_door",
            new DoorBlock(BlockSetTypeList.GLOOMWOOD, AbstractBlock.Settings.create()
                    .mapColor(GLOOMWOOD_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(3.0F)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GLOOMWOOD_TRAPDOOR = registerWithItem("gloomwood_trapdoor",
            new TrapdoorBlock(BlockSetTypeList.GLOOMWOOD, AbstractBlock.Settings.create()
                    .mapColor(GLOOMWOOD_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(3.0F)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .burnable()));
    public static final Block GLOOMWOOD_LEAVES = registerWithItem("gloomwood_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LICHEN_GREEN)
                    .strength(2.0F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final Block GLOOMWOOD_SAPLING = registerWithItem("gloomwood_sapling",
            new SaplingBlock(ModSaplingGenerators.GLOOMWOOD, AbstractBlock.Settings.create()
                    .mapColor(MapColor.LICHEN_GREEN)
                    .ticksRandomly()
                    .strength(0.0f)
                    .sounds(BlockSoundGroup.GRASS)
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final Block POTTED_GLOOMWOOD_SAPLING = registerBlock("potted_gloomwood_sapling",
            Blocks.createFlowerPotBlock(GLOOMWOOD_SAPLING));

    private static final Identifier GLOOMWOOD_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/gloomwood");
    private static final Identifier GLOOMWOOD_HANGING_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/hanging/gloomwood");
    private static final Identifier GLOOMWOOD_HANGING_SIGN_GUI_TEXTURE = NaturalMaterials.id("textures/gui/hanging_signs/gloomwood");
    public static final TerraformSignBlock GLOOMWOOD_SIGN = registerWithItem("gloomwood_sign",
            new TerraformSignBlock(GLOOMWOOD_SIGN_TEXTURE, AbstractBlock.Settings.create()
                    .mapColor(MapColor.GRAY)
                    .solid()
                    .instrument(NoteBlockInstrument.BASS)
                    .noCollision()
                    .strength(1.0F)
                    .burnable()));
    public static final TerraformWallSignBlock GLOOMWOOD_WALL_SIGN = registerBlock("gloomwood_wall_sign",
            new TerraformWallSignBlock(GLOOMWOOD_SIGN_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(GLOOMWOOD_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .burnable()
                            .strength(1.0F)));
    public static final TerraformHangingSignBlock GLOOMWOOD_HANGING_SIGN = registerWithItem("gloomwood_hanging_sign",
            new TerraformHangingSignBlock(GLOOMWOOD_HANGING_SIGN_TEXTURE, GLOOMWOOD_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(GLOOMWOOD_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));
    public static final TerraformWallHangingSignBlock GLOOMWOOD_WALL_HANGING_SIGN = registerBlock("gloomwood_wall_hanging_sign",
            new TerraformWallHangingSignBlock(GLOOMWOOD_HANGING_SIGN_TEXTURE, GLOOMWOOD_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(GLOOMWOOD_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));


    public static final Block DUSKSLATE = registerWithItem("duskslate",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(3.0f, 6.0f)
                    .sounds(BlockSoundGroup.DEEPSLATE)
                    .mapColor(MapColor.BROWN)));
    public static final Block DUSKSLATE_STAIRS = registerWithItem("duskslate_stairs",
            new StairsBlock(ModBlocks.DUSKSLATE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_STAIRS).mapColor(MapColor.BROWN)));
    public static final Block DUSKSLATE_SLAB = registerWithItem("duskslate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_SLAB).mapColor(MapColor.BROWN)));
    public static final Block DUSKSLATE_BUTTON = registerWithItem("duskslate_button",
            Blocks.createStoneButtonBlock());
    public static final Block DUSKSLATE_WALL = registerWithItem("duskslate_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_WALL).mapColor(MapColor.BROWN)));
    public static final Block DUSKSLATE_PRESSURE_PLATE = registerWithItem("duskslate_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,
                    AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE).mapColor(MapColor.BROWN)
                            .pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block POLISHED_DUSKSLATE = registerWithItem("polished_duskslate",
            new Block(AbstractBlock.Settings.copy(ModBlocks.DUSKSLATE)));
    public static final Block POLISHED_DUSKSLATE_STAIRS = registerWithItem("polished_duskslate_stairs",
            new StairsBlock(ModBlocks.POLISHED_DUSKSLATE.getDefaultState(),
                    AbstractBlock.Settings.copy(ModBlocks.DUSKSLATE_STAIRS)));
    public static final Block POLISHED_DUSKSLATE_SLAB = registerWithItem("polished_duskslate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.DUSKSLATE_SLAB)));
    public static final Block POLISHED_DUSKSLATE_BUTTON = registerWithItem("polished_duskslate_button",
            Blocks.createStoneButtonBlock());
    public static final Block POLISHED_DUSKSLATE_WALL = registerWithItem("polished_duskslate_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.DUSKSLATE_WALL)));
    public static final Block POLISHED_DUSKSLATE_PRESSURE_PLATE = registerWithItem("polished_duskslate_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,
                    AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE).mapColor(MapColor.BROWN)
                            .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLUESHIST = registerWithItem("blueshist",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLUE)
                    .requiresTool()
                    .strength(3.0f, 3.0f)
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block BLUESHIST_STAIRS = registerWithItem("blueshist_stairs",
            new StairsBlock(ModBlocks.BLUESHIST.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.STONE_STAIRS).mapColor(MapColor.BLUE)));
    public static final Block BLUESHIST_SLAB = registerWithItem("blueshist_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB).mapColor(MapColor.BLUE)));
    public static final Block BLUESHIST_BUTTON = registerWithItem("blueshist_button",
            Blocks.createStoneButtonBlock());
    public static final Block BLUESHIST_WALL = registerWithItem("blueshist_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_WALL).mapColor(MapColor.BLUE)));
    public static final Block BLUESHIST_PRESSURE_PLATE = registerWithItem("blueshist_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,
                    AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)
                            .mapColor(MapColor.BLUE)
                            .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block POLISHED_BLUESHIST = registerWithItem("polished_blueshist",
            new Block(AbstractBlock.Settings.copy(ModBlocks.BLUESHIST).mapColor(MapColor.LAPIS_BLUE)));
    public static final Block POLISHED_BLUESHIST_STAIRS = registerWithItem("polished_blueshist_stairs",
            new StairsBlock(ModBlocks.POLISHED_BLUESHIST.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.STONE_STAIRS)));
    public static final Block POLISHED_BLUESHIST_SLAB = registerWithItem("polished_blueshist_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.BLUESHIST_SLAB).mapColor(MapColor.LAPIS_BLUE)));
    public static final Block POLISHED_BLUESHIST_BUTTON = registerWithItem("polished_blueshist_button",
            Blocks.createStoneButtonBlock());
    public static final Block POLISHED_BLUESHIST_WALL = registerWithItem("polished_blueshist_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.BLUESHIST_WALL).mapColor(MapColor.LAPIS_BLUE)));
    public static final Block POLISHED_BLUESHIST_PRESSURE_PLATE = registerWithItem("polished_blueshist_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,
                    AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)
                            .mapColor(MapColor.LAPIS_BLUE)
                            .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block VIRIDIUM_BLOCK = registerWithItem("viridium_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).mapColor(MapColor.DARK_GREEN)));
    public static final Block RAW_VIRIDIUM_BLOCK = registerWithItem("raw_viridium_block",
           new Block(AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK).mapColor(MapColor.EMERALD_GREEN)));
    public static final Block VIRIDIUM_STAIRS = registerWithItem("viridium_stairs",
            new StairsBlock(ModBlocks.VIRIDIUM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.STONE_STAIRS)
                            .mapColor(MapColor.DARK_GREEN)));
    public static final Block VIRIDIUM_SLAB = registerWithItem("viridium_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB).mapColor(MapColor.DARK_GREEN)));
    public static final Block VIRIDIUM_WALL = registerWithItem("viridium_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_GREEN)));
    public static final Block VIRIDIUM_PRESSURE_PLATE = registerWithItem("viridium_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.copy(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE)
                    .mapColor(MapColor.DARK_GREEN)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block THALRENITE_BLOCK = registerWithItem("thalrenite_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).mapColor(MapColor.DARK_AQUA)));
    public static final Block RAW_THALRENITE_BLOCK = registerWithItem("raw_thalrenite_block",
            new Block(AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK).mapColor(MapColor.TEAL)));
    public static final Block THALRENITE_STAIRS = registerWithItem("thalrenite_stairs",
            new StairsBlock(ModBlocks.THALRENITE_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_AQUA)));
    public static final Block THALRENITE_SLAB = registerWithItem("thalrenite_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB).mapColor(MapColor.DARK_AQUA)));
    public static final Block THALRENITE_WALL = registerWithItem("thalrenite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_AQUA)));
    public static final Block THALRENITE_PRESSURE_PLATE = registerWithItem("thalrenite_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.copy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)
                    .mapColor(MapColor.DARK_AQUA)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ENDRITE_BLOCK = registerWithItem("endrite_block",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK).mapColor(MapColor.TERRACOTTA_PURPLE)));



    public static <T extends Block> T registerBlock(String name, T block) {
        return Registry.register(Registries.BLOCK, NaturalMaterials.id(name), block);
    }
    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = registerBlock(name, block);
        ModItems.registerItem(name, new BlockItem(registered, settings));
        return registered;
    }
    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }
    public static void registerModBlocks() {
        NaturalMaterials.LOGGER.info("Registering Mod Blocks for " + NaturalMaterials.MOD_ID);
    }
}