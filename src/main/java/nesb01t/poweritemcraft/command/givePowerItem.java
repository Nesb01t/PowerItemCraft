package nesb01t.poweritemcraft.command;

import nesb01t.poweritemcraft.utils.MessageUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static nesb01t.poweritemcraft.core.poweritems.ItemGenerator.createNewItem;
import static nesb01t.poweritemcraft.utils.ItemUtils.getMaterialByName;

public class givePowerItem implements CommandExecutor {
    public static void givePowerItemToPlayer(String materialName, Player player) {
        ItemStack poweritem = createNewItem(getMaterialByName(materialName));
        player.getInventory().addItem(poweritem);
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
