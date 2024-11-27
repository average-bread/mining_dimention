package cursedbread.md.terrainapistuff;

import cursedbread.md.MiningMain;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.generate.chunk.ChunkDecorator;
import useless.terrainapi.TerrainMain;
import useless.terrainapi.api.TerrainAPI;
import useless.terrainapi.generation.ChunkDecoratorAPI;
import useless.terrainapi.generation.overworld.api.ChunkDecoratorOverworldAPI;

public class TerrainApiStuff implements TerrainAPI {
	@Override
	public String getModID() {
		return MiningMain.MOD_ID;
	}
	@Override
	public void onInitialize() {
		ChunkDecoratorOverworldAPI.oreFeatures.addManagedOreFeature(getModID(), Block.oreCoalStone, 80, 20, 1f, true);
		ChunkDecoratorOverworldAPI.oreFeatures.addManagedOreFeature(getModID(), Block.oreIronStone, 40, 20, 1f, true);
		ChunkDecoratorOverworldAPI.oreFeatures.addManagedOreFeature(getModID(), Block.oreGoldStone, 40, 2, 1f, true);
		ChunkDecoratorOverworldAPI.oreFeatures.addManagedOreFeature(getModID(), Block.oreRedstoneStone, 35, 8, 1f, true);
		ChunkDecoratorOverworldAPI.oreFeatures.addManagedOreFeature(getModID(), Block.oreDiamondStone, 35, 1, 1f, true);
		ChunkDecoratorOverworldAPI.oreFeatures.addManagedOreFeature(getModID(), Block.oreLapisStone, 30, 1, 1f, true);
	}
}
