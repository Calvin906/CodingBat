package Warmup1;

/**
 * Created by Wags on 3/11/17.
 */
public class StartHi {
    public static void main(String[] args) {
        System.out.println(startHi("hello hi"));
    }

    /**
     * Given a string, return true if the string starts with "hi" and false otherwise.
     * startHi("hi there") → true
     * startHi("hi") → true
     * startHi("hello hi") → false
     *
     * @param str
     * @return
     */
    public static boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        } else {
            return str.substring(0, 2).equals("hi") ? true : false;
        }
    }
}
