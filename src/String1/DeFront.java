package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class DeFront {
    public static void main(String[] args) {
        System.out.print(deFront("away"));
    }

    /**
     * Given a string, return a version without the first 2 chars.
     * Except keep the first char if it is 'a' and keep the second char
     * if it is 'b'. The string may be any length. Harder than it looks.
     * deFront("Hello") → "llo"
     * deFront("java") → "va"
     * deFront("away") → "aay"
     *
     * @param str
     * @return
     */
    public static String deFront(String str) {
        if (str.length() < 2) {
            if (str.charAt(0) == 'a') {
                return str;
            } else {
                return "";
            }
        } else if (str.startsWith("a")) {
            if (str.charAt(1) == 'b') {
                return str;
            } else {
                return str.charAt(0) + str.substring(2);
            }
        } else if (str.substring(1, 2).equals("b")) {
            return str.substring(1);
        } else {
            return str.substring(2);
        }

    }
}
