package nesb01t.poweritemcraft.core.generator;

import nesb01t.poweritemcraft.utils.Message;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GeneratorCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        Message.sendPlayerMsg(player, String.valueOf(args.length));

        if (args.length == 1) {
            Material material = getItemMaterial(args[0]);
            ItemStack poweritem = createPowerItem(material);
            player.getInventory().addItem(poweritem);
        }
        return true;
    }

    public ItemStack createPowerItem(Material material) {
        ItemStack itemStack = new ItemStack(material);
        ItemMeta itemMeta = itemStack.getItemMeta();
        String displayName = ChatColor.translateAlternateColorCodes('&', "&a" + itemMeta.getLocalizedName());

        itemMeta.setDisplayName(displayName);

        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public Material getItemMaterial(String name) {
        switch (name) {
            case "diamond":
                return Material.DIAMOND_PICKAXE;
            case "gold":
                return Material.GOLDEN_PICKAXE;
            case "iron":
                return Material.IRON_PICKAXE;
            case "stone":
                return Material.STONE_PICKAXE;
            case "wooden":
                return Material.WOODEN_PICKAXE;
        }
        return Material.WOODEN_PICKAXE;
    }
}
