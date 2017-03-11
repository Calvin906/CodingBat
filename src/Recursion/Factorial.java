package Recursion;

/**
 * Created by Wags on 3/10/17.
 */
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));

    }

    /**
     * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
     * Compute the result recursively (without loops).
     * factorial(1) → 1
     * factorial(2) → 2
     * factorial(3) → 6
     * @param n
     * @return
     */
    public static int factorial(int n) {
        if(n == 1) {
            return 1;
        }else  {
            return n * factorial(n-1);
        }
    }
}
