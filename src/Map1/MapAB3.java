package Map1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wags on 4/1/17.
 */
public class MapAB3 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "aaa");
        map.put("b", "aaa");
        map.put("c", "cake");
        System.out.print(mapAB3(map));
    }

    /**
     * Modify and return the given map as follows:
     * if exactly one of the keys "a" or "b" has a
     * value in the map (but not both), set the other to have that same value in the map.
     * <p/>
     * mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
     * mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
     * mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
     *
     * @param map
     * @return
     */
    public static Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")){
            map.put("b", map.get("a"));
        } else if (map.containsKey("b") && !map.containsKey("a")){
            map.put("a", map.get("b"));
        }

        return map;
    }
}
