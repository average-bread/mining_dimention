package cursedbread.md;

import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.biome.provider.BiomeProvider;
import net.minecraft.core.world.biome.provider.BiomeProviderSingleBiome;
import net.minecraft.core.world.generate.chunk.ChunkGenerator;
import net.minecraft.core.world.generate.chunk.flat.ChunkGeneratorFlat;
import net.minecraft.core.world.type.WorldTypeFlat;
import net.minecraft.core.world.type.WorldTypeOverworld;

public class MiningWorldtype extends WorldTypeFlat {
	public MiningWorldtype(String languageKey) {
		super(languageKey);
	}

	@Override
	public int getMaxY() {
		return 256;
	}

	@Override
	public BiomeProvider createBiomeProvider(World world) {
		return new BiomeProviderSingleBiome(MiningMain.MINING_BIOME, 0.5, 0.0, 0.0);
	}

	@Override
	public ChunkGenerator createChunkGenerator(World world) {
		return new ChunkGeneratorFlatMining(world);
	}

	@Override
	public float getCloudHeight() {
		return 256f;
	}
}
