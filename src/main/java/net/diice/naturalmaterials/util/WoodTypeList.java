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
}
