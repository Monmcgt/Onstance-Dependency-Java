package me.monmcgt.code.onstance.packet;

public class UIDPacket extends Packet {
    private String uid;

    public String getUid() {
        return uid;
    }

    public UIDPacket setUid(String uid) {
        this.uid = uid;
        return this;
    }
}
