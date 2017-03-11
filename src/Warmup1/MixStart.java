package Warmup1;

/**
 * Created by Wags on 3/11/17.
 */
public class MixStart {
    public static void main(String[] args) {
        System.out.print(mixStart("piz snacks"));
    }

    /**
     * Return true if the given string begins with "mix", except
     * the 'm' can be anything, so "pix", "9ix" .. all count.
     * mixStart("mix snacks") → true
     * mixStart("pix snacks") → true
     * mixStart("piz snacks") → false
     * @param str
     * @return
     */
    public static boolean mixStart(String str){
        if (str.length() < 3) {
            return false;
        } else {
            return str.substring(1,3).equals("ix") ?  true: false;
        }
    }
}
