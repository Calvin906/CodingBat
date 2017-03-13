package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class WithoutX2 {
    public static void main(String[] args) {
        System.out.print(withoutX2("Hxi"));
    }

    /**
     * Given a string, if one or both of the first 2 chars is 'x',
     * return the string without those 'x' chars, and otherwise return
     * the string unchanged. This is a little harder than it looks.
     * withoutX2("xHi") → "Hi"
     * withoutX2("Hxi") → "Hi"
     * withoutX2("Hi") → "Hi"
     *
     * @param str
     * @return
     */
    public static String withoutX2(String str) {
        if (str.length() < 2) {
            if (str.startsWith("x")) {
                return "";
            } else {
                return str;
            }
        } else if (str.substring(0, 1).equals("x")) {
            if (str.substring(1, 2).equals("x")) {
                return str.substring(2);
            } else {
                return str.substring(1);
            }
        } else if (str.substring(1, 2).equals("x")) {
            return str.substring(0, 1) + str.substring(2);
        } else {
            return str;
        }
    }
}
