package Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wags on 4/2/17.
 */
public class Word0 {

    public static void main(String[] args) {
        String[] arr = {"a", "b", "a", "b"};
        System.out.print(word0(arr));
    }

    /**
     * Given an array of strings, return a Map<String, Integer>
     * containing a key for every different string in the array,
     * always with the value 0. For example the string "hello"
     * makes the pair "hello":0. We'll do more complicated counting later,
     * but for this problem the value is simply 0.
     * <p/>
     * word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
     * word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
     * word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
     *
     * @param strings
     * @return
     */
    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 0);
            }
        }

        return map;

    }
}
