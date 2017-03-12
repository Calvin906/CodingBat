package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class MiddleThree {
    public static void main(String[] args) {
        System.out.print(middleThree("sovling"));
    }

    /**
     * Given a string of odd length, return the string length 3
     * from its middle, so "Candy" yields "and". The string length will be at least 3.
     * middleThree("Candy") → "and"
     * middleThree("and") → "and"
     * middleThree("solving") → "lvi"
     *
     * @param str
     * @return
     */
    public static String middleThree(String str) {
        if (str.length() == 3) {
            return str;
        } else {
            return str.substring((str.length() / 2 - 1), (str.length() / 2) + 2);
        }

    }
}
