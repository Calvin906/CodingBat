package Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wags on 4/2/17.
 */
public class WordLen {
    public static void main(String[] args) {
        String[] arr = {"a", "bb", "aa", "b"};
        System.out.print(wordLen(arr));
    }

    /**
     * Given an array of strings, return a Map<String, Integer>
     * containing a key for every different string in the array, and the value is that string's length.
     * <p/>
     * wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
     * wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
     * wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
     *
     * @param strings
     * @return
     */
    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, s.length());
            }
        }
        return map;

    }
}
