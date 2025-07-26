package net.mchorizons.darkgraph.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.hud.debug.DebugChart;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(DebugChart.class)
@Environment(EnvType.CLIENT)
public class DebugChartMixin {

	@ModifyArg(method="render", at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;drawHorizontalLine(Lnet/minecraft/client/render/RenderLayer;IIII)V"), index=4)
	private int drawHorizontalLine(int color) {
		return -1873784742;
	}

	@ModifyArg(method="render", at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;drawVerticalLine(Lnet/minecraft/client/render/RenderLayer;IIII)V"), index=4)
	private int drawVerticalLine(int color) {
		return -1873784742;
	}
}
