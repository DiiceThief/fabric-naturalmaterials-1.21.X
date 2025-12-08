package net.diice.naturalmaterials.block;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import net.diice.naturalmaterials.NaturalMaterials;
import net.diice.naturalmaterials.block.custom.ModSaplingBlock;
import net.diice.naturalmaterials.item.ModItems;
import net.diice.naturalmaterials.util.BlockSetTypeList;
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
    public static final StairsBlock PALM_STAIRS = registerBlock("palm_stairs",
            new StairsBlock(PALM_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));
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
    public static final FenceGateBlock PALM_FENCE_GATE = registerBlock("palm_fence_gate",
            new FenceGateBlock(WoodTypeList.PALM, AbstractBlock.Settings.create()
                    .mapColor(PALM_PLANKS.getDefaultMapColor())
                    .solid()
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(2.0F, 3.0F)
                    .burnable()));
    public static final DoorBlock PALM_DOOR = registerBlock("palm_door",
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
    public static final Block POTTED_PALM_SAPLING = registerBlock("potted_palm_sapling",
            Blocks.createFlowerPotBlock(PALM_SAPLING));

    private static final Identifier PALM_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/palm");
    private static final Identifier PALM_HANGING_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/hanging/palm");
    private static final Identifier PALM_HANGING_SIGN_GUI_TEXTURE = NaturalMaterials.id("textures/gui/hanging_signs/palm");
    public static final TerraformSignBlock PALM_SIGN = registerBlock("palm_sign",
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
    public static final TerraformHangingSignBlock PALM_HANGING_SIGN = registerBlock("palm_hanging_sign",
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
    public static final Block POTTED_REDWOOD_SAPLING = registerBlock("potted_redwood_sapling",
            Blocks.createFlowerPotBlock(REDWOOD_SAPLING));

    private static final Identifier REDWOOD_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/redwood");
    private static final Identifier REDWOOD_HANGING_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/hanging/redwood");
    private static final Identifier REDWOOD_HANGING_SIGN_GUI_TEXTURE = NaturalMaterials.id("textures/gui/hanging_signs/redwood");
    public static final TerraformSignBlock REDWOOD_SIGN = registerBlock("redwood_sign",
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
    public static final TerraformHangingSignBlock REDWOOD_HANGING_SIGN = registerBlock("redwood_hanging_sign",
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
            new SaplingBlock(ModSaplingGenerators.CYPRESS, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block POTTED_CYPRESS_SAPLING = registerBlock("potted_cypress_sapling",
            Blocks.createFlowerPotBlock(CYPRESS_SAPLING));

    private static final Identifier CYPRESS_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/cypress");
    private static final Identifier CYPRESS_HANGING_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/hanging/cypress");
    private static final Identifier CYPRESS_HANGING_SIGN_GUI_TEXTURE = NaturalMaterials.id("textures/gui/hanging_signs/cypress");
    public static final TerraformSignBlock CYPRESS_SIGN = registerBlock("cypress_sign",
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
    public static final TerraformHangingSignBlock CYPRESS_HANGING_SIGN = registerBlock("cypress_hanging_sign",
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
    public static final Block POTTED_MANAWOOD_SAPLING = registerBlock("potted_manawood_sapling",
            Blocks.createFlowerPotBlock(MANAWOOD_SAPLING));

    private static final Identifier MANAWOOD_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/manawoood");
    private static final Identifier MANAWOOD_HANGING_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/hanging/manawood");
    private static final Identifier MANAWOOD_HANGING_SIGN_GUI_TEXTURE = NaturalMaterials.id("textures/gui/hanging_signs/manawood");
    public static final TerraformSignBlock MANAWOOD_SIGN = registerBlock("manawood_sign",
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
    public static final TerraformHangingSignBlock MANAWOOD_HANGING_SIGN = registerBlock("manawood_hanging_sign",
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
    public static final Block POTTED_GLOOMWOOD_SAPLING = registerBlock("potted_gloomwood_sapling",
            Blocks.createFlowerPotBlock(GLOOMWOOD_SAPLING));

    private static final Identifier GLOOMWOOD_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/gloomwood");
    private static final Identifier GLOOMWOOD_HANGING_SIGN_TEXTURE = NaturalMaterials.id("entity/signs/hanging/gloomwood");
    private static final Identifier GLOOMWOOD_HANGING_SIGN_GUI_TEXTURE = NaturalMaterials.id("textures/gui/hanging_signs/gloomwood");
    public static final TerraformSignBlock GLOOMWOOD_SIGN = registerBlock("gloomwood_sign",
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
    public static final TerraformHangingSignBlock GLOOMWOOD_HANGING_SIGN = registerBlock("gloomwood_hanging_sign",
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



    public static <T extends Block> T registerBlock(String name, T block) {
        return Registry.register(Registries.BLOCK, NaturalMaterials.id(name), block);
    }
    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = registerBlock(name, block);
        ModItems.register(name, new BlockItem(registered, settings));
        return registered;
    }
    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }
    public static void registerModBlocks() {
        NaturalMaterials.LOGGER.info("Registering Mod Blocks for " + NaturalMaterials.MOD_ID);
    }
}