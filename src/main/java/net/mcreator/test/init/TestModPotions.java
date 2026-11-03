/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.test.TestMod;

public class TestModPotions {
	public static Holder<Potion> GLITCHPOTION;
	public static Holder<Potion> GLITCHPOTIONAMP_2;

	public static void load() {
		GLITCHPOTION = register("glitchpotion", new Potion("glitchpotion", new MobEffectInstance(TestModMobEffects.GLITCHFX, 4800, 0, false, true)));
		GLITCHPOTIONAMP_2 = register("glitchpotionamp_2", new Potion("glitchpotionamp_2", new MobEffectInstance(TestModMobEffects.GLITCHFX, 2400, 1, false, true)));
	}

	private static Holder<Potion> register(String registryname, Potion element) {
		return Holder.direct(Registry.register(BuiltInRegistries.POTION, Identifier.fromNamespaceAndPath(TestMod.MODID, registryname), element));
	}
}