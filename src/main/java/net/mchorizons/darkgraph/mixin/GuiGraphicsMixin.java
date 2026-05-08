package net.mchorizons.darkgraph.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(GuiGraphicsExtractor.class)
@Environment(EnvType.CLIENT)
public class GuiGraphicsMixin {

    //background color: -1873784752

    @ModifyArg(method= "horizontalLine", at=@At(value="INVOKE", target= "Lnet/minecraft/client/gui/GuiGraphicsExtractor;fill(IIIII)V"), index=4)
    private int drawHorizontalLine(int color) {
        return -1873784742;
    }

    @ModifyArg(method= "verticalLine", at=@At(value="INVOKE", target= "Lnet/minecraft/client/gui/GuiGraphicsExtractor;fill(IIIII)V"), index=4)
    private int drawVerticalLine(int color) {
        return -1873784742;
    }
}
