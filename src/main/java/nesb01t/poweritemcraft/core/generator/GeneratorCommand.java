package nesb01t.poweritemcraft.core.generator;

import nesb01t.poweritemcraft.utils.Message;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GeneratorCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Message.sendPlayerMsg((Player) sender, String.valueOf(args.length));
        return true;
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
