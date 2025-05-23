package net.diice.naturalmaterials.world;

import net.diice.naturalmaterials.NaturalMaterials;
import net.diice.naturalmaterials.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.SpruceFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> CYPRESS_KEY = registerKey("cypress");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALM_KEY = registerKey("palm");
    public static final RegistryKey<ConfiguredFeature<?, ?>> REDWOOD_KEY = registerKey("redwood");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MANAWOOD_KEY = registerKey("manawood");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {


        register(context, PALM_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PALM_LOG),
                new TrunkPlacer(5, 2, 2) {
                    @Override
                    protected TrunkPlacerType<?> getType() {
                        return null;
                    }

                    @Override
                    public List<FoliagePlacer.TreeNode>
                    generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random,
                             int height, BlockPos startPos, TreeFeatureConfig config) {
                        return null;
                    }
                },
                BlockStateProvider.of(ModBlocks.PALM_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(1), 1),
                new TwoLayersFeatureSize(1, 0, 2)).build());
    }



    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(NaturalMaterials.MOD_ID, name));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

