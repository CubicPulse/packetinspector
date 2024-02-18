package com.cubicpulse.packetinspector.mixin;

import com.cubicpulse.packetinspector.imgui.ImGuiImpl;
import net.minecraft.client.gui.hud.InGameHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class InGameHudMixin {
	@Inject(method = "render", at = @At("RETURN"))
	private void render(CallbackInfo ci) {
		ImGuiImpl.render();
	}
}
