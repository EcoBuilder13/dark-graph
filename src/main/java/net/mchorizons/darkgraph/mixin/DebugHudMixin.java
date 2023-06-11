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

    @ModifyArg(method="drawMetricsData", at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;drawHorizontalLine(Lnet/minecraft/client/render/RenderLayer;IIII)V"), index=4)
    private int drawHorizontalLine(int e) {
        return -1873784742;
    }

    @ModifyArg(method="drawMetricsData", at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;drawVerticalLine(Lnet/minecraft/client/render/RenderLayer;IIII)V"), index=4)
    private int drawVerticalLine(int e) {
        return -1873784742;
    }
}
