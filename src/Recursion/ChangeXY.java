package Recursion;

/**
 * Created by Wags on 3/6/17.
 */
public class ChangeXY {
    public static void main(String[] args) {
        String str = "xxhix";
        System.out.println(changeXY(str));
    }

    /**
     * Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
     changeXY("codex") → "codey"
     changeXY("xxhixx") → "yyhiyy"
     changeXY("xhixhix") → "yhiyhiy"
     * @param str
     * @return
     */
    public static String changeXY(String str) {
        if (str.length() == 0) {
            return "";
        } else if (str.charAt(0) == 'x') {
            return str = "y" + changeXY(str.substring(1, str.length()));
        }
        return str = str.charAt(0) + changeXY(str.substring(1, str.length()));
    }
}
