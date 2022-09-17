package me.monmcgt.code.onstance.packet.impl.communicate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import me.monmcgt.code.onstance.packet.UIDPacket;

@Getter
@Setter
@Builder
public class CheckExistPacket extends UIDPacket {
    private boolean exist;
    private String message;

    @Override
    public String getType() {
        return "communicate/check-exist";
    }
}
