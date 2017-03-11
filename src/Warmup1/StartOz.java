package Warmup1;

/**
 * Created by Wags on 3/11/17.
 */
public class StartOz {
    public static void main(String[] args) {
        System.out.print(startOz("bzoo"));
    }

    /**
     * Given a string, return a string made of the first 2 chars (if present),
     * however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
     * startOz("ozymandias") → "oz"
     * startOz("bzoo") → "z"
     * startOz("oxx") → "o"
     *
     * @param str
     * @return
     */
    public static String startOz(String str) {
        if (str.length() == 0) {
            return "";
        } else if (str.length() < 2) {
            if (str.charAt(0) == 'o') {
                return "o";
            }
        } else if (str.charAt(0) == 'o') {
            if (str.charAt(1) == 'z') {
                return "oz";
            }
            return "o";
        } else if (str.charAt(0) != 'o') {
            if (str.charAt(1) == 'z') {
                return "z";
            }
        }
        return "";
    }
}
