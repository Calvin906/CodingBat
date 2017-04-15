package String2;

/**
 * Created by Wags on 4/14/17.
 */
public class XyBalance {
    public static void main(String[] args) {
        System.out.print("Expected: false, Received: " + xyBalance("aaxbb"));
    }

    /**
     * We'll say that a String is xy-balanced if for all the 'x'
     * chars in the string, there exists a 'y' char somewhere
     * later in the string. So "xxy" is balanced, but "xyx" is
     * not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
     * <p/>
     * xyBalance("aaxbby") → true
     * xyBalance("aaxbb") → false
     * xyBalance("yaaxbb") → false
     *
     * @param str
     * @return
     */
    public static boolean xyBalance(String str) {
        boolean isBalance = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("x")) {
                isBalance = false;
            } else if (str.substring(i, i + 1).equals("y")) {
                isBalance = true;
            }
        }

        return isBalance;
    }
}
