package Map1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wags on 4/1/17.
 */
public class MapShare {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "candy");
        map.put("b", "dirt");

        System.out.print(mapShare(map));
    }

    /**
     * Modify and return the given map as follows:
     * if the key "a" has a value, set the key "b" to
     * have that same value. In all cases remove the key
     * "c", leaving the rest of the map unchanged.
     * <p/>
     * mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
     * mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
     * mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
     *
     * @param map
     * @return
     */
    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        if (map.containsKey("c")) {
            map.remove("c");
        }
        return map;
    }
}
