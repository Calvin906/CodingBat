package Warmup1;

/**
 * Created by Wags on 3/11/17.
 */
public class LastDigit {
    public static void main(String[] args) {
        System.out.print(lastDigit(6, 17));
    }

    /**
     * Given two non-negative int values, return true if they have the same last digit,
     * such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
     * lastDigit(7, 17) → true
     * lastDigit(6, 17) → false
     * lastDigit(3, 113) → true
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }
}
