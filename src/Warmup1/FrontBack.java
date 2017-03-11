package Warmup1;

/**
 * Created by Wags on 3/11/17.
 */
public class FrontBack {
    public static void main(String[] args) {
        System.out.println(frontBack("code"));
    }

    /**
     * Given a string, return a new string where the first and last chars have been exchanged.
     * frontBack("code") → "eodc"
     * frontBack("a") → "a"
     * frontBack("ab") → "ba"
     * @param str
     * @return
     */
    public static String frontBack(String str) {
        if (str.length() <= 1 ) {
            return str;
        }
        return str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0);
    }
}
