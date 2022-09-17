package me.monmcgt.code.onstance.packet.impl.onstance;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import me.monmcgt.code.onstance.packet.Packet;

@Getter
@Setter
@Builder
public class InitPacketResponse extends Packet {
    private boolean success;
    private String message;

    @Override
    public String getType() {
        return "onstance/init-response";
    }
}
