package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class WithoutX {
    public static void main(String[] args) {
        System.out.print(withoutX("Hxix"));
    }

    /**
     * Given a string, if the first or last chars are 'x',
     * return the string without those 'x' chars, and otherwise return the string unchanged.
     * withoutX("xHix") → "Hi"
     * withoutX("xHi") → "Hi"
     * withoutX("Hxix") → "Hxi"
     *
     * @param str
     * @return
     */
    public static String withoutX(String str) {
        if (str.length() == 1) {
            if (str.startsWith("x")) {
                return "";
            }
        }
        if (str.startsWith("x")) {
            if (str.endsWith("x")) {
                return str.substring(1, str.length() - 1);
            } else {
                return str.substring(1);
            }
        } else if (str.endsWith("x")) {
            return str.substring(0, str.length() - 1);
        } else {
            return str;
        }
    }
}
