package cursedbread.md;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockPortal;
import net.minecraft.core.block.tag.BlockTags;
import turniplabs.halplibe.helper.BlockBuilder;

public class MiningBlock {

	public static Block portalMining;
	public void initilizeBlockDetails(){

	}

	public void initilizeBlocks(){
		portalMining = new BlockBuilder(MiningMain.MOD_ID)
			.setHardness(-1.0f)
			.setResistance(-1.0f)
			.setTextures("minecraft:block/cobblestone")
			.setTags(BlockTags.BROKEN_BY_FLUIDS)
			.build(new BlockPortal("portal.mining",MiningMain.blockId++, MiningMain.dimensionId, Block.stone.id,Block.oreCoalStone.id));

		initilizeBlockDetails();
	}
}
