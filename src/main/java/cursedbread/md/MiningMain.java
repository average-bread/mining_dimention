package cursedbread.md;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.type.WorldType;
import net.minecraft.core.world.type.WorldTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

import java.util.Properties;


public class MiningMain implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "md";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Biome MINING_BIOME = new MiningBiome("md.miningbiome");

	public static final WorldType worldTypeMining = WorldTypes.register("md:mining", new MiningWorldtype("worldType.mining"));

	public static int blockId;
	public static int dimensionId;
	static {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id","2200");
		prop.setProperty("starting_dimension_id","4");

		ConfigHandler config = new ConfigHandler(MOD_ID,prop);

		blockId = config.getInt("starting_block_id");
		dimensionId = config.getInt("starting_dimension_id");
	}
    @Override
    public void onInitialize() {
        LOGGER.info("When i was ten i yearned for the mines.");
		Biomes.register(MOD_ID+":mining_biome", MINING_BIOME);
		new MiningBlock().initilizeBlocks();
    }

	@Override
	public void beforeGameStart() {
		MiningDimention.register();
	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("GGG", "GDG", "GGG")
			.addInput('D', Block.stone)
			.addInput('G', Item.toolPickaxeStone)
			.create("itemGroupExample", new ItemStack(MiningBlock.portalMining));
	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
		RecipeBuilder.getRecipeNamespace(MOD_ID);
	}
}
