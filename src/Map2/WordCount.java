package Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wags on 4/2/17.
 */
public class WordCount {

    public static void main(String[] args) {
        String[] arr = {"a", "b", "a", "b"};
        System.out.print(wordCount(arr));
    }

    /**
     * The classic word-count algorithm: given an array of strings,
     * return a Map<String, Integer> with a key for each different string,
     * with the value the number of times that string appears in the array.
     * <p/>
     * wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
     * wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
     * wordCount(["c", "c", "c", "c"]) → {"c": 4}
     *
     * @param strings
     * @return
     */
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        return map;

    }
}
