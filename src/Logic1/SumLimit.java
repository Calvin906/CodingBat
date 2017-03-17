package Logic1;

/**
 * Created by Wags on 3/16/17.
 */
public class SumLimit {
    public static void main(String[] args) {
        System.out.print(sumLimit(3, 5));
    }

    /**
     * Given 2 non-negative ints, a and b, return their sum,
     * so long as the sum has the same number of digits as a.
     * If the sum has more digits than a, just return a without b.
     * (Note: one way to compute the number of digits of a non-negative int n
     * is to convert it to a string with String.valueOf(n) and then check the length of the string.)
     * <p/>
     * sumLimit(2, 3) → 5
     * sumLimit(8, 3) → 8
     * sumLimit(8, 1) → 9
     *
     * @param a
     * @param b
     * @return
     */
    public static int sumLimit(int a, int b) {
        int sum = String.valueOf(a+b).length();
        int aLength = String.valueOf(a).length();

        if (aLength < sum){
            return a;
        } else {
            return a + b;
        }

    }
}
