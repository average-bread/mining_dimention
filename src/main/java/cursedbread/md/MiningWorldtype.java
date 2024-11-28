package cursedbread.md;

import cursedbread.md.terrainapistuff.ChunkGeneratorFlatMining;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.provider.BiomeProvider;
import net.minecraft.core.world.biome.provider.BiomeProviderSingleBiome;
import net.minecraft.core.world.generate.chunk.ChunkGenerator;
import net.minecraft.core.world.type.WorldTypeFlat;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

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

	private void customChunkGenerator(World world, CallbackInfoReturnable<ChunkGenerator> cir){
		cir.setReturnValue(new ChunkGeneratorFlatMining(world));
	}
}
