package net.diice.naturalmaterials.world;

import net.diice.naturalmaterials.NaturalMaterials;
import net.diice.naturalmaterials.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.ArrayList;
import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> CYPRESS_PLACED_KEY = registerKey("cypress_placed");
    public static final RegistryKey<PlacedFeature> PALM_PLACED_KEY = registerKey("palm_placed");
    public static final RegistryKey<PlacedFeature> REDWOOD_PLACED_KEY = registerKey("redwood_placed");

    public static final RegistryKey<PlacedFeature> MANAWOOD_PLACED_KEY = registerKey("manawood_placed");
    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, CYPRESS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CYPRESS_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.1f, 2),
                        ModBlocks.CYPRESS_SAPLING));

        register(context, PALM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PALM_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.1f, 2),
                        ModBlocks.PALM_SAPLING));

        register(context, REDWOOD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.REDWOOD_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.1f, 2),
                        ModBlocks.REDWOOD_SAPLING));

        register(context, MANAWOOD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MANAWOOD_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.1f, 2),
                        ModBlocks.MANAWOOD_SAPLING));

    }
    public static RegistryKey<PlacedFeature> registerKey (String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(NaturalMaterials.MOD_ID, name));

    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }


}
