package com.cubicpulse.packetinspector;

import net.minecraft.network.NetworkSide;
import net.minecraft.network.NetworkState;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.regex.Pattern;

public class PacketLog {
    private ArrayDeque<LogRow> log = new ArrayDeque<>();

    private PacketFilter filter;
    private int maxSize = 500;

    public PacketLog() {
        filter = new PacketFilter(NetworkSide.CLIENTBOUND, Set.of(NetworkState.values()), true, Set.of(), false, new Pattern[0]);
    }

    public PacketLog(int maxSize) {
        this.maxSize = maxSize;
        filter = new PacketFilter(NetworkSide.CLIENTBOUND, Set.of(NetworkState.values()), true, Set.of(), false, new Pattern[0]);
    }

    public void push(Object o, PacketManager.PacketData data) {
        var clazz = o.getClass();
        if (!filter.isInitiallyIncluded(clazz, data))
            return;

        String output = PacketInspectorMod.getPacketManager().get(clazz).toString(o);
        if (!filter.isIncluded(output))
            return;

        if (log.size() == maxSize)
            log.pop();

        log.add(new LogRow(clazz, Instant.now(), output));
    }

    public void flush() {
        log.clear();
    }

    public void setFilter(PacketFilter filter) {
        this.filter = filter;
    }

    public ArrayDeque<LogRow> getLog() {
        return log;
    }

    public record LogRow(Class<?> clazz, Instant instant, String output) { }
}
