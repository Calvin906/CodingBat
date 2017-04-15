package String2;

/**
 * Created by Wags on 4/14/17.
 */
public class RepeatEnd {
    public static void main(String[] args) {
        System.out.print("Expected: llollollo, Received: " + repeatEnd("Hello", 3));
    }

    /**
     * Given a string and an int n, return a string made of n
     * repetitions of the last n characters of the string.
     * You may assume that n is between 0 and the length of the string, inclusive.
     * <p/>
     * repeatEnd("Hello", 3) → "llollollo"
     * repeatEnd("Hello", 2) → "lolo"
     * repeatEnd("Hello", 1) → "o"
     *
     * @param str
     * @param n
     * @return
     */
    public static String repeatEnd(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str.substring(str.length() - n);
        }
        return result;
    }
}
