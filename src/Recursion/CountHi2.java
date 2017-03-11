package Recursion;

/**
 * Created by Wags on 3/7/17.
 */
public class CountHi2 {
    public static void main(String[] args){
        String str = "ahibhi";
        String str1 = "hixhi";
        String str2 = "xxhi";
       // System.out.println(countHi2(str));
        //System.out.println(countHi2(str1));
        System.out.println(countHi2(str2));
    }

    /**
     * Given a string, compute recursively the number of times lowercase "hi" appears in the string,
     * however do not count "hi" that have an 'x' immediately before them.
     * countHi2("ahixhi") → 1
     * countHi2("ahibhi") → 2
     * countHi2("xhixhi") → 0
     * @param str
     * @return
     */
    public static int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        } else if (str.charAt(0) == 'x') {
            return str.charAt(1) == 'h' ? countHi2(str.substring(2)): countHi2(str.substring(1));
        } else if (str.substring(0,2).equals("hi")){
            return 1 + countHi2(str.substring(1));
        } else {
            return countHi2(str.substring(1));
        }
    }
}
