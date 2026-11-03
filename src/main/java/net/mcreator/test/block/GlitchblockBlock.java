package net.mcreator.test.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;

import java.util.function.Predicate;

public class GlitchblockBlock extends Block {
	public GlitchblockBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.GLOW_LICHEN).sound(SoundType.SPAWNER).strength(1f, 10f).pushReaction(PushReaction.BLOCK).instrument(NoteBlockInstrument.BIT));
	}

	public static final Predicate<BiomeSelectionContext> GENERATE_BIOMES = BiomeSelectors.all();

	@Override
	public boolean isSignalSource(BlockState state) {
		return true;
	}

	@Override
	public int getSignal(BlockState blockstate, BlockGetter blockAccess, BlockPos pos, Direction direction) {
		return 1;
	}
}