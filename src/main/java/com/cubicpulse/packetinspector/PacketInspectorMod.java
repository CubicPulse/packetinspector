package com.cubicpulse.packetinspector;

import com.cubicpulse.packetinspector.generated.PacketManagerImpl;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;

public class PacketInspectorMod implements ClientModInitializer {

	private static final String MOD_ID = "packetinspector";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	private static final PacketManager PACKET_MANAGER = new PacketManagerImpl();
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("[HH:mm:ss]");

	public static String getModId() {
		return MOD_ID;
	}

	public static PacketManager getPacketManager() {
		return PACKET_MANAGER;
	}

	public static SimpleDateFormat getDateFormat() {
		return DATE_FORMAT;
	}

	@Override
	public void onInitializeClient() {

	}
}
