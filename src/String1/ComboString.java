package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class ComboString {
    public static void main(String[] args) {
        System.out.print(comboString("aaa", "bb"));
    }

    /**
     * Given 2 strings, a and b, return a string of the form short+long+short,
     * with the shorter string on the outside and the longer string on the inside.
     * The strings will not be the same length, but they may be empty (length 0).
     * comboString("Hello", "hi") → "hiHellohi"
     * comboString("hi", "Hello") → "hiHellohi"
     * comboString("aaa", "b") → "baaab"
     * @param a
     * @param b
     * @return
     */
    public static String comboString(String a, String b) {
        String s = a;
        String l = b;
        if (a.length() > b.length()) {
            s = b;
            l = a;
        }
        return s + l + s;
    }
}
