package net.mcreator.test.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class NULLblockBlock extends Block {
	public NULLblockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(1f, 10f).instrument(NoteBlockInstrument.PLING));
	}
}