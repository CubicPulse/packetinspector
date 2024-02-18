/*
 * This file is part of fabric-imgui-example-mod - https://github.com/FlorianMichael/fabric-imgui-example-mod
 * by FlorianMichael/EnZaXD and contributors
 */
package com.cubicpulse.packetinspector.imgui;

import com.cubicpulse.packetinspector.PacketFilter;
import com.cubicpulse.packetinspector.PacketInspectorMod;
import com.cubicpulse.packetinspector.PacketLog;
import imgui.*;
import imgui.extension.implot.ImPlot;
import imgui.flag.ImGuiConfigFlags;
import imgui.gl3.ImGuiImplGl3;
import imgui.glfw.ImGuiImplGlfw;
import imgui.type.ImBoolean;
import imgui.type.ImString;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.network.NetworkSide;
import net.minecraft.network.NetworkState;
import org.apache.commons.lang3.tuple.Pair;
import org.lwjgl.glfw.GLFW;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.lwjgl.glfw.GLFW.*;

public class ImGuiImpl {
    private final static ImGuiImplGlfw imGuiImplGlfw = new ImGuiImplGlfw();
    private final static ImGuiImplGl3 imGuiImplGl3 = new ImGuiImplGl3();
    private static long handle;

    public static boolean isFocused() {
        return isFocused;
    }

    private static boolean isFocused = false;

    public static void create(final long handle) {
        ImGuiImpl.handle = handle;
        ImGui.createContext();
        ImPlot.createContext();

        final ImGuiIO data = ImGui.getIO();
        data.setIniFilename("modid.ini");
        data.setFontGlobalScale(1F);

        data.setConfigFlags(ImGuiConfigFlags.DockingEnable);

        for (NetworkState value : NetworkState.values()) {
            enabledStates.put(value, new ImBoolean(true));
        }

        imGuiImplGlfw.init(handle, true);
        imGuiImplGl3.init();
    }

    public static void draw(final RenderInterface runnable) {
        final ImGuiIO io = ImGui.getIO();

        if (MinecraftClient.getInstance().currentScreen instanceof ChatScreen && !io.hasConfigFlags(ImGuiConfigFlags.ViewportsEnable)) {
            imGuiImplGlfw.newFrame();
        } else {
            int[] width = {100};
            int[] height = {100};
            int[] fwidth = {100};
            int[] fheight = {100};
            glfwGetWindowSize(handle, width, height);
            glfwGetFramebufferSize(handle, fwidth, fheight);
            io.setDisplaySize((float) width[0], (float) height[0]);
            if (width[0] > 0 && height[0] > 0) {
                final float scaleX = (float) fwidth[0] / width[0];
                final float scaleY = (float) fheight[0] / height[0];
                io.setDisplayFramebufferScale(scaleX, scaleY);
            }
        }

        ImGui.newFrame();
        runnable.render(io);
        ImGui.render();

        imGuiImplGl3.renderDrawData(ImGui.getDrawData());
        if (ImGui.getIO().hasConfigFlags(ImGuiConfigFlags.ViewportsEnable)) {
            final long pointer = GLFW.glfwGetCurrentContext();
            ImGui.updatePlatformWindows();
            ImGui.renderPlatformWindowsDefault();

            GLFW.glfwMakeContextCurrent(pointer);
        }
    }

    public static void render() {
        ImGuiImpl.draw(ImGuiImpl::build);
    }

    public static void build(ImGuiIO io) {

        if (ImGui.begin("Packet Inspector")) {
            isFocused = ImGui.isWindowFocused();
            if (ImGui.beginTabBar("bar")) {
                if (ImGui.beginTabItem("Clientbound")) {
                    buildNetworkStates(NetworkSide.CLIENTBOUND);
                    ImGui.endTabItem();
                }
                if (ImGui.beginTabItem("Serverbound")) {
                    buildNetworkStates(NetworkSide.SERVERBOUND);
                    ImGui.endTabItem();
                }
                ImGui.endTabBar();
            }
            ImGui.end();
        }
    }

    private static Map<NetworkState, ImBoolean> enabledStates = new HashMap<>();
    private static ImBoolean blacklistPackets = new ImBoolean(true);
    private static ImString packets = new ImString();
    private static ImBoolean blacklistRegex = new ImBoolean(false);
    private static ImString regex = new ImString();
    private static Set<Class<?>> opened = new HashSet<>();
    private static ArrayDeque<PacketLog.LogRow> log = new ArrayDeque<>();
    private static boolean freezed = false;
    private static boolean scrollToBottom = false;
    private static boolean autoScroll = true;
    private static float lastScroll = 1.0f;
    private static void buildNetworkStates(NetworkSide side) {
        int i = 0;
        for (NetworkState value : NetworkState.values()) {
            if (i != 0)
                ImGui.sameLine();
            ImGui.checkbox(value.getId(), enabledStates.get(value));
            i++;
        }

        ImGui.text("Packets");
        ImGui.inputText("p", packets);
        ImGui.sameLine();
        ImGui.checkbox("bp", blacklistPackets);

        ImGui.text("Regexes");
        ImGui.inputText("r", regex);
        ImGui.sameLine();
        ImGui.checkbox("br", blacklistRegex);

        var manager = PacketInspectorMod.getPacketManager();

        ImGui.newLine();

        PacketFilter filter = new PacketFilter(
                side,
                enabledStates.entrySet().stream().filter(e -> e.getValue().get()).map(Map.Entry::getKey).collect(Collectors.toSet()),
                blacklistPackets.get(),
                Arrays.stream(packets.get().split(" ")).map(manager::packetFromName).collect(Collectors.toSet()),
                blacklistRegex.get(),
                Arrays.stream(regex.get().split(";")).map(Pattern::compile).toArray(Pattern[]::new)
        );

        manager.getLog(side).setFilter(filter);

        ImGui.sameLine();
        if (ImGui.button("Clear")) {
            manager.getLog(side).flush();
            log.clear();
        }

        ImGui.sameLine();
        if (ImGui.button(freezed ? "Unfreeze" : "Freeze")) {
            freezed = !freezed;
            if (freezed)
                log = manager.getLog(side).getLog().clone();
        }

        if (!freezed)
            log = manager.getLog(side).getLog();

        if (ImGui.beginChild("output", 0, 0, true)) {
            for (PacketLog.LogRow entry : log) {
                var data = manager.get(entry.clazz());
                boolean open = opened.contains(entry.clazz());
                ImGui.text(PacketInspectorMod.getDateFormat().format(Date.from(entry.instant())) + " " + (open || !entry.output().contains("\n") ? entry.output() : data.name() + " >"));
                if (ImGui.isItemClicked()) {
                    if (opened.contains(entry.clazz()))
                        opened.remove(entry.clazz());
                    else
                        opened.add(entry.clazz());
                }
            }

            autoScroll = lastScroll == ImGui.getScrollY();

            if (scrollToBottom && ImGui.getScrollY() >= ImGui.getScrollMaxY() || autoScroll)  {
                ImGui.setScrollHereY(1.0f);
            }
            scrollToBottom = false;

            lastScroll = ImGui.getScrollMaxY();

            ImGui.endChild();
        }
    }
}