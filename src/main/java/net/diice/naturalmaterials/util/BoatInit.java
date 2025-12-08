package net.diice.naturalmaterials.util;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.diice.naturalmaterials.NaturalMaterials;
import net.diice.naturalmaterials.block.ModBlocks;
import net.diice.naturalmaterials.item.ModItems;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class BoatInit {
    public static final Identifier PALM_BOAT_ID = NaturalMaterials.id("palm_boat");
    public static final Identifier PALM_CHEST_BOAT_ID = NaturalMaterials.id("palm_chest_boat");
    public static final RegistryKey<TerraformBoatType> PALM_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PALM_BOAT_ID);

    public static TerraformBoatType PALM_TYPE;
    public static TerraformBoatType register(RegistryKey<TerraformBoatType> key, TerraformBoatType type) {
        return Registry.register(TerraformBoatTypeRegistry.INSTANCE, key, type);
    }
    public static void load(){
        PALM_TYPE = register(PALM_BOAT_KEY, new TerraformBoatType.Builder()
                .item(ModItems.PALM_BOAT)
                .chestItem(ModItems.PALM_CHEST_BOAT)
                .planks(ModBlocks.PALM_PLANKS.asItem())
                .build());
    }
}
