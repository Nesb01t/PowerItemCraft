package nesb01t.poweritemcraft.core.generator;

import nesb01t.poweritemcraft.utils.MessageUtils;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static nesb01t.poweritemcraft.core.generator.ItemGenerator.createPowerItem;
import static nesb01t.poweritemcraft.utils.ItemUtils.getItemMaterial;

public class GeneratorCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        MessageUtils.sendPlayerMsg(player, String.valueOf(args.length));

        if (args.length == 1) {
            Material material = getItemMaterial(args[0]);
            ItemStack poweritem = createPowerItem(material);
            player.getInventory().addItem(poweritem);
        }
        return true;
    }
}
