package nesb01t.poweritemcraft.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;

import static nesb01t.poweritemcraft.utils.MathUtils.chanceOf;

public class EnchantUtils {
    private final static ArrayList<Material> pickaxeList = new ArrayList<>(Arrays.asList(Material.DIAMOND_PICKAXE, Material.GOLDEN_PICKAXE, Material.IRON_PICKAXE, Material.STONE_PICKAXE, Material.WOODEN_PICKAXE));

    public static ItemStack makeItemEnchanted(ItemStack itemStack) {
        ItemMeta itemMeta = itemStack.getItemMeta();
        Enchantment enchantment = getTypedRandomEnchant(itemStack.getType());
        int level = itemMeta.getEnchantLevel(enchantment);
        if (level > 9) level = 9;
        itemMeta.addEnchant(enchantment, level + 1, true);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public static Enchantment getTypedRandomEnchant(Material material) {
        if (pickaxeList.contains(material)) {
            if (chanceOf(20)) {
                return Enchantment.LOOT_BONUS_BLOCKS;
            } else if (chanceOf(50)) {
                return Enchantment.DIG_SPEED;
            } else if (chanceOf(8)) {
                return Enchantment.MENDING;
            }
        }
        return Enchantment.DURABILITY;
    }
}
