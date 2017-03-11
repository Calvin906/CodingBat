package Recursion;

/**
 * Created by Wags on 3/10/17.
 */
public class StrCopies {
    public static void main(String[] args) {
        String str = "iiijjj";
        System.out.println(strCopies(str, "ii", 2));
        //System.out.println(strCopies(str, "cow", 12));

    }

    /**
     * Given a string and a non-empty substring sub, compute recursively if at least n
     * copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.
     * strCopies("catcowcat", "cat", 2) → true
     * strCopies("catcowcat", "cow", 2) → false
     * strCopies("catcowcat", "cow", 1) → true
     * @param str
     * @param sub
     * @param n
     * @return
     */
    public static boolean strCopies(String str, String sub, int n) {
        if (n == 0) {
            return true;
        }
        else if (str.length() < sub.length()) {
            return false;
        } else if (str.substring(0,sub.length()).equals(sub)) {
            return strCopies(str.substring(1),sub, n - 1);
        } else {
            return strCopies(str.substring(1),sub, n);
        }
    }
}
