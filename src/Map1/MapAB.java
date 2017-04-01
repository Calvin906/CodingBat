package Map1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wags on 4/1/17.
 */
public class MapAB {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "candy");
        map.put("b", "dirt");
        System.out.print(mapAB(map));
    }

    /**
     * Modify and return the given map as follows:
     * for this problem the map may or may not contain
     * the "a" and "b" keys. If both keys are present,
     * append their 2 string values together and store the result under the key "ab".
     * <p/>
     * mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
     * mapAB({"a": "Hi"}) → {"a": "Hi"}
     * mapAB({"b": "There"}) → {"b": "There"}
     *
     * @param map
     * @return
     */
    public static Map<String, String> mapAB(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {
            String toAppend = map.get("a") + map.get("b");
            map.put("ab", toAppend);
        }

        return map;

    }

}
