package cursedbread.md;

import net.minecraft.core.block.Block;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTree;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeFancy;

import java.util.Random;

public class MiningBiome extends Biome {
	public MiningBiome(String key) {
		super(key);
		this.topBlock = (short) Block.grass.id;
		this.fillerBlock = (short) Block.dirt.id;
	}

	public WorldFeature getRandomWorldGenForTrees(Random random) {
		if (random.nextInt(25) == 0) {
			return new WorldFeatureTree(Block.leavesBirch.id, Block.logBirch.id, 5);
		}
		if (random.nextInt(15) == 0) {
			return new WorldFeatureTreeFancy(Block.leavesOak.id, Block.logOak.id);
		}
		return new WorldFeatureTree(Block.leavesOak.id, Block.logOak.id, 4);
	}
}
