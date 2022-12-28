package nesb01t.poweritemcraft.utils;

import nesb01t.poweritemcraft.GlobalOptions;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class MessageUtils {
    /**
     * 发送信息 - 控制台
     *
     * @param msg
     */
    public static void sendConsoleMsg(String msg) {
        String string = GlobalOptions.consolePrefix + msg;
        Bukkit.getServer().getLogger().info(string);
    }

    /**
     * 发送信息 - 玩家
     *
     * @param player
     * @param msg
     */
    public static void sendPlayerMsg(Player player, String msg) {
        String string = GlobalOptions.ingamePrefix + msg;

        player.sendMessage(string);
    }
}
