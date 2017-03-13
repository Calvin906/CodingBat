package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class ConCat {
    public static void main(String[] args) {
        System.out.print(conCat("abbc", "cat"));
    }

    /**
     * Given two strings, append them together (known as "concatenation") and
     * return the result. However, if the concatenation creates a double-char,
     * then omit one of the chars, so "abc" and "cat" yields "abcat".
     * conCat("abc", "cat") → "abcat"
     * conCat("dog", "cat") → "dogcat"
     * conCat("abc", "") → "abc"
     *
     * @param a,b
     * @return
     */
    public static String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0) {
            return a + b;
        } else if (a.substring(a.length() - 1, a.length()).equals(b.substring(0, 1))) {
            return a + b.substring(1, b.length());
        } else {
            return a + b;
        }

    }
}
