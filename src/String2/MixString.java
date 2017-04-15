package String2;

/**
 * Created by Wags on 4/14/17.
 */
public class MixString {
    public static void main(String[] args) {
        System.out.print("Expected: axbycz, received: " + mixString("abc", "xy"));
    }

    /**
     * Given two strings, a and b, create a bigger string made
     * of the first char of a, the first char of b, the second char
     * of a, the second char of b, and so on. Any leftover chars go at the end of the result.
     * <p/>
     * mixString("abc", "xyz") → "axbycz"
     * mixString("Hi", "There") → "HTihere"
     * mixString("xxxx", "There") → "xTxhxexre"
     *
     * @param a
     * @param b
     * @return
     */
    public static String mixString(String a, String b) {
        String result = "";
        if (a.length() > b.length()) {
            for (int i = 0; i < b.length(); i++) {
                result = result + a.charAt(i) + b.charAt(i);
            }
            return result += a.substring(b.length());
        }

        for (int i = 0; i < a.length(); i++){
            result = result + a.charAt(i) + b.charAt(i);
        }
        return result += b.substring(a.length());
    }
}
