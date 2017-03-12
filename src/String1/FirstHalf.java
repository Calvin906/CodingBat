package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class FirstHalf {
    public static void main(String[] args) {
        System.out.print(firstHalf("HelloThere"));
    }

    /**
     * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
     * firstHalf("WooHoo") → "Woo"
     * firstHalf("HelloThere") → "Hello"
     * firstHalf("abcdef") → "abc"
     * @param str
     * @return
     */
    public static String firstHalf(String str) {
        return str.substring(0, str.length()/2);
    }
}
