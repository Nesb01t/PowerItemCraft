package nesb01t.poweritemcraft.utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemUtils {
    private static ArrayList<Material> pickaxeList = new ArrayList<>(Arrays.asList(Material.DIAMOND_PICKAXE, Material.GOLDEN_PICKAXE, Material.IRON_PICKAXE, Material.STONE_PICKAXE, Material.WOODEN_PICKAXE));

    private static boolean chanceOf(int num) {
        Double random = Math.random() * 100;
        return num > random;
    }

    public static String makeColor(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }

    public static Enchantment getRandomEnchant(Material material) {
        if (pickaxeList.contains(material)) {
            if (chanceOf(20)) {
                return Enchantment.LOOT_BONUS_BLOCKS;
            } else if (chanceOf(50)) {
                return Enchantment.DIG_SPEED;
            } else if (chanceOf(8)) {
                return Enchantment.MENDING;
            }
        }
        return Enchantment.DURABILITY;
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
