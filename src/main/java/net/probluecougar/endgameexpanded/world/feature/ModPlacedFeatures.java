package net.probluecougar.endgameexpanded.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> ENDER_ORE_PLACED = PlacedFeatures.register("ender_ore_placed",
            ModConfiguredFeatures.ENDER_ORE, modifiersWithCount(7,HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(60))));

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier){
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier){
        return List.of(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier){
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
