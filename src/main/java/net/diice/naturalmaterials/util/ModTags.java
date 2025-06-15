package net.diice.naturalmaterials.util;

import net.diice.naturalmaterials.NaturalMaterials;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_AMBER_TOOL = createtag("needs_amber_tool");
        public static final TagKey<Block> INCORRECT_FOR_AMBER_TOOL = createtag("incorrect_for_amber_tool");

        private static TagKey<Block> createtag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(NaturalMaterials.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createtag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(NaturalMaterials.MOD_ID, name));
        }
    }
}
