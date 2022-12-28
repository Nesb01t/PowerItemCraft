package nesb01t.poweritemcraft.utils;

import org.bukkit.ChatColor;

import static nesb01t.poweritemcraft.GlobalOptions.powerLevelString;

public class StringUtils {
    public static String useColor(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }

    public static int transRomenNumeralToInt(String str) {
        for (int i = 0; i < powerLevelString.length; i++) {
            if (powerLevelString[i].equals(str)) {
                return i;
            }
        }
        return 0;
    }
}
