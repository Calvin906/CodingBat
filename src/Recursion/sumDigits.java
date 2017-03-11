package Recursion;

/**
 * Created by Wags on 3/10/17.
 */
public class SumDigits {
    public static void main(String[] args) {
        int n = 49;
        System.out.println(sumDigits(n));
    }

    /**
     * Given a non-negative int n, return the sum of its digits recursively (no loops).
     * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/)
     * by 10 removes the rightmost digit (126 / 10 is 12).
     * sumDigits(126) → 9
     * sumDigits(49) → 13
     * sumDigits(12) → 3
     * @param n
     * @return
     */
    public static int sumDigits(int n) {
        if(n <= 0) {
            return 0;
        }
        return (n%10) + sumDigits(n /10) ;

    }

}
