package Warmup2;

/**
 * Created by Wags on 3/11/17.
 */
public class StringSplosion {
    public static void main(String[] args) {
        System.out.print(stringSplosion("aba"));
    }

    /**
     * Given a non-empty string like "Code" return a string like "CCoCodCode".
     * stringSplosion("Code") → "CCoCodCode"
     * stringSplosion("abc") → "aababc"
     * stringSplosion("ab") → "aab"
     * @param str
     * @return
     */
    public static String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i <= str.length(); i++) {
            result += str.substring(0,i);
        }
        return result;
    }
}
