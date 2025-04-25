package net.diice.naturalmaterials.trim;

import net.diice.naturalmaterials.NaturalMaterials;
import net.diice.naturalmaterials.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import javax.swing.text.AttributeSet;
import java.util.Map;

public class ModTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> AMBER = RegistryKey.of(RegistryKeys.TRIM_MATERIAL, Identifier.of(NaturalMaterials.MOD_ID, "amber"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, AMBER, Registries.ITEM.getEntry(ModItems.AMBER),
                net.minecraft.text.Style.EMPTY.withColor(TextColor.parse("#b0efe0").getOrThrow()), 0.5f);
    }
    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimMaterialRegistryKey,
                                 RegistryEntry<Item> itemRegistryEntry, Style style, float itemModelIndex) {
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimMaterialRegistryKey.getValue().getPath(), itemRegistryEntry, itemModelIndex,
                Map.of(), Text.translatable(Util.createTranslationKey("trim_material",
                armorTrimMaterialRegistryKey.getValue())).fillStyle((net.minecraft.text.Style) style));

        registerable.register(armorTrimMaterialRegistryKey, trimMaterial);
    }

}
