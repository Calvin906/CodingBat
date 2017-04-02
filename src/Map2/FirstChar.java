package Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wags on 4/2/17.
 */
public class FirstChar {

    public static void main(String[] args) {
        String[] arr = {"salt", "tea", "soda", "toast"};
        System.out.print(firstChar(arr));
    }

    /**
     * Given an array of non-empty strings,
     * return a Map<String, String> with a key for every different
     * first character seen, with the value of all the strings starting
     * with that character appended together in the order they appear in the array.
     * <p/>
     * firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
     * firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
     * firstChar([]) → {}
     *
     * @param strings
     * @return
     */
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (String s : strings) {
            if (map.containsKey(s.substring(0, 1))) {
                map.put(s.substring(0, 1), map.get(s.substring(0, 1)) + s);
            } else {
                map.put(s.substring(0, 1), s);
            }
        }
        return map;
    }
}
