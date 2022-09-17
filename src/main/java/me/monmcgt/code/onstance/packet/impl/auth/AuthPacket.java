package me.monmcgt.code.onstance.packet.impl.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import me.monmcgt.code.onstance.packet.Packet;

@Getter
@Setter
@Builder
public class AuthPacket extends Packet {
    private Credentials credentials;

    @Override
    public String getType() {
        return "auth/auth";
    }
}
