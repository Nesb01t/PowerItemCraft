package nesb01t.poweritemcraft.core.items;

import org.bukkit.inventory.ItemStack;

import static nesb01t.poweritemcraft.core.items.DescribeGenerator.setLevelLore;

public class ItemModifier {

    public static ItemStack setPowerLevel(ItemStack itemStack, int level) {
        setLevelLore(itemStack, level);
        return itemStack;
    }

    public static ItemStack levelUp(ItemStack itemStack) {
        int level = DescribeGenerator.getLevel(itemStack);
        setPowerLevel(itemStack, level + 1);

        return itemStack;
    }
}
