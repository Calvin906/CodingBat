package Recursion;

/**
 * Created by Wags on 3/7/17.
 */
public class EndX {
    public static void main(String[] args) {
        String str = "xxre";
        System.out.println(endX(str));
    }

    /**
     * Given a string, compute recursively a new string where all the lowercase 'x'
     * chars have been moved to the end of the string.
     * endX("xxre") → "rexx"
     * endX("xxhixx") → "hixxxx"
     * endX("xhixhix") → "hihixxx"
     * @param str
     * @return
     */
    public static String endX(String str) {
        if (str.equals("")) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return str = endX(str.substring(1)) + str.charAt(0);
        } else {
            return str = str.charAt(0) + endX(str.substring(1));
        }


    }
}
