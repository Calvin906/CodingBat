package Warmup2;

/**
 * Created by Wags on 3/11/17.
 */
public class StringTimes {
    public static void main(String[] args) {
        System.out.print(stringTimes("Hi", 3));
    }

    /**
     * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
     * stringTimes("Hi", 2) → "HiHi"
     * stringTimes("Hi", 3) → "HiHiHi"
     * stringTimes("Hi", 1) → "Hi"
     * @param str
     * @param n
     * @return
     */
    public static String stringTimes(String str, int n) {
        String newString = "";
        for (int i = 0; i < n; i++ ) {
            newString += str;
        }
        return newString;
    }
}
