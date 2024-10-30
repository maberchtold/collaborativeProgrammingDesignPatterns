package flyweight.paintingBrush_useThis;

import java.util.HashMap;
import java.util.Map;

public class BrushFactory {
    private static Map<String, Brush> brushMap = new HashMap<String, Brush>();

    public static Brush getBrush(String size, String color) {
        String key = size + color;
        if (!brushMap.containsKey(key)) {
            brushMap.put(key, new Brush(size, color));
        }
        return brushMap.get(key);
    }
}
