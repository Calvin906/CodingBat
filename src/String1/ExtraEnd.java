package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class ExtraEnd {
    public static void main(String[] args) {
        System.out.print(extraEnd("Hello"));
    }

    /**
     * Given a string, return a new string made of 3 copies of the last 2 chars
     * of the original string. The string length will be at least 2.
     * extraEnd("Hello") → "lololo"
     * extraEnd("ab") → "ababab"
     * extraEnd("Hi") → "HiHiHi
     * @param str
     * @return
     */
    public static String extraEnd(String str) {
        String result = str.substring(str.length()-2);
        return result + result + result;
    }
}
