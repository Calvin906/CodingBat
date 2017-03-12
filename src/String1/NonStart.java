package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class NonStart {
    public static void main(String[] args) {
        System.out.print(nonStart("shotl", "java"));
    }

    /**
     * Given 2 strings, return their concatenation,
     * except omit the first char of each. The strings will be at least length 1.
     * nonStart("Hello", "There") → "ellohere"
     * nonStart("java", "code") → "avaode"
     * nonStart("shotl", "java") → "hotlava"
     *
     * @param a
     * @param b
     * @return
     */
    public static String nonStart(String a, String b) {
        String result = a.substring(1).concat(b.substring(1));
        return result;
    }
}
