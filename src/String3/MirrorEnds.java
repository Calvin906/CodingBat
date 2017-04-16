package String3;

/**
 * Created by Wags on 4/16/17.
 */
public class MirrorEnds {

    public static void main(String[] args) {
        System.out.println("Expected: ab, Received: " + mirrorEnds("abXYZba"));
    }

    /**
     * Given a string, look for a mirror image (backwards)
     * string at both the beginning and end of the given string.
     * In other words, zero or more characters at the very beginning of
     * the given string, and at the very end of the string in reverse order
     * (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
     * <p/>
     * mirrorEnds("abXYZba") → "ab"
     * mirrorEnds("abca") → "a"
     * mirrorEnds("aba") → "aba"
     *
     * @param str
     * @return
     */
    public static String mirrorEnds(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(str.length()-i-1)){
                s += str.charAt(i);
            } else {
                break;
            }

        }
        return s;

    }
}
