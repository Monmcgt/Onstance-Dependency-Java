package me.monmcgt.code.onstance.packet.impl;

import lombok.*;
import me.monmcgt.code.onstance.packet.Packet;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InitPacket extends Packet {
    @Override
    public String getType() {
        return "init";
    }

    private boolean success;
    private String message;
}
