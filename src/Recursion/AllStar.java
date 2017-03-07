package Recursion;

/**
 * Created by Wags on 3/7/17.
 */
public class AllStar {
    public static void main(String[] args) {
        String str = "wheee";
        System.out.println(allStar(str));
    }

    /**
     * Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
     * allStar("hello") → "h*e*l*l*o"
     * allStar("abc") → "a*b*c"
     * allStar("ab") → "a*b"
     * @param str
     * @return
     */
    public static String allStar(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return str = str.charAt(0) + "*" + allStar(str.substring(1));
        }
    }
}
