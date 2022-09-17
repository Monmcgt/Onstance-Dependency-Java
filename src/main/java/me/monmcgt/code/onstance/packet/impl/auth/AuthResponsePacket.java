package me.monmcgt.code.onstance.packet.impl.auth;

import me.monmcgt.code.onstance.packet.Packet;

public class AuthResponsePacket extends Packet {
    private boolean success;
    private String message;

    @Override
    public String getType() {
        return "auth/auth-response";
    }
}
