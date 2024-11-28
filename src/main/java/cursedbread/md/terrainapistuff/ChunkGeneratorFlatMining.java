package cursedbread.md.terrainapistuff;

import net.minecraft.core.block.Block;
import net.minecraft.core.world.World;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.ChunkGenerator;
import net.minecraft.core.world.generate.chunk.ChunkGeneratorResult;
import net.minecraft.core.world.generate.chunk.flat.ChunkDecoratorFlat;

public class ChunkGeneratorFlatMining
	extends ChunkGenerator {
	public ChunkGeneratorFlatMining(World world) {
		super(world, new ChunkDecoratorMiningApi(world));
	}

	@Override
	protected ChunkGeneratorResult doBlockGeneration(Chunk chunk) {
		ChunkGeneratorResult result = new ChunkGeneratorResult();
		for (int z = 0; z < 16; ++z) {
			for (int x = 0; x < 16; ++x) {
				int y;
				result.setBlock(x, 0, z, Block.bedrock.id);
				for (y = 1; y < 128; ++y) {
					result.setBlock(x, y, z, Block.stone.id);
				}
				for (y = 128; y < 134; ++y) {
					result.setBlock(x, y, z, Block.dirt.id);
				}
				result.setBlock(x, 134, z, Block.grass.id);
			}
		}
		return result;
	}
}
