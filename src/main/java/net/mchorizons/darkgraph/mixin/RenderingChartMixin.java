package net.mchorizons.darkgraph.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.hud.debug.RenderingChart;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(RenderingChart.class)
@Environment(EnvType.CLIENT)
public class RenderingChartMixin {

	@ModifyArg(method="renderThresholds", at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;drawHorizontalLine(Lnet/minecraft/client/render/RenderLayer;IIII)V"), index=4)
	private int drawHorizontalLine(int color) {
		return -1873784742;
	}
}