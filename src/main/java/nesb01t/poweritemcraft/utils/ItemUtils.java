package nesb01t.poweritemcraft.utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class ItemUtils {
    public static String makeColor(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }

    public static String getLocaleName(Material material) {
        switch (material) {
            case DIAMOND_PICKAXE:
                return "钻石镐";
            case GOLDEN_PICKAXE:
                return "金镐";
            case IRON_PICKAXE:
                return "铁镐";
            case STONE_PICKAXE:
                return "石镐";
            case WOODEN_PICKAXE:
                return "木镐";
        }
        return "undefined";
    }

    public static Material getItemMaterial(String name) {
        switch (name) {
            case "diamond":
                return Material.DIAMOND_PICKAXE;
            case "gold":
                return Material.GOLDEN_PICKAXE;
            case "iron":
                return Material.IRON_PICKAXE;
            case "stone":
                return Material.STONE_PICKAXE;
            case "wooden":
                return Material.WOODEN_PICKAXE;
        }
        return Material.WOODEN_PICKAXE;
    }
}
