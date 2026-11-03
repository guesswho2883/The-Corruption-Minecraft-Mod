/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class TestModTabs {
	public static void load() {
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(tabData -> {
			tabData.accept(TestModItems.GLITCHITEM);
			tabData.accept(TestModBlocks.GLITCHBLOCK.asItem());
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(tabData -> {
			tabData.accept(TestModBlocks.GLITCHBLOCK.asItem());
			tabData.accept(TestModBlocks.UBLOCK.asItem());
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(tabData -> {
			tabData.accept(TestModItems.NUL_LFRAG);
			tabData.accept(TestModBlocks.UNIVERSAL_CRYSTAL.asItem());
			tabData.accept(TestModItems.UITEM);
			tabData.accept(TestModItems.SMITHINGYING);
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(tabData -> {
			tabData.accept(TestModItems.UNIVERSAL_PICKAXE);
			tabData.accept(TestModItems.UNIVERSAL_AXE);
			tabData.accept(TestModItems.UNIVERSAL_SHOVEL);
			tabData.accept(TestModItems.UNIVERSAL_HOE);
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(tabData -> {
			tabData.accept(TestModItems.UNIVERSAL_SWORD);
		});
	}
}