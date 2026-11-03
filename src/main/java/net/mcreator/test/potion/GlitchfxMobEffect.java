package net.mcreator.test.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.test.procedures.GlitchfxEffectStartedappliedProcedure;
import net.mcreator.test.TestMod;

public class GlitchfxMobEffect extends MobEffect {
	public GlitchfxMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3355393);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.enchantment_table.use")));
		this.addAttributeModifier(Attributes.MAX_HEALTH, Identifier.fromNamespaceAndPath(TestMod.MODID, "effect.glitchfx_0"), -5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, Identifier.fromNamespaceAndPath(TestMod.MODID, "effect.glitchfx_1"), -0.25, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
		this.addAttributeModifier(Attributes.ATTACK_SPEED, Identifier.fromNamespaceAndPath(TestMod.MODID, "effect.glitchfx_2"), 2, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ARMOR, Identifier.fromNamespaceAndPath(TestMod.MODID, "effect.glitchfx_3"), 1, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		GlitchfxEffectStartedappliedProcedure.execute(entity.level(), entity);
	}
}