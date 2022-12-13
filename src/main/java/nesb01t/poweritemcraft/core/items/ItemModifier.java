package nesb01t.poweritemcraft.core.items;

import nesb01t.poweritemcraft.utils.EnchantUtils;
import nesb01t.poweritemcraft.utils.GlobalOptions;
import nesb01t.poweritemcraft.utils.MessageUtils;
import org.bukkit.entity.Player;
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

    public static void levelUp(ItemStack itemStack, Player player) {
        int level = DescribeGenerator.getLevel(itemStack);
        if (level >= 10 || level <= 0) {
            return;
        }
        player.sendMessage(GlobalOptions.ingamePrefix + "恭喜, 你的武器升到了 " + level + " 级!");
        setPowerLevel(itemStack, level + 1);
        EnchantUtils.makeItemEnchanted(itemStack);
        EnchantUtils.makeItemEnchanted(itemStack);
    }
}
