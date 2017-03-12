package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class TheEnd {
    public static void main(String[] args) {
        System.out.print(theEnd("Oh", true));
    }

    /**
     * Given a string, return a string length 1 from its front,
     * unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
     * theEnd("Hello", true) → "H"
     * theEnd("Hello", false) → "o"
     * theEnd("oh", true) → "o"
     * @param str
     * @param front
     * @return
     */
    public static String theEnd(String str, boolean front) {
        if (front == true){
            return String.valueOf(str.charAt(0));
        } else {
            return String.valueOf(str.charAt(str.length()-1));
        }
    }
}
