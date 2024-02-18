package com.cubicpulse.packetinspector.mixin.packet;

import com.cubicpulse.packetinspector.PacketInspectorMod;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.packet.Packet;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets = "net.minecraft.network.NetworkState$InternalPacketHandler")
public class NetworkStateInternalPacketHandlerMixin {
    @Inject(method = "createPacket", at = @At("RETURN"))
    private void createPacket(int id, PacketByteBuf buf, CallbackInfoReturnable<@Nullable Packet<?>> cir) {
        if (cir.getReturnValue() == null)
            return;

        var data = PacketInspectorMod.getPacketManager().get(cir.getReturnValue().getClass());
        if (data == null)
            return;

        PacketInspectorMod.getPacketManager().getLog(data.type()).push(cir.getReturnValue(), data);
    }
}
