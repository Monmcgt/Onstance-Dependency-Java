package me.monmcgt.code.onstance.packet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class Packet {
    public String type;

    public abstract String getType();

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
