package net.mcreator.test.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;

import java.util.function.Predicate;

public class UblockBlock extends Block {
	public UblockBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_ORANGE).sound(SoundType.AMETHYST).strength(50f, 40f).requiresCorrectToolForDrops().pushReaction(PushReaction.IGNORE).postProcess((bs, br, bp) -> bp).emissiveRendering(bs -> true)
				.instrument(NoteBlockInstrument.GUITAR));
	}

	public static final Predicate<BiomeSelectionContext> GENERATE_BIOMES = BiomeSelectors.all();

	@Override
	protected void spawnAfterBreak(BlockState state, ServerLevel level, BlockPos pos, ItemStack tool, boolean dropExperience) {
		super.spawnAfterBreak(state, level, pos, tool, dropExperience);
		if (dropExperience)
			this.tryDropExperience(level, pos, tool, UniformInt.of(30, 50));
	}
}