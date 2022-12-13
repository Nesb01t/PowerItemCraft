package nesb01t.poweritemcraft.core.items;

import nesb01t.poweritemcraft.utils.ItemUtils;
import nesb01t.poweritemcraft.utils.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class DescribeGenerator {
    private static final String lorePrefix = "&7匠人印记 ";
    private static final String[] levelString = new String[]{"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public static void makeItemDefaultNamed(ItemStack itemStack) {
        ItemMeta itemMeta = itemStack.getItemMeta();
        String localeName = ItemUtils.getNameByMaterial(itemStack.getType());
        String displayName = ChatColor.translateAlternateColorCodes('&', "&a" + localeName);
        itemMeta.setDisplayName(displayName);
        itemStack.setItemMeta(itemMeta);
    }

    public static void makeItemDefaultLored(ItemStack itemStack) {
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setLore(getLevelLore(1));
        itemStack.setItemMeta(itemMeta);
    }

    public static boolean isPowerItem(ItemStack itemStack) {
        List<String> lore = itemStack.getItemMeta().getLore();
        for (String line : lore) {
            if (lore.contains("匠人印记")) {
                return true;
            }
        }
        return false;
    }

    public static int getLevel(ItemStack itemStack) {
        List<String> lore = itemStack.getItemMeta().getLore();
        for (String line : lore) {
            if (line.contains("匠人印记")) {
                String alpha = line.substring(7);
                return parseAlphaToNumber(alpha);
            }
        }
        return 0;
    }

    public static void setLevelLore(ItemStack itemStack, int level) {
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setLore(getLevelLore(level));
        itemStack.setItemMeta(itemMeta);
    }

    private static ArrayList<String> getLevelLore(int level) {
        ArrayList<String> lore = new ArrayList<>();
        lore.add(StringUtils.useColor(lorePrefix + levelString[level]));
        return lore;
    }

    private static int parseAlphaToNumber(String str) {
        for (int i = 0; i < levelString.length; i++) {
            if (levelString[i].equals(str)) {
                return i;
            }
        }
        return 0;
    }
}
