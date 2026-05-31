package net.mchorizons.darkgraph.mixin;

import net.minecraft.client.gui.components.debugchart.AbstractDebugChart;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(AbstractDebugChart.class)
public class AbstractDebugChartMixin {

    @ModifyArg(method="extractRenderState", at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/GuiGraphicsExtractor;horizontalLine(IIII)V"), index=3)
    private int drawHorizontalLine(int color) {
        return -1873784742;
    }

    @ModifyArg(method="extractRenderState", at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/GuiGraphicsExtractor;verticalLine(IIII)V"), index=3)
    private int drawVerticalLine(int color) {
        return -1873784742;
    }

}
