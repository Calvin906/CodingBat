package Warmup2;

/**
 * Created by Wags on 3/11/17.
 */
public class StringX {
    public static void main(String[] args) {
        System.out.print(stringX("xabxxxcdx"));
    }

    /**
     * Given a string, return a version where all the "x" have been removed.
     * Except an "x" at the very start or end should not be removed.
     * stringX("xxHxix") → "xHix"
     * stringX("abxxxcd") → "abcd"
     * stringX("xabxxxcdx") → "xabcdx"
     *
     * @param str
     * @return
     */
    public static String stringX(String str) {
        if (str.length() < 1) {
            return str;
        }
        String result = String.valueOf(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != 'x') {
                result += str.charAt(i);
            }
        }
        if (str.charAt(str.length())== 'x' && str.length() > 1) {
            result += 'x';
        }
        return result;
    }
}
