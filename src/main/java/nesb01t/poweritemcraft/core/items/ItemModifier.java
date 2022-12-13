package nesb01t.poweritemcraft.core.items;

import nesb01t.poweritemcraft.utils.EnchantUtils;
import nesb01t.poweritemcraft.utils.MessageUtils;
import org.bukkit.inventory.ItemStack;

import static nesb01t.poweritemcraft.core.items.DescribeGenerator.setLevelLore;

public class ItemModifier {

    public static ItemStack setPowerLevel(ItemStack itemStack, int level) {
        setLevelLore(itemStack, level);
        return itemStack;
    }

    public static void levelUp(ItemStack itemStack) {
        int level = DescribeGenerator.getLevel(itemStack);
        if (level >= 10 || level <= 0) {
            MessageUtils.sendConsoleMsg("max level!");
            return;
        }
        setPowerLevel(itemStack, level + 1);
        EnchantUtils.makeItemEnchanted(itemStack);
        EnchantUtils.makeItemEnchanted(itemStack);
    }
}
