package net.mcreator.test.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.Identifier;

public class GlitchfxEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) == 15) {
			if (entity instanceof LivingEntity _entity) {
				AttributeModifier modifier = new AttributeModifier(Identifier.parse("test:max_health"), 5, AttributeModifier.Operation.ADD_VALUE);
				if (!_entity.getAttribute(Attributes.MAX_HEALTH).hasModifier(modifier.id())) {
					_entity.getAttribute(Attributes.MAX_HEALTH).addPermanentModifier(modifier);
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(5);
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) == 10) {
			if (entity instanceof LivingEntity _entity) {
				AttributeModifier modifier = new AttributeModifier(Identifier.parse("test:max_health"), 10, AttributeModifier.Operation.ADD_VALUE);
				if (!_entity.getAttribute(Attributes.MAX_HEALTH).hasModifier(modifier.id())) {
					_entity.getAttribute(Attributes.MAX_HEALTH).addPermanentModifier(modifier);
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(10);
		}
	}
}