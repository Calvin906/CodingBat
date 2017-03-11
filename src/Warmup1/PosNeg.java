package Warmup1;

/**
 * Created by Wags on 3/11/17.
 */
public class PosNeg {
    public static void main(String[] args) {
        System.out.println(posNeg(-4,-5,true));
    }

    /**
     * Given 2 int values, return true if one is negative and one is positive.
     * Except if the parameter "negative" is true, then return true only if both are negative.
     * posNeg(1, -1, false) → true
     * posNeg(-1, 1, false) → true
     * posNeg(-4, -5, true) → true
     * @param a
     * @param b
     * @param negative
     * @return
     */
    public static boolean posNeg(int a, int b, boolean negative) {
        if (((a <= 0 && b >= 0) || (a >= 0 && b <= 0)) && negative == false) {
            return true;
        } else if ((a <= 0 && b <= 0) && negative == true) {
            return true;
        } else {
            return false;
        }
    }
}
