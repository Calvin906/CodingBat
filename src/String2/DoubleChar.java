package String2;

/**
 * Created by Wags on 4/14/17.
 */
public class DoubleChar {
    public static void main(String[] args) {

        System.out.print(doubleChar("the"));

    }

    /**
     * Given a string, return a string where for every char in the original, there are two chars.
     * <p/>
     * doubleChar("The") → "TThhee"
     * doubleChar("AAbb") → "AAAAbbbb"
     * doubleChar("Hi-There") → "HHii--TThheerree"
     *
     * @param str
     * @return
     */
    public static String doubleChar(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++){
            s += String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i));
        }

        return s;
    }
}
