package nesb01t.poweritemcraft.utils;

import org.bukkit.Material;

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

    public static String getNameByMaterial(Material material) {
        if (nameMap.containsKey(material)) {
            return nameMap.get(material);
        }
        return "未知物品";
    }

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
