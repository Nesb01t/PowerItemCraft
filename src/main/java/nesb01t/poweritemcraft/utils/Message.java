package nesb01t.poweritemcraft.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Message {
    public static void sendConsoleMsg(String msg) {
        Bukkit.getServer().getLogger().info(msg);
    }

    public static void sendPlayerMsg(Player player, String msg) {
        player.sendMessage(msg);
    }
}
