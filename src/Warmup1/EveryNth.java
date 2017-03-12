package Warmup1;

/**
 * Created by Wags on 3/11/17.
 */
public class EveryNth {
    public static void main(String[] args) {
        System.out.print(everyNth("abdscssaer", 3));
    }

    /**
     * Given a non-empty string and an int N, return the string made starting with
     * char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
     * everyNth("Miracle", 2) → "Mrce"
     * everyNth("abcdefg", 2) → "aceg"
     * everyNth("abcdefg", 3) → "adg"
     * @param str
     * @param n
     * @return
     */
    public static String everyNth(String str, int n) {
        if (str.length() <= n) {
            return String.valueOf(str.charAt(0));
        } else {
            return str.charAt(0) + everyNth(str.substring(n),n);
        }
    }
}
