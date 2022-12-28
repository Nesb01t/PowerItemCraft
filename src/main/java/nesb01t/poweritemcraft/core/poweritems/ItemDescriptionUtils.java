package nesb01t.poweritemcraft.core.poweritems;

import nesb01t.poweritemcraft.utils.ItemUtils;
import nesb01t.poweritemcraft.utils.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

import static nesb01t.poweritemcraft.GlobalOptions.powerLevelPrefix;
import static nesb01t.poweritemcraft.GlobalOptions.powerLevelString;
import static nesb01t.poweritemcraft.utils.StringUtils.transRomenNumeralToInt;

public class ItemDescriptionUtils {
    /**
     * 设置 PowerItem 的格式化名称
     *
     * @param powerItem
     */
    public static void setFormatName(PowerItem powerItem) {
        ItemStack itemStack = powerItem.getItem();
        ItemMeta itemMeta = itemStack.getItemMeta();
        assert itemMeta != null;

        // 获取本地化物品名并添加前缀
        String localeName = ItemUtils.getLocaleName(itemStack);
        String coloredName = ChatColor.translateAlternateColorCodes('&', "&a" + localeName);
        itemMeta.setDisplayName(coloredName);

        itemStack.setItemMeta(itemMeta);
        powerItem.setItem(itemStack);
    }

    /**
     * 设置 PowerItem 的等级
     *
     * @param powerItem
     * @param level
     */
    public static void setPowerLevel(PowerItem powerItem, int level) {
        ItemStack itemStack = powerItem.getItem();
        ItemMeta itemMeta = itemStack.getItemMeta();
        assert itemMeta != null;

        // 设置物品等级 Lore
        ArrayList<String> lore = new ArrayList<>();
        lore.add(StringUtils.useColor(powerLevelPrefix + powerLevelString[level])); // 前缀 + 等级文字
        itemMeta.setLore(lore);

        itemStack.setItemMeta(itemMeta);
        powerItem.setItem(itemStack);
    }

    /**
     * 获取 PowerItem 的等级
     *
     * @param powerItem
     * @return
     */
    public static int getPowerLevel(PowerItem powerItem) {
        List<String> lore = powerItem.getItem().getItemMeta().getLore();
        for (String line : lore) {
            if (line.contains("匠人印记")) {
                String alpha = line.substring(7);
                return transRomenNumeralToInt(alpha);
            }
        }
        return 0;
    }
}
