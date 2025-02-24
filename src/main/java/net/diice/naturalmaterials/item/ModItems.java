package net.diice.naturalmaterials.item;

import net.diice.naturalmaterials.NaturalMaterials;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(NaturalMaterials.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NaturalMaterials.LOGGER.info("Registering Mod Items for " + NaturalMaterials.MOD_ID);
    }
}
