package Warmup2;

/**
 * Created by Wags on 3/11/17.
 */
public class StringYak {
    public static void main(String[] args) {
        System.out.print(stringYak("yakpak"));
    }

    /**
     * Suppose the string "yak" is unlucky. Given a string, return a version where all
     * the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
     * stringYak("yakpak") → "pak"
     * stringYak("pakyak") → "pak"
     * stringYak("yak123ya") → "123ya"
     * @param str
     * @return
     */
    public static String stringYak(String str) {
        if (str.length() < 3) {
            return str;
        } else if (str.substring(0,3).equals("yak")) {
            return stringYak(str.substring(3));
        }
        return str.charAt(0) + stringYak(str.substring(1));
    }
}
