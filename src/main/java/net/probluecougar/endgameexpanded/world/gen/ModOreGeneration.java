package net.probluecougar.endgameexpanded.world.gen;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.probluecougar.endgameexpanded.world.feature.ModPlacedFeatures;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.TEST_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ENDER_ORE_PLACED.getKey().get());
    }
}
