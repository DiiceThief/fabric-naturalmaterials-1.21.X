package net.diice.naturalmaterials.util;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import com.terraformersmc.terraform.boat.impl.TerraformBoatTypeImpl;
import net.diice.naturalmaterials.NaturalMaterials;
import net.diice.naturalmaterials.block.ModBlocks;
import net.diice.naturalmaterials.item.ModItems;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class BoatInit {
    public static final Identifier PALM_BOAT_ID = NaturalMaterials.id("palm_boat");
    public static final Identifier PALM_CHEST_BOAT_ID = NaturalMaterials.id("palm_chest_boat");
    public static final RegistryKey<TerraformBoatType> PALM_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PALM_BOAT_ID);
    public static TerraformBoatType PALM_TYPE;

    public static final Identifier CYPRESS_BOAT_ID = NaturalMaterials.id("cypress_boat");
    public static final Identifier CYPRESS_CHEST_BOAT_ID = NaturalMaterials.id("cypress_chest_boat");
    public static final RegistryKey<TerraformBoatType> CYPRESS_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CYPRESS_BOAT_ID);
    public static TerraformBoatType CYPRESS_TYPE;

    public static final Identifier REDWOOD_BOAT_ID = NaturalMaterials.id("redwood_boat");
    public static final Identifier REDWOOD_CHEST_BOAT_ID = NaturalMaterials.id("redwood_chest_boat");
    public static final RegistryKey<TerraformBoatType> REDWOOD_BOAT_KEY = TerraformBoatTypeRegistry.createKey(REDWOOD_BOAT_ID);
    public static TerraformBoatType REDWOOD_TYPE;

    public static final Identifier MANAWOOD_BOAT_ID = NaturalMaterials.id("manawood_boat");
    public static final Identifier MANAWOOD_CHEST_BOAT_ID = NaturalMaterials.id("manawood_chest_boat");
    public static final RegistryKey<TerraformBoatType> MANAWOOD_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MANAWOOD_BOAT_ID);
    public static TerraformBoatType MANAWOOD_TYPE;

    public static final Identifier GLOOMWOOD_BOAT_ID = NaturalMaterials.id("gloomwood_boat");
    public static final Identifier GLOOMWOOD_CHEST_BOAT_ID = NaturalMaterials.id("gloomwood_chest_boat");
    public static final RegistryKey<TerraformBoatType> GLOOMWOOD_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GLOOMWOOD_BOAT_ID);
    public static TerraformBoatType GLOOMWOOD_TYPE;
    public static TerraformBoatType register(RegistryKey<TerraformBoatType> key, TerraformBoatType type) {
        return Registry.register(TerraformBoatTypeRegistry.INSTANCE, key, type);
    }
    public static void load(){
        PALM_TYPE = register(PALM_BOAT_KEY, new TerraformBoatType.Builder()
                .item(ModItems.PALM_BOAT)
                .chestItem(ModItems.PALM_CHEST_BOAT)
                .planks(ModBlocks.PALM_PLANKS.asItem())
                .build());
        CYPRESS_TYPE = register(CYPRESS_BOAT_KEY, new TerraformBoatType.Builder()
                .item(ModItems.CYPRESS_BOAT)
                .chestItem(ModItems.CYPRESS_CHEST_BOAT)
                .planks(ModBlocks.CYPRESS_PLANKS.asItem())
                .build());
        REDWOOD_TYPE = register(REDWOOD_BOAT_KEY, new TerraformBoatType.Builder()
                .item(ModItems.REDWOOD_BOAT)
                .chestItem(ModItems.REDWOOD_CHEST_BOAT)
                .planks(ModBlocks.REDWOOD_PLANKS.asItem())
                .build());
        MANAWOOD_TYPE = register(MANAWOOD_BOAT_KEY, new TerraformBoatType.Builder()
                .item(ModItems.MANAWOOD_BOAT)
                .chestItem(ModItems.MANAWOOD_CHEST_BOAT)
                .planks(ModBlocks.MANAWOOD_PLANKS.asItem())
                .build());
        GLOOMWOOD_TYPE = register(GLOOMWOOD_BOAT_KEY, new TerraformBoatType.Builder()
                .item(ModItems.GLOOMWOOD_BOAT)
                .chestItem(ModItems.GLOOMWOOD_CHEST_BOAT)
                .planks(ModBlocks.GLOOMWOOD_PLANKS.asItem())
                .build());
    }
}
