package String2;

/**
 * Created by Wags on 4/14/17.
 */
public class RepeatFront {
    public static void main(String[] args) {
        System.out.print("Expected: ChocChoChC, Received: " + repeatFront("Chocolate", 4));
    }

    /**
     * Given a string and an int n, return a string
     * made of the first n characters of the string,
     * followed by the first n-1 characters of the string,
     * and so on. You may assume that n is between 0 and
     * the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
     * <p/>
     * repeatFront("Chocolate", 4) → "ChocChoChC"
     * repeatFront("Chocolate", 3) → "ChoChC"
     * repeatFront("Ice Cream", 2) → "IcI"
     *
     * @param str
     * @param n
     * @return
     */
    public static String repeatFront(String str, int n) {
        String result = "";
        for (int i = n; i > 0; i--) {
            result += str.substring(0, i);
        }
        return result;
    }
}
