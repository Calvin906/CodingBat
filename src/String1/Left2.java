package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class Left2 {
    public static void main(String[] args) {
        System.out.print(left2("java"));
    }

    /**
     * Given a string, return a "rotated left 2" version
     * where the first 2 chars are moved to the end. The string length will be at least 2.
     * left2("Hello") → "lloHe"
     * left2("java") → "vaja"
     * left2("Hi") → "Hi"
     * @param str
     * @return
     */
    public static String left2(String str) {
        String result = str.substring(2).concat(str.substring(0,2));
        return result;
    }
}
