package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class Right2 {
    public static void main(String[] args) {
        System.out.print(right2("Java"));
    }

    /**
     * Given a string, return a "rotated right 2" version where the last 2
     * chars are moved to the start. The string length will be at least 2.
     * right2("Hello") → "loHel"
     * right2("java") → "vaja"
     * right2("Hi") → "Hi"
     * @param str
     * @return
     */
    public static String right2(String str){
        String result = str.substring(str.length() - 2).concat(str.substring(0, str.length() - 2));
        return result;
    }
}
