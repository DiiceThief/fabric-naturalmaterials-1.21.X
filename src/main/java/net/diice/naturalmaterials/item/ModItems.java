package net.diice.naturalmaterials.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.diice.naturalmaterials.NaturalMaterials;
import net.diice.naturalmaterials.block.ModBlocks;
import net.diice.naturalmaterials.util.BoatInit;
import net.minecraft.item.*;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlag;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item AMBER = register("amber", new Item(new Item.Settings()));
    public static final Item RAW_VIRIDIUM = register("raw_viridium", new Item(new Item.Settings()));
    public static final Item VIRIDIUM_INGOT = register("viridium_ingot", new Item(new Item.Settings()));
    public static final Item RAW_THALRENITE = register("raw_thalrenite", new Item(new Item.Settings()));
    public static final Item THALRENITE_INGOT = register("thalrenite_ingot", new Item(new Item.Settings()));
    public static final Item ENDRITE_INGOT = register("endrite_ingot", new Item(new Item.Settings()));
    public static final Item ENDRITE_SHARD = register("endrite_shard", new Item(new Item.Settings()));

    public static final Item HUNTER_SMITHING_TEMPLATE = register("hunter_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(NaturalMaterials.MOD_ID, "hunter"), FeatureFlags.VANILLA));
    public static final Item ENDRITE_UPGRADE_SMITHING_TEMPLATE = register("endrite_upgrade_smithing_template",
            SmithingTemplateItem.of(Identifier.of(NaturalMaterials.MOD_ID, "endrite"), FeatureFlags.VANILLA));
    public static final Item AMBER_HELMET = register("amber_helmet",
            new ArmorItem(ModArmorMaterials.AMBER_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(10))));
    public static final Item AMBER_CHESTPLATE = register("amber_chestplate",
            new ArmorItem(ModArmorMaterials.AMBER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(10))));
    public static final Item AMBER_LEGGINGS = register("amber_leggings",
            new ArmorItem(ModArmorMaterials.AMBER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(10))));
    public static final Item AMBER_BOOTS = register("amber_boots",
            new ArmorItem(ModArmorMaterials.AMBER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(10))));
    public static final Item AMBER_SWORD = register("amber_sword",
            new SwordItem(ModToolMaterials.AMBER, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers
                    (ModToolMaterials.AMBER, 3, -2.4f))));
    public static final Item AMBER_PICKAXE = register("amber_pickaxe",
            new PickaxeItem(ModToolMaterials.AMBER, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers
                    (ModToolMaterials.AMBER, 1, -2.8f))));
    public static final Item AMBER_SHOVEL = register("amber_shovel",
            new ShovelItem(ModToolMaterials.AMBER, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers
                    (ModToolMaterials.AMBER, 1.5f, -3.0f))));
    public static final Item AMBER_AXE = register("amber_axe",
            new AxeItem(ModToolMaterials.AMBER, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers
                    (ModToolMaterials.AMBER, 6, -3.2f))));
    public static final Item AMBER_HOE = register("amber_hoe",
            new HoeItem(ModToolMaterials.AMBER, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers
                    (ModToolMaterials.AMBER, 0, -3.0f))));

    public static final Item VIRIDIUM_HELMET = register("viridium_helmet",
            new ArmorItem(ModArmorMaterials.VIRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(24))));
    public static final Item VIRIDIUM_CHESTPLATE = register("viridium_chestplate",
            new ArmorItem(ModArmorMaterials.VIRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(24))));
    public static final Item VIRIDIUM_LEGGINGS = register("viridium_leggings",
            new ArmorItem(ModArmorMaterials.VIRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(24))));
    public static final Item VIRIDIUM_BOOTS = register("viridium_boots",
            new ArmorItem(ModArmorMaterials.VIRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(24))));
    public static final Item VIRIDIUM_SWORD = register("viridium_sword",
            new SwordItem(ModToolMaterials.VIRIDIUM, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers
                    (ModToolMaterials.VIRIDIUM, 3, -2.4f))));
    public static final Item VIRIDIUM_PICKAXE = register("viridium_pickaxe",
            new PickaxeItem(ModToolMaterials.VIRIDIUM, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers
                    (ModToolMaterials.VIRIDIUM, 1, -2.8f))));
    public static final Item VIRIDIUM_SHOVEL = register("viridium_shovel",
            new ShovelItem(ModToolMaterials.VIRIDIUM, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers
                    (ModToolMaterials.VIRIDIUM, 1.5f, -3.0f))));
    public static final Item VIRIDIUM_AXE = register("viridium_axe",
            new AxeItem(ModToolMaterials.VIRIDIUM, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers
                    (ModToolMaterials.VIRIDIUM, 6, -3.0f))));
    public static final Item VIRIDIUM_HOE = register("viridium_hoe",
            new HoeItem(ModToolMaterials.VIRIDIUM, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers
                    (ModToolMaterials.VIRIDIUM, 1, -2.0f))));

    public static final Item THALRENITE_HELMET = register("thalrenite_helmet",
            new ArmorItem(ModArmorMaterials.THALRENITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(35))));
    public static final Item THALRENITE_CHESTPLATE = register("thalrenite_chestplate",
            new ArmorItem(ModArmorMaterials.THALRENITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(35))));
    public static final Item THALRENITE_LEGGINGS = register("thalrenite_leggings",
            new ArmorItem(ModArmorMaterials.THALRENITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(35))));
    public static final Item THALRENITE_BOOTS = register("thalrenite_boots",
            new ArmorItem(ModArmorMaterials.THALRENITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(35))));
    public static final Item THALRENITE_SWORD = register("thalrenite_sword",
            new SwordItem(ModToolMaterials.THALRENITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers
                    (ModToolMaterials.THALRENITE, 3, -2.4f))));
    public static final Item THALRENITE_PICKAXE = register("thalrenite_pickaxe",
            new PickaxeItem(ModToolMaterials.THALRENITE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers
                    (ModToolMaterials.THALRENITE, 1, -2.8f))));
    public static final Item THALRENITE_SHOVEL = register("thalrenite_shovel",
            new ShovelItem(ModToolMaterials.THALRENITE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers
                    (ModToolMaterials.THALRENITE, 1.5f, -3.0f))));
    public static final Item THALRENITE_AXE = register("thalrenite_axe",
            new AxeItem(ModToolMaterials.THALRENITE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers
                    (ModToolMaterials.THALRENITE, 6, -3.0f))));
    public static final Item THALRENITE_HOE = register("thalrenite_hoe",
            new HoeItem(ModToolMaterials.THALRENITE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers
                    (ModToolMaterials.THALRENITE, 4, -0.0f))));

    public static final Item ENDRITE_HELMET = register("endrite_helmet",
            new ArmorItem(ModArmorMaterials.ENDRITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(40))));
    public static final Item ENDRITE_CHESTPLATE = register("endrite_chestplate",
            new ArmorItem(ModArmorMaterials.ENDRITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(40))));
    public static final Item ENDRITE_LEGGINGS = register("endrite_leggings",
            new ArmorItem(ModArmorMaterials.ENDRITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(40))));
    public static final Item ENDRITE_BOOTS = register("endrite_boots",
            new ArmorItem(ModArmorMaterials.ENDRITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(40))));
    public static final Item ENDRITE_SWORD = register("endrite_sword",
            new SwordItem(ModToolMaterials.ENDRITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers
                    (ModToolMaterials.ENDRITE, 5, -2.0f))));
    public static final Item ENDRITE_PICKAXE = register("endrite_pickaxe",
            new PickaxeItem(ModToolMaterials.ENDRITE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers
                    (ModToolMaterials.ENDRITE, 2, -2.4f))));
    public static final Item ENDRITE_SHOVEL = register("endrite_shovel",
            new ShovelItem(ModToolMaterials.THALRENITE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers
                    (ModToolMaterials.THALRENITE, 2.5f, -2.6f))));
    public static final Item ENDRITE_AXE = register("endrite_axe",
            new AxeItem(ModToolMaterials.ENDRITE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers
                    (ModToolMaterials.ENDRITE, 8, -2.6f))));
    public static final Item ENDRITE_HOE = register("endrite_hoe",
            new HoeItem(ModToolMaterials.ENDRITE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers
                    (ModToolMaterials.ENDRITE, 5, -0.0f))));

    public static final SignItem PALM_SIGN = register("palm_sign",
            new SignItem(new Item.Settings().maxCount(16), ModBlocks.PALM_SIGN, ModBlocks.PALM_WALL_SIGN));
    public static final SignItem PALM_HANGING_SIGN = register("palm_hanging_sign",
            new HangingSignItem(ModBlocks.PALM_HANGING_SIGN, ModBlocks.PALM_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));
    public static final Item PALM_BOAT = TerraformBoatItemHelper.registerBoatItem(BoatInit.PALM_BOAT_ID, BoatInit.PALM_BOAT_KEY, false);
    public static final Item PALM_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(BoatInit.PALM_BOAT_ID, BoatInit.PALM_BOAT_KEY, true);

    public static <T extends Item> T register (String name, T item) {
        return Registry.register(Registries.ITEM, NaturalMaterials.id(name), item);
    }

    public static void registerModItems() {
        NaturalMaterials.LOGGER.info("Registering Mod Items for " + NaturalMaterials.MOD_ID);
    }
}
