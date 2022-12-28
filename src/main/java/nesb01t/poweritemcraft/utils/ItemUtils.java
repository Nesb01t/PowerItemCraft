package nesb01t.poweritemcraft.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class ItemUtils {
    private static final Map<Material, String> nameMap = new HashMap<>() {{
        put(Material.WOODEN_PICKAXE, "木镐");
        put(Material.STONE_PICKAXE, "石镐");
        put(Material.IRON_PICKAXE, "铁镐");
        put(Material.GOLDEN_PICKAXE, "金镐");
        put(Material.DIAMOND_PICKAXE, "钻石镐");
    }};


    /**
     * 通过 Material 获取本地化名称
     *
     * @param material
     * @return 物品中文名
     */
    public static String getLocaleName(Material material) {
        if (nameMap.containsKey(material)) {
            return nameMap.get(material);
        }
        return "未知物品";
    }

    /**
     * 通过 ItemStack 获取本地化名称
     *
     * @param itemStack
     * @return 物品中文名
     */
    public static String getLocaleName(ItemStack itemStack) {
        Material material = itemStack.getData().getItemType();
        return getLocaleName(material);
    }

    /**
     * 通过物品中文名获取对应 Material
     *
     * @param name
     * @return Material
     */
    public static Material getMaterialByName(String name) {
        Material material = Material.WOODEN_SWORD;
        for (Material i : nameMap.keySet()) {
            String str = nameMap.get(i);
            if (str.equals(name)) {
                material = i;
            }
        }
        return material;
    }
}
