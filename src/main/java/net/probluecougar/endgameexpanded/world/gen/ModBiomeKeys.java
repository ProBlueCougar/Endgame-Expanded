package net.probluecougar.endgameexpanded.world.gen;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public abstract class ModBiomeKeys {

    public static final RegistryKey<Biome> TEST_BIOME = register("endgameexpanded:test_biome");


    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier(name));
    }
}