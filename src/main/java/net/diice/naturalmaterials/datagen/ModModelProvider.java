package net.diice.naturalmaterials.datagen;

import net.diice.naturalmaterials.block.ModBlocks;
import net.diice.naturalmaterials.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        var palmFamily = new BlockFamily.Builder(ModBlocks.PALM_PLANKS)
                .button(ModBlocks.PALM_BUTTON)
                .pressurePlate(ModBlocks.PALM_PRESSURE_PLATE)
                .fence(ModBlocks.PALM_FENCE)
                .fenceGate(ModBlocks.PALM_FENCE_GATE)
                .sign(ModBlocks.PALM_SIGN, ModBlocks.PALM_WALL_SIGN)
                .slab(ModBlocks.PALM_SLAB)
                .stairs(ModBlocks.PALM_STAIRS)
                .door(ModBlocks.PALM_DOOR)
                .trapdoor(ModBlocks.PALM_TRAPDOOR)
                .group("wooden")
                .unlockCriterionName("has_planks")
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(palmFamily.getBaseBlock()).family(palmFamily);

        blockStateModelGenerator.registerLog(ModBlocks.PALM_LOG)
                .log(ModBlocks.PALM_LOG)
                .wood(ModBlocks.PALM_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PALM_LOG)
                .log(ModBlocks.STRIPPED_PALM_LOG)
                .wood(ModBlocks.STRIPPED_PALM_WOOD);
        blockStateModelGenerator.registerSingleton(ModBlocks.PALM_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PALM_SAPLING,
                ModBlocks.POTTED_PALM_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_PALM_LOG,
                ModBlocks.PALM_HANGING_SIGN, ModBlocks.PALM_WALL_HANGING_SIGN);

        var redwoodFamily = new BlockFamily.Builder(ModBlocks.REDWOOD_PLANKS)
                .button(ModBlocks.REDWOOD_BUTTON)
                .pressurePlate(ModBlocks.REDWOOD_PRESSURE_PLATE)
                .fence(ModBlocks.REDWOOD_FENCE)
                .fenceGate(ModBlocks.REDWOOD_FENCE_GATE)
                .sign(ModBlocks.REDWOOD_SIGN, ModBlocks.REDWOOD_WALL_SIGN)
                .slab(ModBlocks.REDWOOD_SLAB)
                .stairs(ModBlocks.REDWOOD_STAIRS)
                .door(ModBlocks.REDWOOD_DOOR)
                .trapdoor(ModBlocks.REDWOOD_TRAPDOOR)
                .group("wooden")
                .unlockCriterionName("has_planks")
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(redwoodFamily.getBaseBlock()).family(redwoodFamily);


        blockStateModelGenerator.registerLog(ModBlocks.REDWOOD_LOG)
                .log(ModBlocks.REDWOOD_LOG)
                .wood(ModBlocks.REDWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_REDWOOD_LOG)
                .log(ModBlocks.STRIPPED_REDWOOD_LOG)
                .wood(ModBlocks.STRIPPED_REDWOOD_WOOD);
        blockStateModelGenerator.registerSingleton(ModBlocks.REDWOOD_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.REDWOOD_SAPLING,
                ModBlocks.POTTED_REDWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        var cypressFamily = new BlockFamily.Builder(ModBlocks.CYPRESS_PLANKS)
                .button(ModBlocks.CYPRESS_BUTTON)
                .pressurePlate(ModBlocks.CYPRESS_PRESSURE_PLATE)
                .fence(ModBlocks.CYPRESS_FENCE)
                .fenceGate(ModBlocks.CYPRESS_FENCE_GATE)
                .sign(ModBlocks.CYPRESS_SIGN, ModBlocks.CYPRESS_WALL_SIGN)
                .slab(ModBlocks.CYPRESS_SLAB)
                .stairs(ModBlocks.CYPRESS_STAIRS)
                .door(ModBlocks.CYPRESS_DOOR)
                .trapdoor(ModBlocks.CYPRESS_TRAPDOOR)
                .group("wooden")
                .unlockCriterionName("has_planks")
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(cypressFamily.getBaseBlock()).family(cypressFamily);

        blockStateModelGenerator.registerLog(ModBlocks.CYPRESS_LOG)
                .log(ModBlocks.CYPRESS_LOG)
                .wood(ModBlocks.CYPRESS_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_CYPRESS_LOG)
                .log(ModBlocks.STRIPPED_CYPRESS_LOG)
                .wood(ModBlocks.STRIPPED_CYPRESS_WOOD);
        blockStateModelGenerator.registerSingleton(ModBlocks.CYPRESS_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CYPRESS_SAPLING,
                ModBlocks.POTTED_CYPRESS_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        var manawoodFamily = new BlockFamily.Builder(ModBlocks.MANAWOOD_PLANKS)
                .button(ModBlocks.MANAWOOD_BUTTON)
                .pressurePlate(ModBlocks.MANAWOOD_PRESSURE_PLATE)
                .fence(ModBlocks.MANAWOOD_FENCE)
                .fenceGate(ModBlocks.MANAWOOD_FENCE_GATE)
                .sign(ModBlocks.MANAWOOD_SIGN, ModBlocks.MANAWOOD_WALL_SIGN)
                .slab(ModBlocks.MANAWOOD_SLAB)
                .stairs(ModBlocks.MANAWOOD_STAIRS)
                .door(ModBlocks.MANAWOOD_DOOR)
                .trapdoor(ModBlocks.MANAWOOD_TRAPDOOR)
                .group("wooden")
                .unlockCriterionName("has_planks")
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(manawoodFamily.getBaseBlock()).family(manawoodFamily);

        blockStateModelGenerator.registerLog(ModBlocks.MANAWOOD_LOG)
                .log(ModBlocks.MANAWOOD_LOG)
                .wood(ModBlocks.MANAWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_MANAWOOD_LOG)
                .log(ModBlocks.STRIPPED_MANAWOOD_LOG)
                .wood(ModBlocks.STRIPPED_MANAWOOD_WOOD);
        blockStateModelGenerator.registerSingleton(ModBlocks.MANAWOOD_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MANAWOOD_SAPLING,
                ModBlocks.POTTED_MANAWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        var gloomwoodFamily = new BlockFamily.Builder(ModBlocks.GLOOMWOOD_PLANKS)
                .button(ModBlocks.GLOOMWOOD_BUTTON)
                .pressurePlate(ModBlocks.GLOOMWOOD_PRESSURE_PLATE)
                .fence(ModBlocks.GLOOMWOOD_FENCE)
                .fenceGate(ModBlocks.GLOOMWOOD_FENCE_GATE)
                .sign(ModBlocks.GLOOMWOOD_SIGN, ModBlocks.GLOOMWOOD_WALL_SIGN)
                .slab(ModBlocks.GLOOMWOOD_SLAB)
                .stairs(ModBlocks.GLOOMWOOD_STAIRS)
                .door(ModBlocks.GLOOMWOOD_DOOR)
                .trapdoor(ModBlocks.GLOOMWOOD_TRAPDOOR)
                .group("wooden")
                .unlockCriterionName("has_planks")
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(gloomwoodFamily.getBaseBlock()).family(gloomwoodFamily);

        blockStateModelGenerator.registerLog(ModBlocks.GLOOMWOOD_LOG)
                .log(ModBlocks.GLOOMWOOD_LOG)
                .wood(ModBlocks.GLOOMWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_GLOOMWOOD_LOG)
                .log(ModBlocks.STRIPPED_GLOOMWOOD_LOG)
                .wood(ModBlocks.STRIPPED_GLOOMWOOD_WOOD);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GLOOMWOOD_SAPLING,
                ModBlocks.POTTED_GLOOMWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerSingleton(ModBlocks.GLOOMWOOD_LEAVES, TexturedModel.LEAVES);

        var duskslateFamily = new BlockFamily.Builder(ModBlocks.DUSKSLATE)
                .wall(ModBlocks.DUSKSLATE_WALL)
                .stairs(ModBlocks.DUSKSLATE_STAIRS)
                .button(ModBlocks.DUSKSLATE_BUTTON)
                .slab(ModBlocks.DUSKSLATE_SLAB)
                .pressurePlate(ModBlocks.DUSKSLATE_PRESSURE_PLATE)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(duskslateFamily.getBaseBlock()).family(duskslateFamily);

        var blueshistFamily = new BlockFamily.Builder(ModBlocks.BLUESHIST)
                .stairs(ModBlocks.BLUESHIST_STAIRS)
                .slab(ModBlocks.BLUESHIST_SLAB)
                .wall(ModBlocks.BLUESHIST_WALL)
                .button(ModBlocks.BLUESHIST_BUTTON)
                .pressurePlate(ModBlocks.BLUESHIST_PRESSURE_PLATE)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(blueshistFamily.getBaseBlock()).family(blueshistFamily);

        var polishedDuskslateFamily = new BlockFamily.Builder(ModBlocks.POLISHED_DUSKSLATE)
                .stairs(ModBlocks.POLISHED_DUSKSLATE_STAIRS)
                .slab(ModBlocks.POLISHED_DUSKSLATE_SLAB)
                .wall(ModBlocks.POLISHED_DUSKSLATE_WALL)
                .button(ModBlocks.POLISHED_DUSKSLATE_BUTTON)
                .pressurePlate(ModBlocks.POLISHED_DUSKSLATE_PRESSURE_PLATE)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(polishedDuskslateFamily.getBaseBlock()).family(polishedDuskslateFamily);

        var polishedBlueshistFamily = new BlockFamily.Builder(ModBlocks.POLISHED_BLUESHIST)
                .stairs(ModBlocks.POLISHED_BLUESHIST_STAIRS)
                .slab(ModBlocks.POLISHED_BLUESHIST_SLAB)
                .wall(ModBlocks.POLISHED_BLUESHIST_WALL)
                .button(ModBlocks.POLISHED_BLUESHIST_BUTTON)
                .pressurePlate(ModBlocks.POLISHED_BLUESHIST_PRESSURE_PLATE)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(polishedBlueshistFamily.getBaseBlock()).family(polishedBlueshistFamily);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_VIRIDIUM_BLOCK);
        var viridiumFamily = new BlockFamily.Builder(ModBlocks.VIRIDIUM_BLOCK)
                .stairs(ModBlocks.VIRIDIUM_STAIRS)
                .slab(ModBlocks.VIRIDIUM_SLAB)
                .wall(ModBlocks.VIRIDIUM_WALL)
                .pressurePlate(ModBlocks.VIRIDIUM_PRESSURE_PLATE)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(viridiumFamily.getBaseBlock()).family(viridiumFamily);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_THALRENITE_BLOCK);
        var thalreniteFamily = new BlockFamily.Builder(ModBlocks.THALRENITE_BLOCK)
                .stairs(ModBlocks.THALRENITE_STAIRS)
                .slab(ModBlocks.THALRENITE_SLAB)
                .wall(ModBlocks.THALRENITE_WALL)
                .pressurePlate(ModBlocks.THALRENITE_PRESSURE_PLATE)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(thalreniteFamily.getBaseBlock()).family(thalreniteFamily);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDRITE_BLOCK);
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.AMBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_VIRIDIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.VIRIDIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_THALRENITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.THALRENITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.HUNTER_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDRITE_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDRITE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.PALM_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PALM_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMBER_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMBER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMBER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMBER_HELMET));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VIRIDIUM_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VIRIDIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VIRIDIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VIRIDIUM_HELMET));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.THALRENITE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.THALRENITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.THALRENITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.THALRENITE_HELMET));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDRITE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDRITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDRITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDRITE_HELMET));

        itemModelGenerator.register(ModItems.AMBER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMBER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMBER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMBER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMBER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.VIRIDIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VIRIDIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VIRIDIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VIRIDIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VIRIDIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.THALRENITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THALRENITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THALRENITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THALRENITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THALRENITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ENDRITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDRITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDRITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDRITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDRITE_HOE, Models.HANDHELD);
    }
}
