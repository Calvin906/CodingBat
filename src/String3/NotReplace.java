package String3;

/**
 * Created by Wags on 4/16/17.
 */
public class NotReplace {
    public static void main(String[] args) {
        System.out.println("Expected: is not test, Received: " + notReplace("is test"));
    }

    /**
     * Given a string, return a string where every appearance of
     * the lowercase word "is" has been replaced with "is not".
     * The word "is" should not be immediately preceeded or followed by a
     * letter -- so for example the "is" in "this" does not count.
     * (Note: Character.isLetter(char) tests if a char is a letter.)
     * <p/>
     * notReplace("is test") → "is not test"
     * notReplace("is-is") → "is not-is not"
     * notReplace("This is right") → "This is not right"
     *
     * @param str
     * @return
     */
    public static String notReplace(String str) {
        String s = "";
        str = " " + str + " ";
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i,i+2).equals("is") && !Character.isLetter(str.charAt(i+2)) && !Character.isLetter(str.charAt(i-1))){
                s += str.substring(i,i+2) + " not";
                i++;
            } else {
                s += str.charAt(i);
            }
        }

        return s.trim();

    }
}
