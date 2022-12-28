package nesb01t.poweritemcraft.core.poweritems;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class PowerItem {
    private ItemStack item;

    public PowerItem(Material material) {
        ItemStack itemStack = new ItemStack(material);
        ItemDescriptionUtils.setFormatName(this); // 格式化物品名
    }

    public PowerItem(ItemStack itemStack) {
        this.item = itemStack;
    }

    public ItemStack getItem() {
        return this.item;
    }

    public void setItem(ItemStack newItemStack) {
        this.item = newItemStack;
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

}
