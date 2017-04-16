package String3;

/**
 * Created by Wags on 4/16/17.
 */
public class SameEnds {
    public static void main(String[] args) {
        System.out.println("Expected: ab, Received: " + sameEnds("abXYab"));
    }

    /**
     * Given a string, return the longest substring that
     * appears at both the beginning and end of the string
     * without overlapping. For example, sameEnds("abXab") is "ab".
     * <p/>
     * sameEnds("abXYab") → "ab"
     * sameEnds("xx") → "x"
     * sameEnds("xxx") → "x"
     *
     * @param str
     * @return
     */
    public static String sameEnds(String str) {
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(0, i + 1).equals(str.substring(str.length() - i - 1)) && i < str.length() / 2) {
                s = str.substring(0, i + 1);
            }
        }

        return s;

    }
}
