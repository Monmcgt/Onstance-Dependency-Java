package me.monmcgt.code.onstance.packet.impl.onstance;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import me.monmcgt.code.onstance.packet.UIDPacket;

@Getter
@Setter
@Builder
public class InitPacket extends UIDPacket {
    private boolean success;
    private String message;

    @Override
    public String getType() {
        return "onstance/init-host";
    }
}
