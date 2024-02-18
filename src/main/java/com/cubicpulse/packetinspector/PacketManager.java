package com.cubicpulse.packetinspector;

import net.minecraft.network.NetworkSide;
import net.minecraft.network.NetworkState;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.*;
import java.util.function.Function;

public abstract class PacketManager {
    private Map<NetworkState, Map<NetworkSide, List<Pair<Class<?>, PacketData>>>> index = new HashMap<>();
    private Map<String, Class<?>> nameIndex = new HashMap<>();
    private PacketLog clientboundLog = new PacketLog();
    private PacketLog serverboundLog = new PacketLog();

    public abstract PacketData get(Class<?> clazz);
    public abstract Map<Class<?>, PacketData> getTypes();

    public Map<NetworkSide, List<Pair<Class<?>, PacketData>>> fromState(NetworkState state) {
        return index.get(state);
    }

    public PacketManager() {
        for (Map.Entry<Class<?>, PacketData> type : getTypes().entrySet()) {
            index.putIfAbsent(type.getValue().state(), new HashMap<>());
            var map = index.get(type.getValue().state());
            map.put(type.getValue().type(), new ArrayList<>());
            map.get(type.getValue().type()).add(new ImmutablePair<>(type.getKey(), type.getValue()));

            nameIndex.put(type.getValue().name(), type.getKey());
        }
    }

    public Class<?> packetFromName(String name) {
        return nameIndex.get(name);
    }

    public PacketLog getLog(NetworkSide side) {
        if (side == NetworkSide.CLIENTBOUND)
            return clientboundLog;
        else
            return serverboundLog;
    }

    public record PacketData<T>(String name, NetworkState state, NetworkSide type, int id, Function<T, String> asString) {
        public String toString(T data) {
            return asString.apply(data);
        }
    }
}
