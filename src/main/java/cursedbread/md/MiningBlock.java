package cursedbread.md;

import net.minecraft.client.render.block.model.BlockModelCrossedSquares;
import net.minecraft.client.render.block.model.BlockModelStandard;
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
			.setBlockModel(BlockModelStandard::new)
			.setHardness(-1.0f)
			.setResistance(-1.0f)
			.setTextures("minecraft:block/piston_bottom")
			.setTags(BlockTags.BROKEN_BY_FLUIDS)
			.build(new BlockPortal("portal.mining",MiningMain.blockId++, MiningMain.dimensionId - 1, Block.stone.id,Block.oreCoalStone.id));

		initilizeBlockDetails();
	}
}
