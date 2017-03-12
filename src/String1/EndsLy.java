package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class EndsLy {
    public static void main(String[] args) {
        System.out.print(endsLy("oddly"));
    }

    /**
     * Given a string, return true if it ends in "ly".
     * endsLy("oddly") → true
     * endsLy("y") → false
     * endsLy("oddy") → false
     *
     * @param str
     * @return
     */
    public static boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        }
        if (str.substring(str.length() - 2).equals("ly")) {
            return true;
        } else {
            return false;
        }
    }
}
