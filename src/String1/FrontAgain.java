package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class FrontAgain {
    public static void main(String[] args) {
        System.out.print(frontAgain("edit"));
    }

    /**
     * Given a string, return true if the first 2 chars in the string
     * also appear at the end of the string, such as with "edited".
     * frontAgain("edited") → true
     * frontAgain("edit") → false
     * frontAgain("ed") → true
     *
     * @param str
     * @return
     */
    public static boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }
        if (str.endsWith(str.substring(0, 2))) {
            return true;
        } else {
            return false;
        }

    }
}
