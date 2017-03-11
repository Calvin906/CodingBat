package Warmup1;

/**
 * Created by Wags on 3/11/17.
 */
public class NotString {
    public static void main(String[] args) {
        System.out.println(notString("not bad"));
        System.out.println(notString("bad"));
    }

    /**
     * Given a string, return a new string where "not " has been added to the
     * front. However, if the string already begins with "not", return
     * the string unchanged. Note: use .equals() to compare 2 strings.
     * notString("candy") → "not candy"
     * notString("x") → "not x"
     * notString("not bad") → "not bad"
     * @param str
     * @return
     */
    public static String notString(String str) {
        if (str.length() <= 2) {
            return "not " + str;
        } else if (str.substring(0,3).equals("not")){
            return str;
        } else {
            return "not " + str;
        }
    }
}
