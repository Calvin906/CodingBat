package String2;

/**
 * Created by Wags on 4/14/17.
 */
public class SameStarChar {
    public static void main(String[] args) {
        System.out.println("Expected: true, Received: " + sameStarChar("xy*yzz"));
    }

    /**
     * Returns true if for every '*' (star) in the string,
     * if there are chars both immediately before and after the star, they are the same.
     * <p/>
     * sameStarChar("xy*yzz") → true
     * sameStarChar("xy*zzz") → false
     * sameStarChar("*xa*az") → true
     *
     * @param str
     * @return
     */
    public static boolean sameStarChar(String str) {

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}
