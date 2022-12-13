package nesb01t.poweritemcraft.core.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static nesb01t.poweritemcraft.core.items.DescribeGenerator.makeItemDefaultLored;
import static nesb01t.poweritemcraft.core.items.DescribeGenerator.makeItemDefaultNamed;
import static nesb01t.poweritemcraft.utils.EnchantUtils.makeItemEnchanted;

public class ItemGenerator {
    public static ItemStack createNewItem(Material material) {
        ItemStack itemStack = new ItemStack(material);
        initNewItem(itemStack);
        return itemStack;
    }

    public static void initNewItem(ItemStack itemStack) {
        makeItemDefaultNamed(itemStack); // 设置名称
        makeItemDefaultLored(itemStack); // 设置默认Lore
        for (int i = 0; i < 3; i++) {
            makeItemEnchanted(itemStack); // 给予三次附魔
        }
    }
}
