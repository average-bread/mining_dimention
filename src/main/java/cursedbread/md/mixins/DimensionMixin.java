package cursedbread.md.mixins;

import cursedbread.md.MiningBlock;
import cursedbread.md.MiningDimention;
import cursedbread.md.MiningMain;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.Dimension;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = Dimension.class, remap = false)
public abstract class DimensionMixin {

	@Inject(method = "<clinit>", at = @At("TAIL"))
	private static void addDimension(CallbackInfo ci){
		int dim = MiningMain.dimensionId;
		MiningDimention.dimensionMining = new Dimension("mining", Dimension.overworld, 3f, MiningBlock.portalMining.id).setDefaultWorldType(MiningMain.worldTypeMining);
		Dimension.registerDimension(dim-1, MiningDimention.dimensionMining);
	}
}
