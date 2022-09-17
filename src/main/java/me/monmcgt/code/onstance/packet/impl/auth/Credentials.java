package me.monmcgt.code.onstance.packet.impl.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Credentials {
    private String key;
}