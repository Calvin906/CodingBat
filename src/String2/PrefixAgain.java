package String2;

/**
 * Created by Wags on 4/14/17.
 */
public class PrefixAgain {
    public static void main(String[] args) {
        System.out.print("Expected: false, Received: " + prefixAgain("abXYabc", 3));
    }

    /**
     * Given a string, consider the prefix string made of the
     * first N chars of the string. Does that prefix string
     * appear somewhere else in the string? Assume that the
     * string is not empty and that N is in the range 1..str.length().
     * <p/>
     * prefixAgain("abXYabc", 1) → true
     * prefixAgain("abXYabc", 2) → true
     * prefixAgain("abXYabc", 3) → false
     *
     * @param str
     * @param n
     * @return
     */
    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return str.substring(n).contains(prefix);

    }
}
