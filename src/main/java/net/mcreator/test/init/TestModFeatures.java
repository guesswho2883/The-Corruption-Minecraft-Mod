/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.test.block.UniversalCrystalBlock;
import net.mcreator.test.block.UblockBlock;
import net.mcreator.test.block.GlitchblockBlock;
import net.mcreator.test.TestMod;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class TestModFeatures {
	public static void load() {
		register("glitchblock", new OreFeature(OreConfiguration.CODEC), GlitchblockBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("universal_crystal", new OreFeature(OreConfiguration.CODEC), UniversalCrystalBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("ublock", new OreFeature(OreConfiguration.CODEC), UblockBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	private static void register(String registryname, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration stage) {
		register(registryname, feature);
		BiomeModifications.addFeature(biomes, stage, ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(TestMod.MODID, registryname)));
	}

	private static void register(String registryname, Feature feature) {
		Registry.register(BuiltInRegistries.FEATURE, Identifier.fromNamespaceAndPath(TestMod.MODID, registryname), feature);
	}
}