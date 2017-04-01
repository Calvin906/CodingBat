package Map1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wags on 4/1/17.
 */
public class MapBully {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "candy");
        map.put("b", "dirt");
        System.out.print(mapBully(map));
    }

    /**
     * Modify and return the given map as follows:
     * if the key "a" has a value, set the key "b" to
     * have that value, and set the key "a" to have the
     * value "". Basically "b" is a bully, taking the
     * value and replacing it with the empty string.
     * <p/>
     * mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
     * mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
     * mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
     *
     * @param map
     * @return
     */
    public static Map<String, String> mapBully(Map<String, String> map) {


        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;

    }
}
