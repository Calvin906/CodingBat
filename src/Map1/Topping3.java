package Map1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wags on 4/1/17.
 */
public class Topping3 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("potato", "ketchup");
        System.out.print(topping3(map));
    }

    /**
     * Given a map of food keys and topping values, modify and
     * return the map as follows: if the key "potato" has a value,
     * set that as the value for the key "fries". If the key "salad"
     * has a value, set that as the value for the key "spinach".
     * <p/>
     * topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
     * topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
     * topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
     *
     * @param map
     * @return
     */
    public static Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")){
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")){
            map.put("spinach", map.get("salad"));
        }
        return map;

    }
}
