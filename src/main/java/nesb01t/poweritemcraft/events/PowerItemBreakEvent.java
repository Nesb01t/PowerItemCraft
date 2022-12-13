package nesb01t.poweritemcraft.events;

import nesb01t.poweritemcraft.core.items.ItemModifier;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemBreakEvent;
import org.bukkit.inventory.ItemStack;

public class PowerItemBreakEvent implements Listener {
    @EventHandler
    public void onItemBreak(PlayerItemBreakEvent event) {
        if (event.getBrokenItem().getItemMeta().getLore().isEmpty()) {
            return;
        } else {
            Player player = event.getPlayer();
            ItemStack itemStack = ItemModifier.setPowerLevel(event.getBrokenItem(), 1);
            itemStack.setDurability((short) 0);
            player.setItemInHand(itemStack);
        }
    }
}
