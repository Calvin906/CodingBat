package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class MinCat {
    public static void main(String[] args) {
        System.out.print(minCat("Hello", "Java"));
    }

    /**
     * Given two strings, append them together (known as "concatenation") and
     * return the result. However, if the strings are different lengths, omit
     * chars from the longer string so it is the same length as the shorter string.
     * So "Hello" and "Hi" yield "loHi". The strings may be any length.
     * minCat("Hello", "Hi") → "loHi"
     * minCat("Hello", "java") → "ellojava"
     * minCat("java", "Hello") → "javaello"
     *
     * @param a
     * @param b
     * @return
     */
    public static String minCat(String a, String b) {
        int diff = 0;
        if (a.length() > b.length()) {
            diff = a.length() - b.length();
            return a.substring(diff).concat(b);
        } else if (b.length() > a.length()) {
            diff = b.length() - a.length();
            return a.concat(b.substring(diff));
        }
        return a.concat(b);
    }
}
