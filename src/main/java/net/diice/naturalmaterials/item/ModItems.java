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
                    (ModToolMaterials.AMBER, 0, -3f))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(NaturalMaterials.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NaturalMaterials.LOGGER.info("Registering Mod Items for " + NaturalMaterials.MOD_ID);
    }
}
