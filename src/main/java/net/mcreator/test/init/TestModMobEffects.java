/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.test.potion.GlitchfxMobEffect;
import net.mcreator.test.TestMod;

import java.util.function.Supplier;

public class TestModMobEffects {
	public static Holder<MobEffect> GLITCHFX;

	public static void load() {
		GLITCHFX = register("glitchfx", GlitchfxMobEffect::new);
	}

	private static Holder<MobEffect> register(String registryname, Supplier<MobEffect> element) {
		return Holder.direct(Registry.register(BuiltInRegistries.MOB_EFFECT, Identifier.fromNamespaceAndPath(TestMod.MODID, registryname), element.get()));
	}
}