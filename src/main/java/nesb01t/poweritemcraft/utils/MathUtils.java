package nesb01t.poweritemcraft.utils;

public class MathUtils {
    public static boolean chanceOf(int num) {
        Double random = Math.random() * 100;
        return num > random;
    }
}
