package nesb01t.poweritemcraft.utils;

import org.bukkit.ChatColor;

public class StringUtils {
    public static String useColor(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
