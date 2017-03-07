/**
 * Created by Wags on 3/6/17.
 */
public class ReverseString {
    public static void main(String[] args) {
        String s = "Richard";
        System.out.println(reverse(s));
    }

    /**
     * Recursively reverse a string
     * Expensive
     * @param s
     * @return
     */
    public static String reverse(String s) {
        return s.length() == 0 ? s: reverse(s.substring(1)) + s.charAt(0);
    }
}
