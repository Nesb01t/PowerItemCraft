package nesb01t.poweritemcraft.core.generator;

import nesb01t.poweritemcraft.utils.ItemUtils;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemGenerator {
    public static ItemStack createPowerItem(Material material) {
        ItemStack itemStack = new ItemStack(material);

        itemStack = makeItemNamed(itemStack);
        itemStack = makeItemLored(itemStack);
        return itemStack;
    }

    /**
     * 物品Name设置
     *
     * @param itemStack
     * @return
     */
    private static ItemStack makeItemNamed(ItemStack itemStack) {
        ItemMeta itemMeta = itemStack.getItemMeta();
        String localeName = ItemUtils.getLocaleName(itemStack.getType());
        String displayName = ChatColor.translateAlternateColorCodes('&', "&a" + localeName);
        itemMeta.setDisplayName(displayName);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    /**
     * 物品Lore设置
     *
     * @param itemStack
     * @return
     */
    private static ItemStack makeItemLored(ItemStack itemStack) {
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.setLore(getDefaultLore());
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    /**
     * Lore的ArrayList默认值
     *
     * @return
     */
    private static ArrayList<String> getDefaultLore() {
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ItemUtils.makeColor("&7匠人印记 I"));
        return lore;
    }
}