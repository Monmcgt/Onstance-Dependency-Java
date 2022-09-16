package me.monmcgt.code.onstance.packet.impl.communicate;

import me.monmcgt.code.onstance.packet.UIDPacket;

public class MessagePacket extends UIDPacket {
    @Override
    public String getType() {
        return "communicate/message";
    }

    private String message;
}
