package me.monmcgt.code.onstance.packet.impl.onstance;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import me.monmcgt.code.onstance.packet.Packet;

@Getter
@Setter
@Builder
public class KeepAlivePacket extends Packet {
    @Override
    public String getType() {
        return "onstance/keep-alive";
    }

    @SerializedName("verify-code")
    private String verifyCode;
}
