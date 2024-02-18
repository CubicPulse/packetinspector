package com.cubicpulse.packetinspector;

import net.minecraft.network.NetworkSide;
import net.minecraft.network.NetworkState;
import org.apache.logging.log4j.core.filter.RegexFilter;

import java.util.Set;
import java.util.regex.Pattern;

public record PacketFilter(NetworkSide side, Set<NetworkState> states, boolean classBlacklist, Set<Class<?>> classes, boolean regexBlacklist, Pattern[] regexes) {
    public boolean isInitiallyIncluded(Class<?> clazz, PacketManager.PacketData data) {
        if (classBlacklist)
            return !classes.contains(clazz) && data.type() == side() && states.contains(data.state());
        else
            return classes.contains(clazz) && data.type() == side() && states.contains(data.state());
    }

    public boolean isIncluded(String output) {
        boolean hasAllRegexes = true;
        for (Pattern regex : regexes) {
            hasAllRegexes = regex.matcher(output).find();
            if (!hasAllRegexes)
                break;
        }

        return regexBlacklist != hasAllRegexes;
    }
}
