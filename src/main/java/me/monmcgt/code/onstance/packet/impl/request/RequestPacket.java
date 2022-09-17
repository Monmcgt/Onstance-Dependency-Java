package me.monmcgt.code.onstance.packet.impl.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import me.monmcgt.code.onstance.packet.Packet;

@Getter
@Setter
@Builder
public class RequestPacket extends Packet {
    private Packet packet;

    @Override
    public String getType() {
        return "request/request";
    }
}
