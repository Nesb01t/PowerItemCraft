package nesb01t.poweritemcraft.events;

import nesb01t.poweritemcraft.core.poweritems.PowerItem;
import nesb01t.poweritemcraft.core.service.PlayerService;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemBreakEvent;
import org.bukkit.inventory.ItemStack;

public class PowerItemBreakEvent implements Listener {
    @EventHandler
    public void onItemBreak(PlayerItemBreakEvent event) {
        ItemStack itemStack = event.getBrokenItem();
        boolean isPowerItem = PowerItem.isPowerItem(itemStack);
        if (!isPowerItem) { // 检查Lore
            return;
        } else {
            Player player = event.getPlayer();
            PlayerService.playerItemLevelUp(player); // 提供玩家升级
        }
    }
}
