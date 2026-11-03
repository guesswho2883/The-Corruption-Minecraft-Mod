/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.alchemy.Potions;

import net.fabricmc.fabric.api.registry.FabricPotionBrewingBuilder;

public class TestModBrewingRecipes {
	public static void load() {
		FabricPotionBrewingBuilder.BUILD.register((builder) -> {
			builder.registerPotionRecipe(Potions.AWKWARD, Ingredient.of(TestModItems.GLITCHITEM), TestModPotions.GLITCHPOTION);
		});
	}
}