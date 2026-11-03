package net.mcreator.test.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;

import java.util.function.Predicate;

public class UniversalCrystalBlock extends Block {
	private static final VoxelShape SHAPE = box(2, 0, 2, 14, 12, 14);

	public UniversalCrystalBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.AMETHYST_CLUSTER).strength(1f, 40f).requiresCorrectToolForDrops().noOcclusion().postProcess((bs, br, bp) -> bp).emissiveRendering(bs -> true).isRedstoneConductor((bs, br, bp) -> false).dynamicShape()
				.offsetType(Block.OffsetType.XZ));
	}

	public static final Predicate<BiomeSelectionContext> GENERATE_BIOMES = BiomeSelectors.all();

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return SHAPE.move(state.getOffset(pos));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return true;
	}

	@Override
	public int getLightDampening(BlockState state) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	protected void spawnAfterBreak(BlockState state, ServerLevel level, BlockPos pos, ItemStack tool, boolean dropExperience) {
		super.spawnAfterBreak(state, level, pos, tool, dropExperience);
		if (dropExperience)
			this.tryDropExperience(level, pos, tool, UniformInt.of(10, 20));
	}
}