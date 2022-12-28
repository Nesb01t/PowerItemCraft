package nesb01t.poweritemcraft.core.poweritems;

import nesb01t.poweritemcraft.utils.EnchantUtils;
import nesb01t.poweritemcraft.GlobalOptions;
import nesb01t.poweritemcraft.utils.MessageUtils;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ItemModifier {
    /**
     * 尝试进行物品升级
     *
     * @param powerItem 升级的物品
     */
    public static void powerItemLevelUp(PowerItem powerItem) {
        int level = ItemDescriptionUtils.getPowerLevel(powerItem);
        if (level >= 10 || level <= 0) { // 满级或者非PowerItem
            MessageUtils.sendConsoleMsg("max level!");
            return;
        } else {
            // 设置物品Lore
            ItemDescriptionUtils.setPowerLevel(powerItem, level + 1);
            enhancePowerItem(powerItem);
        }
    }

    /**
     * 升级时的物品增强方案 - 默认
     *
     * @param powerItem 升级的物品
     */
    public static void enhancePowerItem(PowerItem powerItem) {
        ItemStack itemStack = powerItem.getItem();

        // 提供2次随机附魔
        EnchantUtils.makeItemEnchanted(powerItem.getItem());
        EnchantUtils.makeItemEnchanted(powerItem.getItem());

        powerItem.setItem(itemStack);
    }


}
