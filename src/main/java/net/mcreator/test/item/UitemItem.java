package net.mcreator.test.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class UitemItem extends Item {
	public UitemItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).fireResistant());
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}