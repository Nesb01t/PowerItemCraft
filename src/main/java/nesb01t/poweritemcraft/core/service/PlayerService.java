package nesb01t.poweritemcraft.core.service;

import nesb01t.poweritemcraft.core.poweritems.ItemModifier;
import nesb01t.poweritemcraft.core.poweritems.PowerItem;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PlayerService {
    /**
     * 尝试给玩家手持物品升级
     *
     * @param player 玩家
     */
    public static void playerItemLevelUp(Player player) {
        PowerItem powerItem = new PowerItem(player.getInventory().getItemInMainHand());
        ItemStack itemStack = powerItem.getItem();

        itemStack.setDurability((short) 0); // 恢复物品耐久
        ItemModifier.powerItemLevelUp(powerItem); // 升级物品

        player.setItemInHand(itemStack);
    }

}
