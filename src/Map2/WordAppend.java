package Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wags on 4/2/17.
 */
public class WordAppend {

    public static void main(String[] args) {
        String[] arr = {"a", "b", "a"};
        System.out.print(wordAppend(arr));
    }

    /**
     * Loop over the given array of strings to build a result string
     * like this: when a string appears the 2nd, 4th, 6th, etc. time
     * in the array, append the string to the result.
     * Return the empty string if no string appears a 2nd time.
     * <p/>
     * wordAppend(["a", "b", "a"]) → "a"
     * wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
     * wordAppend(["a", "", "a"]) → "a"
     *
     * @param strings
     * @return
     */
    public static String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String result = "";
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                int val = map.get(strings[i]);
                val++;
                if (val % 2 == 0) {
                    result += strings[i];
                }
                map.put(strings[i], val);
            } else {
                map.put(strings[i], 1);
            }
        }
        return result;
    }
}
