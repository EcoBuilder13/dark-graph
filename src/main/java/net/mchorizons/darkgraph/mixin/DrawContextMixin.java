package net.mchorizons.darkgraph.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.DrawContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(DrawContext.class)
@Environment(EnvType.CLIENT)
public class DrawContextMixin {

    //background color: -1873784752

    @ModifyArg(method="drawHorizontalLine", at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;fill(IIIII)V"), index=4)
    private int drawHorizontalLine(int color) {
        return -1873784742;
    }

    @ModifyArg(method="drawVerticalLine", at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;fill(IIIII)V"), index=4)
    private int drawVerticalLine(int color) {
        return -1873784742;
    }
}
