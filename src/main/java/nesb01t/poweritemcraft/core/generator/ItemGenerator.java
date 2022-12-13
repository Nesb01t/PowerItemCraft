package nesb01t.poweritemcraft.core.generator;

import nesb01t.poweritemcraft.utils.ItemUtils;
import nesb01t.poweritemcraft.utils.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

import static nesb01t.poweritemcraft.utils.EnchantUtils.makeItemEnchanted;

public class ItemGenerator {
    public static ItemStack createPowerItem(Material material) {
        ItemStack itemStack = new ItemStack(material);

        itemStack = makeItemNamed(itemStack);
        itemStack = makeItemLored(itemStack);
        itemStack = makeItemEnchanted(itemStack);
        itemStack = makeItemEnchanted(itemStack);
        itemStack = makeItemEnchanted(itemStack);
        return itemStack;
    }


    /**
     * 物品Name设置
     */
    private static ItemStack makeItemNamed(ItemStack itemStack) {
        ItemMeta itemMeta = itemStack.getItemMeta();
        String localeName = ItemUtils.getNameByMaterial(itemStack.getType());
        String displayName = ChatColor.translateAlternateColorCodes('&', "&a" + localeName);
        itemMeta.setDisplayName(displayName);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    /**
     * 物品Lore设置
     */
    private static ItemStack makeItemLored(ItemStack itemStack) {
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.setLore(getDefaultLore());
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    /**
     * Lore的ArrayList默认值
     */
    private static ArrayList<String> getDefaultLore() {
        ArrayList<String> lore = new ArrayList<>();
        lore.add(StringUtils.useColor("&7匠人印记 I"));
        return lore;
    }
}
