package net.mchorizons.darkgraph.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.hud.DebugHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(DebugHud.class)
@Environment(EnvType.CLIENT)
public class DebugHudMixin {

    //background color: -1873784752

    //horizontal lines
    @ModifyArg(method="drawMetricsData", at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/hud/DebugHud;drawHorizontalLine(Lnet/minecraft/client/util/math/MatrixStack;IIII)V"), index=4)
    private int modifyHorizontal(int e) {
        return -1873784742;
    }

    //vertical lines
    @ModifyArg(method="drawMetricsData", at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/hud/DebugHud;drawVerticalLine(Lnet/minecraft/client/util/math/MatrixStack;IIII)V"), index=4)
    private int modifyVertical(int e) {
        return -1873784742;
    }
}
