/**
 * Created by Wags on 3/6/17.
 */
public class NoX {
    public static void main(String[] args) {
        String str = "xzcefsxxxeefdsfx";
        System.out.println(noX(str));
    }

    /**
     * Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
     countHi("xxhixx") → 1
     countHi("xhixhix") → 2
     countHi("hi") → 1
     * @param str
     * @return
     */
    public static String noX(String str) {
        if (str.equals("")) {
            return str;
        } else if (str.charAt(0) == 'x') {
            return str = noX(str.substring(1,str.length()));
        } else {
            return str = str.charAt(0) + noX(str.substring(1,str.length()));
        }
    }
}
