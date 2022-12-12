package nesb01t.poweritemcraft.core.generator;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemResolver {
    private final static List<Material> pickaxeList = List.of(new Material[]{Material.WOODEN_PICKAXE, Material.STONE_PICKAXE, Material.IRON_PICKAXE, Material.GOLDEN_PICKAXE, Material.DIAMOND_PICKAXE});

    public static void resolvePlayerTool(Player player) {
        ItemStack itemStack = player.getItemInHand();
        ItemMeta itemMeta = itemStack.getItemMeta();
    }

    public static boolean isHoldingPickaxe(Player player) {
        Material material = player.getItemInHand().getType();
        return pickaxeList.contains(material);
    }
}
