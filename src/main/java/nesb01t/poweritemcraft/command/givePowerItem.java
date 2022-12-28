package nesb01t.poweritemcraft.command;

import nesb01t.poweritemcraft.core.poweritems.PowerItem;
import nesb01t.poweritemcraft.utils.MessageUtils;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static nesb01t.poweritemcraft.utils.ItemUtils.getMaterialByName;

public class givePowerItem implements CommandExecutor {
    public static void givePowerItemToPlayer(String name, Player player) {
        PowerItem powerItem = new PowerItem(name);
        ItemStack itemStack = powerItem.getItem();

        player.getInventory().addItem(itemStack);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        MessageUtils.sendPlayerMsg(player, String.valueOf(args.length));

        if (args.length == 1) {
            givePowerItemToPlayer(args[0], player);
        }
        return true;
    }
}
