package cursedbread.md;

import net.minecraft.core.world.World;
import useless.terrainapi.config.ConfigManager;
import useless.terrainapi.generation.overworld.OverworldConfig;
import useless.terrainapi.generation.overworld.OverworldOreFeatures;
import useless.terrainapi.generation.overworld.api.ChunkDecoratorOverworldAPI;

public class ChunkDecoratorMiningApi extends ChunkDecoratorOverworldAPI {
	public static OverworldConfig miningConfig = ConfigManager.getConfig("mining", OverworldConfig.class);
	public static OverworldOreFeatures oreFeatures = new OverworldOreFeatures(miningConfig);

	public ChunkDecoratorMiningApi(World world, int treeDensityOverride) {
		super(world, treeDensityOverride);
	}
}
