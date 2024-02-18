package com.cubicpulse.packetinspector.generated;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.network.NetworkSide;
import net.minecraft.network.NetworkState;
import net.minecraft.network.packet.Packet;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class PacketGenerator {
    private static String MINECRAFT_VERSION = "1.20.4";
    public static void main(String[] args) throws IOException {
        var play = generate(NetworkState.PLAY);
        var config = generate(NetworkState.CONFIGURATION);
        var handshake = generate(NetworkState.HANDSHAKING);
        var status = generate(NetworkState.STATUS);
        var login = generate(NetworkState.LOGIN);
        String output = String.format("""
                package com.cubicpulse.packetinspector.generated;
                %s
                %s
                %s
                %s
                %s
                
                import net.minecraft.network.NetworkSide;
                import net.minecraft.network.NetworkState;
                import com.cubicpulse.packetinspector.PacketManager;
                import com.cubicpulse.packetinspector.PacketInspectorMod;
                import java.util.Map;
                import java.util.HashMap;
                import java.lang.reflect.Field;
                
                public class PacketManagerImpl extends PacketManager {
                    private static final Map<Class<?>, PacketManager.PacketData> types = new HashMap<>();
                   
                    static {
                %s
                %s
                %s
                %s
                %s
                    }
                   
                    @Override
                    public PacketManager.PacketData get(Class<?> clazz) {
                        return types.get(clazz);
                    }
                   
                    @Override
                    public Map<Class<?>, PacketData> getTypes() {
                        return types;
                    }
                    
                    private static Object getFromField(Object o, String nameA, String nameB) {
                        Field field = null;
                        try {
                            field = o.getClass().getDeclaredField(nameB);
                            if (field == null) {
                                field = o.getClass().getDeclaredField(nameA);
                            }
                            if (field != null) {
                                field.setAccessible(true);
                                return field.get(o);
                            }
                        } catch (NoSuchFieldException | IllegalAccessException e) {
                           PacketInspectorMod.LOGGER.error("Could not read packet");
                           e.printStackTrace();
                        }

                        return null;
                    }
                }
                """, play.getKey(), config.getKey(), handshake.getKey(), status.getKey(), login.getKey(), play.getValue(), config.getValue(), handshake.getValue(), status.getValue(), login.getValue());

        File file = new File("src/main/java/com/cubicpulse/packetinspector/generated/PacketManagerImpl.java");
        if (file.exists())
            file.delete();

        System.out.println(file.getAbsolutePath());

        file.createNewFile();

        Files.writeString(Path.of(file.getAbsolutePath()), output);
    }

    private static Pair<String, String> generate(NetworkState state) {
        StringBuilder imports = new StringBuilder();
        StringBuilder types = new StringBuilder();
        for (Int2ObjectMap.Entry<Class<? extends Packet<?>>> classEntry : state.getPacketIdToPacketMap(NetworkSide.CLIENTBOUND).int2ObjectEntrySet()) {
            String className = classEntry.getValue().getSimpleName();
            String name = getName(classEntry.getValue(), NetworkSide.CLIENTBOUND);
            if (name == null)
                continue;
            imports.append("\nimport ").append(classEntry.getValue().getPackageName()).append(".").append(classEntry.getValue().getSimpleName()).append(";");
            types.append("        types.put(").append(className)
                    .append(".class,new PacketManager.PacketData<").append(classEntry.getValue().getSimpleName()).append(">(\"")
                    .append(name).append("\"")
                    .append(",NetworkState.").append(state.name())
                    .append(",NetworkSide.CLIENTBOUND")
                    .append(",").append(classEntry.getIntKey())
                    .append(",").append(createToString(classEntry.getValue(), name))
                    .append("));\n");
        }

        return new ImmutablePair<>(imports.toString(), types.toString());
    }

    private static String getName(Class<?> type, NetworkSide side) {
        if (!type.getSimpleName().contains("S2C") || type.getSimpleName().contains("C2S"))
            return null;

        if (side == NetworkSide.CLIENTBOUND)
            return type.getSimpleName().split("S2C")[0];
        if (side == NetworkSide.SERVERBOUND)
            return type.getSimpleName().split("C2S")[0];

        return type.getSimpleName();
    }

    private static String createToString(Class<?> type, String packetName) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        try {
            URI url = new URI("https://raw.githubusercontent.com/FabricMC/yarn/" + MINECRAFT_VERSION + "/mappings/" + (type.getPackageName() + "." + type.getSimpleName()).replace(".", "/") + ".mapping");
            String mapping = HttpClient.newHttpClient().send(HttpRequest.newBuilder(url).GET().build(), HttpResponse.BodyHandlers.ofString()).body();
            for (String s : mapping.split("\n")) {
                if (!s.trim().startsWith("FIELD"))
                    continue;


                var parts = s.split(" ");
                System.out.println(packetName + " : " + parts[2]);
                if (Arrays.stream(type.getDeclaredFields()).noneMatch(f -> f.getName().equals(parts[2])))
                    continue;

                Field field = type.getDeclaredField(parts[2]);
                if (Modifier.isStatic(field.getModifiers()))
                    continue;

                field.setAccessible(true);

                builder.append(String.format(" + \"\\n    %s=\" + getFromField(o, \"%s\", \"%s\")", field.getName(), parts[1], parts[2]));
                count++;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return String.format("(o) -> \"%s{\"%s + \"%s}\"", packetName, builder.toString(), count > 0 ? "\\n" : "");
    }
}
