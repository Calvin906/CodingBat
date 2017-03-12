package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class NTwice {
    public static void main(String str) {
        System.out.print(nTwice("Choclate", 3));
    }

    /**
     * Given a string and an int n, return a string made of
     * the first and last n chars from the string. The string length will be at least n.
     * nTwice("Hello", 2) → "Helo"
     * nTwice("Chocolate", 3) → "Choate"
     * nTwice("Chocolate", 1) → "Ce"
     * @param str
     * @param n
     * @return
     */
    public static String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length()-n);
    }
}
