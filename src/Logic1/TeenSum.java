package Logic1;

/**
 * Created by Wags on 3/16/17.
 */
public class TeenSum {
    public static void main(String[] args) {
        System.out.print(teenSum(12, 4));
    }

    /**
     * Given 2 ints, a and b, return their sum. However,
     * "teen" values in the range 13..19 inclusive, are extra lucky.
     * So if either value is a teen, just return 19.
     * teenSum(3, 4) → 7
     * teenSum(10, 13) → 19
     * teenSum(13, 2) → 19
     *
     * @param a
     * @param b
     * @return
     */
    public static int teenSum(int a, int b) {
        if ((a >= 13 && a <=19) || (b >= 13 && b <=19)){
            return 19;
        } else {
            return a+b;
        }
    }
}
