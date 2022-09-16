package me.monmcgt.code.onstance.packet;

public abstract class UIDPacket extends Packet {
    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
