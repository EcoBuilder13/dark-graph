package net.mchorizons.darkgraph.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.components.debugchart.FpsDebugChart;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(FpsDebugChart.class)
@Environment(EnvType.CLIENT)
public class FpsDebugChartMixin {

    @ModifyArg(method="extractAdditionalLinesAndLabels", at=@At(value="INVOKE", target= "Lnet/minecraft/client/gui/GuiGraphicsExtractor;horizontalLine(IIII)V"), index=3)
    private int drawHorizontalLine(int color) {
        return -1873784742;
    }

}
