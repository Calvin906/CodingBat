package Recursion;

/**
 * Created by Wags on 3/7/17.
 */
public class StringClean {
    public static void main(String[] args){
        String str = "yyaaaahhhh";
        System.out.println(stringClean(str));
    }

    /**
     * Given a string, return recursively a "cleaned" string where adjacent chars that are
     * the same have been reduced to a single char. So "yyzzza" yields "yza".
     * stringClean("yyzzza") → "yza"
     * stringClean("abbbcdd") → "abcd"
     * stringClean("Hello") → "Helo"
     * @param str
     * @return
     */
    public static String stringClean(String str) {
        if (str.length() <= 1) {
            return str;
        } else if (str.charAt(0) == str.charAt(1)) {
            return str = stringClean(str.substring(1));
        } else {
            return str = str.charAt(0) + stringClean(str.substring(1));
        }
    }
}
