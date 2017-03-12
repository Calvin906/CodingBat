package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class WithouEnd2 {
    public static void main(String[] args) {
        System.out.print(withouEnd2("hehehl"));
    }

    /**
     * Given a string, return a version without both the first and last char
     * of the string. The string may be any length, including 0.
     * withouEnd2("Hello") → "ell"
     * withouEnd2("abc") → "b"
     * withouEnd2("ab") → ""
     * @param str
     * @return
     */
    public static String withouEnd2(String str){
        if (str.length() <= 2) {
            return "";
        } else  {
            return str.substring(1,str.length()-1);
        }
    }
}
