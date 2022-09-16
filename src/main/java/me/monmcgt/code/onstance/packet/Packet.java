package me.monmcgt.code.onstance.packet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Packet {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String serialize() {
        return gson.toJson(this);
    }

    private static final Gson gson = new GsonBuilder().create();

    public static String serialize(Packet packet) {
        packet.type = packet.getType();
        return gson.toJson(packet);
    }

    public static Packet deserialize(String json) {
        return deserialize(json, Packet.class);
    }

    public static Packet deserialize(String json, Class<? extends Packet> packetClass) {
        return gson.fromJson(json, packetClass);
    }
}
