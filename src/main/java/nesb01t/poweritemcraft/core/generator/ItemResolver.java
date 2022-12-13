package nesb01t.poweritemcraft.core.generator;

import nesb01t.poweritemcraft.utils.ItemUtils;
import nesb01t.poweritemcraft.utils.MessageUtils;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemResolver {
    private final static List<Material> pickaxeList = List.of(new Material[]{Material.WOODEN_PICKAXE, Material.STONE_PICKAXE, Material.IRON_PICKAXE, Material.GOLDEN_PICKAXE, Material.DIAMOND_PICKAXE});

    /**
     * 为玩家升级 PowerLevel
     *
     * @param itemStack
     * @return
     */
    public static ItemStack addPowerLevel(ItemStack itemStack) {
        ItemMeta itemMeta = itemStack.getItemMeta();
        String lore1 = itemMeta.getLore().get(0);
        if (lore1.contains("匠人印记")) {
            String alpha = lore1.substring(7);
            MessageUtils.sendConsoleMsg(alpha);
            int level = resolveAlpha(alpha);

            itemStack = setLevelLore(itemStack, level + 1);
            itemStack = ItemGenerator.makeItemEnchanted(itemStack);
            itemStack = ItemGenerator.makeItemEnchanted(itemStack);
        }
        return itemStack;
    }

    /**
     * 获取玩家工具的 PowerLevel
     *
     * @param player
     * @return
     */
    public static int getPowerLevel(Player player) {
        ItemStack itemStack = player.getItemInHand();
        ItemMeta itemMeta = itemStack.getItemMeta();
        String lore1 = itemMeta.getLore().get(0);
        if (lore1.contains("匠人印记")) {
            String alpha = lore1.substring(5);
            return resolveAlpha(alpha);
        }
        return 0;
    }

    private static ItemStack setLevelLore(ItemStack itemStack, int level) {
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setLore(getLevelLore(level));
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    private static int resolveAlpha(String str) {
        switch (str) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
        }
        return 0;
    }

    private static String getAlpha(int num) {
        switch (num) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
            case 6:
                return "V";
        }
        return "I";
    }

    private static ArrayList<String> getLevelLore(int level) {
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ItemUtils.makeColor("&7匠人印记 " + getAlpha(level)));
        return lore;
    }
}
