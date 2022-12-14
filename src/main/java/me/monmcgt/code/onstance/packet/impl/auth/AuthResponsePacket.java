package me.monmcgt.code.onstance.packet.impl.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import me.monmcgt.code.onstance.packet.Packet;

@Getter
@Setter
@Builder
public class AuthResponsePacket extends Packet {
    private boolean success;
    private String message;

    @Override
    public String getType() {
        return "auth/auth-response";
    }
}
