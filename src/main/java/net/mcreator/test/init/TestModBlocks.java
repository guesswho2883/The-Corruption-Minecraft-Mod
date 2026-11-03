/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.test.block.UniversalCrystalBlock;
import net.mcreator.test.block.UblockBlock;
import net.mcreator.test.block.NULLblockBlock;
import net.mcreator.test.block.GlitchblockBlock;
import net.mcreator.test.TestMod;

import java.util.function.Function;

public class TestModBlocks {
	public static Block GLITCHBLOCK;
	public static Block NUL_LBLOCK;
	public static Block UNIVERSAL_CRYSTAL;
	public static Block UBLOCK;

	public static void load() {
		GLITCHBLOCK = register("glitchblock", GlitchblockBlock::new);
		NUL_LBLOCK = register("nul_lblock", NULLblockBlock::new);
		UNIVERSAL_CRYSTAL = register("universal_crystal", UniversalCrystalBlock::new);
		UBLOCK = register("ublock", UblockBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TestMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}