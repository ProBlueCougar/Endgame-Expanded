package net.probluecougar.endgameexpanded.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.probluecougar.endgameexpanded.EndgameExpanded;
import net.probluecougar.endgameexpanded.block.ModBlocks;
import net.minecraft.block.Blocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> TEST_ENDER_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ENDER_ORE.getDefaultState())

    );

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ENDER_ORE =
            ConfiguredFeatures.register("ender_ore", Feature.ORE, new OreFeatureConfig(TEST_ENDER_ORE, 12));



    public static void registerConfiguredFeatures() {
        EndgameExpanded.LOGGER.debug("Registering the ModConfiguredFeatures for" + EndgameExpanded.MOD_ID);
    }
}
