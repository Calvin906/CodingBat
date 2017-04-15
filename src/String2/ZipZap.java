package String2;

/**
 * Created by Wags on 4/14/17.
 */
public class ZipZap {

    public static void main(String[] args) {
        System.out.println("Expected: zzzpXzp, Received: " + zipZap("zzzipXzap"));
    }

    /**
     * Look for patterns like "zip" and "zap" in the string --
     * length-3, starting with 'z' and ending with 'p'. Return a
     * string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
     * <p/>
     * zipZap("zipXzap") → "zpXzp"
     * zipZap("zopzop") → "zpzp"
     * zipZap("zzzopzop") → "zzzpzp"
     *
     * @param str
     * @return
     */
    public static String zipZap(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                str = str.substring(0, i + 1) + str.substring(i + 2);
            }
        }

        return str;
    }
}
