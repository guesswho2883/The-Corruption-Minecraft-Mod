/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.test.item.*;
import net.mcreator.test.TestMod;

import java.util.function.Function;

public class TestModItems {
	public static Item GLITCHITEM;
	public static Item GLITCHBLOCK;
	public static Item NUL_LFRAG;
	public static Item NUL_LBLOCK;
	public static Item UNIVERSAL_CRYSTAL;
	public static Item UITEM;
	public static Item UBLOCK;
	public static Item UNIVERSAL_PICKAXE;
	public static Item UNIVERSAL_AXE;
	public static Item UNIVERSAL_SWORD;
	public static Item UNIVERSAL_SHOVEL;
	public static Item UNIVERSAL_HOE;
	public static Item SMITHINGYING;

	public static void load() {
		GLITCHITEM = register("glitchitem", GlitchitemItem::new);
		GLITCHBLOCK = block(TestModBlocks.GLITCHBLOCK, "glitchblock");
		NUL_LFRAG = register("nul_lfrag", NULLfragItem::new);
		NUL_LBLOCK = block(TestModBlocks.NUL_LBLOCK, "nul_lblock");
		UNIVERSAL_CRYSTAL = block(TestModBlocks.UNIVERSAL_CRYSTAL, "universal_crystal", new Item.Properties().rarity(Rarity.EPIC).fireResistant());
		UITEM = register("uitem", UitemItem::new);
		UBLOCK = block(TestModBlocks.UBLOCK, "ublock", new Item.Properties().rarity(Rarity.EPIC).fireResistant());
		UNIVERSAL_PICKAXE = register("universal_pickaxe", UniversalPickaxeItem::new);
		UNIVERSAL_AXE = register("universal_axe", UniversalAxeItem::new);
		UNIVERSAL_SWORD = register("universal_sword", UniversalSwordItem::new);
		UNIVERSAL_SHOVEL = register("universal_shovel", UniversalShovelItem::new);
		UNIVERSAL_HOE = register("universal_hoe", UniversalHoeItem::new);
		SMITHINGYING = register("smithingying", SmithingyingItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TestMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TestMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}