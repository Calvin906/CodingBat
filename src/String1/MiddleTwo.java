package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class MiddleTwo {
    public static void main(String[] args) {
        System.out.print(middleTwo("Practice"));
    }

    /**
     * Given a string of even length, return a string made of
     * the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
     * middleTwo("string") → "ri"
     * middleTwo("code") → "od"
     * middleTwo("Practice") → "ct"
     * @param str
     * @return
     */
    public static String middleTwo(String str) {
        return str.substring((str.length()/2)-1, (str.length()/2)+1);
    }
}
