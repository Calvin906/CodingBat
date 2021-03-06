package String3;

/**
 * Created by Wags on 4/15/17.
 */
public class WithoutString {
    public static void main(String[] args) {
        System.out.println("Expected: He there, Received: " + withoutString("Hello There", "llo"));

    }

    /**
     * Given two strings, base and remove, return a version
     * of the base string where all instances of the remove
     * string have been removed (not case sensitive).
     * You may assume that the remove string is length 1 or
     * more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p/>
     * withoutString("Hello there", "llo") → "He there"
     * withoutString("Hello there", "e") → "Hllo thr"
     * withoutString("Hello there", "x") → "Hello there"
     *
     * @param base
     * @param remove
     * @return
     */
    public static String withoutString(String base, String remove) {
        String result = "";
        for (int i = 0; i < base.length(); i++) {
            if (i + remove.length() <= base.length() && base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) {
                i += remove.length() - 1;
            } else {
                result += base.charAt(i);
            }
        }
        return result;
    }
}
