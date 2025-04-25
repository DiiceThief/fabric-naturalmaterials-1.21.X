package net.diice.naturalmaterials.world.tree;

import net.diice.naturalmaterials.NaturalMaterials;
import net.diice.naturalmaterials.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

    public class ModSaplingGenerators {
        public static final SaplingGenerator CYPRESS = new SaplingGenerator(NaturalMaterials.MOD_ID + ":cypress",
                Optional.empty(), Optional.of(ModConfiguredFeatures.CYPRESS_KEY), Optional.empty());
        public static final SaplingGenerator REDWOOD = new SaplingGenerator(NaturalMaterials.MOD_ID + ":redwood",
                Optional.empty(), Optional.of(ModConfiguredFeatures.REDWOOD_KEY), Optional.empty());
        public static final SaplingGenerator PALM = new SaplingGenerator(NaturalMaterials.MOD_ID + ":palm",
                Optional.empty(), Optional.of(ModConfiguredFeatures.PALM_KEY), Optional.empty());
        public static final SaplingGenerator MANAWOOD = new SaplingGenerator(NaturalMaterials.MOD_ID + ":manawood",
                Optional.empty(), Optional.of(ModConfiguredFeatures.MANAWOOD_KEY), Optional.empty());

    }
