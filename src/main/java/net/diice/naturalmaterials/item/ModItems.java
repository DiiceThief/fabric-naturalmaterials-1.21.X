package net.diice.naturalmaterials.item;

import net.diice.naturalmaterials.NaturalMaterials;
import net.minecraft.item.*;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlag;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item AMBER = registerItem("amber", new Item(new Item.Settings()));
    public static final Item RAW_VIRIDIUM = registerItem("raw_viridium", new Item(new Item.Settings()));
    public static final Item VIRIDIUM_INGOT = registerItem("viridium_ingot", new Item(new Item.Settings()));
    public static final Item RAW_THALRENITE = registerItem("raw_thalrenite", new Item(new Item.Settings()));
    public static final Item THALRENITE_INGOT = registerItem("thalrenite_ingot", new Item(new Item.Settings()));

    public static final Item HUNTER_SMITHING_TEMPLATE = registerItem("hunter_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(NaturalMaterials.MOD_ID, "hunter"), FeatureFlags.VANILLA));
    public static final Item AMBER_HELMET = registerItem("amber_helmet",
            new ArmorItem(ModArmorMaterials.AMBER_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(10))));
    public static final Item AMBER_CHESTPLATE = registerItem("amber_chestplate",
            new ArmorItem(ModArmorMaterials.AMBER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(10))));
    public static final Item AMBER_LEGGINGS = registerItem("amber_leggings",
            new ArmorItem(ModArmorMaterials.AMBER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(10))));
    public static final Item AMBER_BOOTS = registerItem("amber_boots",
            new ArmorItem(ModArmorMaterials.AMBER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(10))));
    public static final Item AMBER_SWORD = registerItem("amber_sword",
            new SwordItem(ModToolMaterials.AMBER, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers
                    (ModToolMaterials.AMBER, 3, -2.4f))));
    public static final Item AMBER_PICKAXE = registerItem("amber_pickaxe",
            new PickaxeItem(ModToolMaterials.AMBER, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers
                    (ModToolMaterials.AMBER, 1, -2.8f))));
    public static final Item AMBER_SHOVEL = registerItem("amber_shovel",
            new ShovelItem(ModToolMaterials.AMBER, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers
                    (ModToolMaterials.AMBER, 1.5f, -3.0f))));
    public static final Item AMBER_AXE = registerItem("amber_axe",
            new AxeItem(ModToolMaterials.AMBER, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers
                    (ModToolMaterials.AMBER, 6, -3.2f))));
    public static final Item AMBER_HOE = registerItem("amber_hoe",
            new HoeItem(ModToolMaterials.AMBER, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers
                    (ModToolMaterials.AMBER, 0, -3.0f))));

    public static final Item VIRIDIUM_HELMET = registerItem("viridium_helmet",
            new ArmorItem(ModArmorMaterials.VIRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(24))));
    public static final Item VIRIDIUM_CHESTPLATE = registerItem("viridium_chestplate",
            new ArmorItem(ModArmorMaterials.VIRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(24))));
    public static final Item VIRIDIUM_LEGGINGS = registerItem("viridium_leggings",
            new ArmorItem(ModArmorMaterials.VIRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(24))));
    public static final Item VIRIDIUM_BOOTS = registerItem("viridium_boots",
            new ArmorItem(ModArmorMaterials.VIRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(24))));
    public static final Item VIRIDIUM_SWORD = registerItem("viridium_sword",
            new SwordItem(ModToolMaterials.VIRIDIUM, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers
                    (ModToolMaterials.VIRIDIUM, 3, -2.4f))));
    public static final Item VIRIDIUM_PICKAXE = registerItem("viridium_pickaxe",
            new PickaxeItem(ModToolMaterials.VIRIDIUM, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers
                    (ModToolMaterials.VIRIDIUM, 1, -2.8f))));
    public static final Item VIRIDIUM_SHOVEL = registerItem("viridium_shovel",
            new ShovelItem(ModToolMaterials.VIRIDIUM, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers
                    (ModToolMaterials.VIRIDIUM, 1.5f, -3.0f))));
    public static final Item VIRIDIUM_AXE = registerItem("viridium_axe",
            new AxeItem(ModToolMaterials.VIRIDIUM, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers
                    (ModToolMaterials.VIRIDIUM, 6, -3.0f))));
    public static final Item VIRIDIUM_HOE = registerItem("viridium_hoe",
            new HoeItem(ModToolMaterials.VIRIDIUM, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers
                    (ModToolMaterials.VIRIDIUM, 1, -2.0f))));

    public static final Item THALRENITE_HELMET = registerItem("thalrenite_helmet",
            new ArmorItem(ModArmorMaterials.THALRENITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(35))));
    public static final Item THALRENITE_CHESTPLATE = registerItem("thalrenite_chestplate",
            new ArmorItem(ModArmorMaterials.VIRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(35))));
    public static final Item THALRENITE_LEGGINGS = registerItem("thalrenite_leggings",
            new ArmorItem(ModArmorMaterials.THALRENITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(35))));
    public static final Item THALRENITE_BOOTS = registerItem("thalrenite_boots",
            new ArmorItem(ModArmorMaterials.THALRENITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(35))));
    public static final Item THALRENITE_SWORD = registerItem("thalrenite_sword",
            new SwordItem(ModToolMaterials.THALRENITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers
                    (ModToolMaterials.THALRENITE, 3, -2.4f))));
    public static final Item THALRENITE_PICKAXE = registerItem("thalrenite_pickaxe",
            new PickaxeItem(ModToolMaterials.THALRENITE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers
                    (ModToolMaterials.THALRENITE, 1, -2.8f))));
    public static final Item THALRENITE_SHOVEL = registerItem("thalrenite_shovel",
            new ShovelItem(ModToolMaterials.THALRENITE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers
                    (ModToolMaterials.THALRENITE, 1.5f, -3.0f))));
    public static final Item THALRENITE_AXE = registerItem("thalrenite_axe",
            new AxeItem(ModToolMaterials.THALRENITE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers
                    (ModToolMaterials.THALRENITE, 6, -3.0f))));
    public static final Item THALRENITE_HOE = registerItem("thalrenite_hoe",
            new HoeItem(ModToolMaterials.THALRENITE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers
                    (ModToolMaterials.THALRENITE, 4, -0.0f))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(NaturalMaterials.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NaturalMaterials.LOGGER.info("Registering Mod Items for " + NaturalMaterials.MOD_ID);
    }
}
