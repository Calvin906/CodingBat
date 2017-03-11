package Warmup1;

/**
 * Created by Wags on 3/11/17.
 */
public class DelDel {
    public static void main(String[] args) {
        System.out.print(delDel("adedbc"));
    }

    /**
     * Given a string, if the string "del" appears starting at index 1, return a
     * string where that "del" has been deleted. Otherwise, return the string unchanged.
     * delDel("adelbc") → "abc"
     * delDel("adelHello") → "aHello"
     * delDel("adedbc") → "adedbc"
     *
     * @param str
     * @return
     */
    public static String delDel(String str) {
        if (str.length() <= 3) {
            return str;
        } else {
            return str.substring(1,4).equals("del") ? str.charAt(0) + str.substring(4): str;
        }
    }
}
