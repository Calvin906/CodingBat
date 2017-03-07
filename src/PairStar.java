/**
 * Created by Wags on 3/7/17.
 */
public class PairStar {
    public static void main(String[] args) {
        String str = "abbba";
        System.out.println(pairStar(str));
    }

    /**
     * Given a string, compute recursively a new string where identical chars that
     * are adjacent in the original string are separated from each other by a "*".
     * pairStar("hello") → "hel*lo"
     * pairStar("xxyy") → "x*xy*y"
     * pairStar("aaaa") → "a*a*a*a"
     * @param str
     * @return
     */
    public static String pairStar(String str) {
        if (str.length() <= 1 ) {
            return str;
        } else if (str.charAt(0) == str.charAt(1)) {
            return str = str.charAt(0) + "*" + pairStar(str.substring(1));
        } else {
            return str = str.charAt(0) + pairStar(str.substring(1));
        }

    }
}
