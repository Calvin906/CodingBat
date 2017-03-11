package Recursion;

/**
 * Created by Wags on 3/10/17.
 */
public class StrDist {
    public static void main(String[] args) {
        String str = "hiHellohihihi";
        System.out.println(strDist(str, "ll"));
    }

    /**
     * Given a string and a non-empty substring sub, compute recursively the largest
     * substring which starts and ends with sub and return its length.
     * strDist("catcowcat", "cat") → 9
     * strDist("catcowcat", "cow") → 3
     * strDist("cccatcowcatxx", "cat") → 9
     *
     * @param str
     * @param sub
     * @return
     */
    public static int strDist(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        } else if (str.substring(0,sub.length()).equals(sub)) {
            if (str.substring(str.length()-sub.length()).equals(sub)) {
                return str.length();
            } else {
                return strDist(str.substring(0,str.length()-1), sub);
            }
        } else {
            return strDist(str.substring(1),sub);
        }
    }
}
