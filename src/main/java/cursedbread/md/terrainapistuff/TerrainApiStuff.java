package cursedbread.md.terrainapistuff;

import cursedbread.md.MiningBiome;
import cursedbread.md.MiningMain;
import goocraft4evr.nonamedyes.block.ModBlocks;
import luke.bonusblocks.block.BonusBlocks;
import luke.cavecliff.CaveCliffBlocks;
import luke.randomite.RandomiteBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeFancy;
//import sunsetsatellite.signalindustries.SIBlocks;
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

		ChunkDecoratorMiningApi.randomFeatures.addFeature(new WorldFeatureTreeFancy(Block.leavesOak.id, Block.logOak.id), 50, -1, 1, new Biome[]{MiningMain.MINING_BIOME});

		if (MiningMain.nonamedyesOn){
			ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), ModBlocks.oreMalachiteStone, 30, 20, 1f, true);
			ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), ModBlocks.oreEskolaiteStone, 30, 20, 1f, true);
			ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), ModBlocks.netherrackVile, 30, 20, 1f, false);
		}

		if (MiningMain.randomiteOn){
			ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), RandomiteBlocks.oreRandomiteStone, 30, 20, 1f, true);
		}

		if (MiningMain.bonusblocksOn){
			ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), BonusBlocks.oreCopperStone, 30, 20, 1f, true);
			ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), BonusBlocks.oreSilverStone, 30, 20, 1f, true);
		}

		if (MiningMain.cavecliffOn){
			ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), CaveCliffBlocks.oreCopperStone, 30, 20, 1f, true);
		}

		if (MiningMain.cosmicOn){
			ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), lexal.cosmic.block.ModBlocks.cheeseore, 30, 20, 1f, false);
			ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), lexal.cosmic.block.ModBlocks.meteorore, 30, 20, 1f, false);
			ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), lexal.cosmic.block.ModBlocks.mooniron, 30, 20, 1f, false);
			ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), lexal.cosmic.block.ModBlocks.moongold, 30, 20, 1f, false);
		}

//		if (MiningMain.sygnalindustriesOn){
//			ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), SIBlocks.dilithiumOre, 30, 20, 1f, false);
//			ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), SIBlocks.signalumOre, 30, 20, 1f, false);
//			ChunkDecoratorMiningApi.oreFeatures.addManagedOreFeature(getModID(), SIBlocks.dimensionalShardOre, 30, 20, 1f, false);
//		}
	}
}
