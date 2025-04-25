package net.diice.naturalmaterials.item;

import net.diice.naturalmaterials.NaturalMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.SmithingTemplateItem;
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

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(NaturalMaterials.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NaturalMaterials.LOGGER.info("Registering Mod Items for " + NaturalMaterials.MOD_ID);
    }
}
