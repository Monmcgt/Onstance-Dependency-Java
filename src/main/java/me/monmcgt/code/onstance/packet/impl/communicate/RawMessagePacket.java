package me.monmcgt.code.onstance.packet.impl.communicate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import me.monmcgt.code.onstance.packet.Packet;

@Getter
@Setter
@Builder
public class RawMessagePacket extends Packet {
    private String message;

    @Override
    public String getType() {
        return "communicate/raw-message";
    }
}
