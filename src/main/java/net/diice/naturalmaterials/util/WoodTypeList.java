package net.diice.naturalmaterials.util;

import net.diice.naturalmaterials.NaturalMaterials;
import net.minecraft.block.WoodType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class WoodTypeList {
    public static final WoodType PALM = new WoodType(
            NaturalMaterials.id("palm").toString(),
            BlockSetTypeList.PALM,
            BlockSoundGroup.WOOD,
            BlockSoundGroup.HANGING_SIGN,
            SoundEvents.BLOCK_FENCE_GATE_OPEN,
            SoundEvents.BLOCK_FENCE_GATE_CLOSE);

    public static final WoodType REDWOOD = new WoodType(
            NaturalMaterials.id("redwood").toString(),
            BlockSetTypeList.REDWOOD,
            BlockSoundGroup.WOOD,
            BlockSoundGroup.HANGING_SIGN,
            SoundEvents.BLOCK_FENCE_GATE_OPEN,
            SoundEvents.BLOCK_FENCE_GATE_CLOSE);

    public static final WoodType CYPRESS = new WoodType(
            NaturalMaterials.id("cypress").toString(),
            BlockSetTypeList.CYPRESS,
            BlockSoundGroup.WOOD,
            BlockSoundGroup.HANGING_SIGN,
            SoundEvents.BLOCK_FENCE_GATE_OPEN,
            SoundEvents.BLOCK_FENCE_GATE_CLOSE);

    public static final WoodType MANAWOOD = new WoodType(
            NaturalMaterials.id("manawood").toString(),
            BlockSetTypeList.MANAWOOD,
            BlockSoundGroup.WOOD,
            BlockSoundGroup.HANGING_SIGN,
            SoundEvents.BLOCK_FENCE_GATE_OPEN,
            SoundEvents.BLOCK_FENCE_GATE_CLOSE);

    public static final WoodType GLOOMWOOD = new WoodType(
            NaturalMaterials.id("gloomwood").toString(),
            BlockSetTypeList.GLOOMWOOD,
            BlockSoundGroup.WOOD,
            BlockSoundGroup.HANGING_SIGN,
            SoundEvents.BLOCK_FENCE_GATE_OPEN,
            SoundEvents.BLOCK_FENCE_GATE_CLOSE);
}
