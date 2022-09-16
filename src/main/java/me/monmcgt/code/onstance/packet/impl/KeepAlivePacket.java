package me.monmcgt.code.onstance.packet.impl;

import com.google.gson.annotations.SerializedName;
import lombok.*;
import me.monmcgt.code.onstance.packet.Packet;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KeepAlivePacket extends Packet {
    @Override
    public String getType() {
        return "keep-alive";
    }

    @SerializedName("verify-code")
    private String verifyCode;
}
