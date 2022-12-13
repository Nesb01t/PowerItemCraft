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
     * 执行物品描述设置
     *
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

    private static ItemStack makeItemLored(ItemStack itemStack) {
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.setLore(getDefaultLore());
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    private static ArrayList<String> getDefaultLore() {
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ItemUtils.makeColor("&7匠人印记 I"));
        lore.add(ItemUtils.makeColor("&8匠人经验 &70&f/&71000"));
        return lore;
    }
}
