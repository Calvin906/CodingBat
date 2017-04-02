package Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wags on 4/2/17.
 */
public class WordMultiple {
    public static void main(String[] args) {
        String[] s = {"a", "b", "c", "a", "b"};
        System.out.print(wordMultiple(s));
    }

    /**
     * Given an array of strings, return a Map<String, Boolean>
     * where each different string is a key and its
     * value is true if that string appears 2 or more times in the array.
     * <p/>
     * wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
     * wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
     * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
     *
     * @param strings
     * @return
     */
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, true);
            } else {
                map.put(s, false);

            }
        }

        return map;

    }
}
