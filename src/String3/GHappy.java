package String3;

/**
 * Created by Wags on 4/16/17.
 */
public class GHappy {
    public static void main(String[] args) {
        System.out.println("Expected: true, Received: " + gHappy("xxggxx"));
        System.out.println("Expected: true, Received: " + gHappy2("xxggxx"));
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there
     * is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.
     * <p/>
     * gHappy("xxggxx") → true
     * gHappy("xxgxx") → false
     * gHappy("xxggyygxx") → false
     *
     * @param str
     * @return
     */
    public static boolean gHappy(String str) {
        boolean isHappy = true;
        str = str + " ";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) == 'g' && str.length() - i > 0 && str.charAt(i + 1) != 'g') {
                isHappy = false;
            }
            if (i > 0 && str.length() - i > 0 && str.charAt(i) == 'g' && (str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g')) {
                isHappy = false;
            }
            if (i > 0 && str.length() - 1 > 0 && str.charAt(i) == 'g' && (str.charAt(i - 1) == 'g' || str.charAt(i + 1) == 'g')) {
                isHappy = true;
            }

        }

        return isHappy;

    }

    /**
     * Another approach
     * Easier to understand
     * @param str
     * @return
     */
    public static boolean gHappy2(String str) {
        str = " " + str + " "; //Handles corner cases
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'g' && str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') {
                return false;
            }
        }
        return true;
    }


}
