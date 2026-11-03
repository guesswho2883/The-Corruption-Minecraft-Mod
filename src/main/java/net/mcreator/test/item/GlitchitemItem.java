package net.mcreator.test.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.test.procedures.GlitchitemRightclickedProcedure;

public class GlitchitemItem extends Item {
	public GlitchitemItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).enchantable(5));
	}

	@Override
	public ItemUseAnimation getUseAnimation(ItemStack itemstack) {
		return ItemUseAnimation.SPEAR;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		GlitchitemRightclickedProcedure.execute(entity);
		return ar;
	}
}