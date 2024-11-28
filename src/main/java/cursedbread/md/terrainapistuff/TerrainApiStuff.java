package cursedbread.md.terrainapistuff;

import cursedbread.md.MiningMain;
import net.minecraft.core.block.Block;
import useless.terrainapi.api.TerrainAPI;

public class TerrainApiStuff implements TerrainAPI {
	@Override
	public String getModID() {
		return MiningMain.MOD_ID;
	}
	@Override
	public void onInitialize() {
		ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), Block.oreCoalStone, 30, 20, 1f, true);
		ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), Block.oreIronStone, 30, 20, 1f, true);
		ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), Block.oreGoldStone, 30, 20, 1f, true);
		ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), Block.oreRedstoneStone, 30, 20, 1f, true);
		ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), Block.oreDiamondStone, 30, 20, 1f, true);
		ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), Block.oreLapisStone, 30, 20, 1f, true);
		ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), Block.oreNethercoalNetherrack, 30, 20, 1f, false);
	}
}
