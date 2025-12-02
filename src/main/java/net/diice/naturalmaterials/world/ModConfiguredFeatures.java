package net.diice.naturalmaterials.world;

import com.google.common.collect.ImmutableList;
import net.diice.naturalmaterials.NaturalMaterials;
import net.diice.naturalmaterials.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ImmutableBlockBox;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator;
import net.minecraft.world.gen.trunk.*;

import java.util.List;
import java.util.OptionalInt;
import java.util.function.BiConsumer;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> CYPRESS_KEY = registerKey("cypress");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALM_KEY = registerKey("palm");
    public static final RegistryKey<ConfiguredFeature<?, ?>> REDWOOD_KEY = registerKey("redwood");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MANAWOOD_KEY = registerKey("manawood");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GLOOMWOOD_KEY = registerKey("gloomwood");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {


        register(context, PALM_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PALM_LOG),
                new BendingTrunkPlacer(5, 2, 2, 6, UniformIntProvider.create(1, 2)),
                BlockStateProvider.of(ModBlocks.PALM_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 1),
                new TwoLayersFeatureSize(1, 0, 2)).dirtProvider(BlockStateProvider.of(Blocks.SAND)).build());


        register(context, CYPRESS_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.CYPRESS_LOG),
                new StraightTrunkPlacer(2, 2 ,2) {},
                BlockStateProvider.of(ModBlocks.CYPRESS_LEAVES),
                new SpruceFoliagePlacer(UniformIntProvider.create(1, 2), UniformIntProvider.create(1, 2), UniformIntProvider.create(1, 2)),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, REDWOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.REDWOOD_LOG),
                new GiantTrunkPlacer(15, 2, 16) {},
                BlockStateProvider.of(ModBlocks.REDWOOD_LEAVES),
                new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(15, 19)),
                new TwoLayersFeatureSize(1, 1, 2)
        )
                .decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL))))
                .build());

        register(context, MANAWOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MANAWOOD_LOG),
                new LargeOakTrunkPlacer(3, 11, 0) {},
                BlockStateProvider.of(ModBlocks.MANAWOOD_LEAVES),
                new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
        )
                .ignoreVines()
                .build());

        register(context, GLOOMWOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.GLOOMWOOD_LOG),
                new DarkOakTrunkPlacer(5, 6, 3) {},
                BlockStateProvider.of(ModBlocks.GLOOMWOOD_LEAVES),
                new DarkOakFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 0, 2, OptionalInt.of(3))
        )
                .ignoreVines()
                .build());
    }



    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(NaturalMaterials.MOD_ID, name));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

