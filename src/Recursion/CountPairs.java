package Recursion;

/**
 * Created by Wags on 3/7/17.
 */
public class CountPairs {
    public static void main(String[] args) {
        String str = "ihjxhh";
        System.out.println(countPairs(str));
    }

    /**
     * We'll say that a "pair" in a string is two instances of a char separated by a char.
     * So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x.
     * Recursively compute the number of pairs in the given string.
     * countPairs("axa") → 1
     * countPairs("axax") → 2
     * countPairs("axbx") → 1
     * @param str
     * @return
     */
    public static int countPairs(String str) {
        if (str.length() <=  2) {
            return 0;
        } if (str.charAt(0) == str.charAt(2)) {
            return 1 + countPairs(str.substring(1));
        } else {
            return countPairs(str.substring(1));
        }
    }
}
