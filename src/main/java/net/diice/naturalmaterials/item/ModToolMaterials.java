package net.diice.naturalmaterials.item;

import com.google.common.base.Suppliers;
import net.diice.naturalmaterials.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    AMBER(ModTags.Blocks.INCORRECT_FOR_AMBER_TOOL, 190, 5.0F, 3.0F, 13,
            () -> Ingredient.ofItems(ModItems.AMBER)),
    VIRIDIUM(ModTags.Blocks.INCORRECT_FOR_VIRIDIUM_TOOL, 906, 7.0f, 3.0f, 12,
            () -> Ingredient.ofItems(ModItems.VIRIDIUM_INGOT)),
    THALRENITE(ModTags.Blocks.INCORRECT_FOR_THALRENITE_TOOL, 1800, 9.0f, 4.0f, 13,
            () -> Ingredient.ofItems(ModItems.THALRENITE_INGOT)),
    ENDRITE(ModTags.Blocks.INCORRECT_FOR_ENDRITE_TOOL, 3047, 10.0F, 5.0F, 17,
            () -> Ingredient.ofItems(ModItems.ENDRITE_INGOT));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterials(
            final TagKey<Block> inverseTag,
            final int itemDurability,
            final float miningSpeed,
            final float attackDamage,
            final int enchantability,
            final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
