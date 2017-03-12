package Warmup1;

/**
 * Created by Wags on 3/11/17.
 */
public class Max1020 {
    public static void main(String[] args) {
        System.out.print(max1020(11, 9));
    }

    /**
     * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
     * or return 0 if neither is in that range.
     * max1020(11, 19) → 19
     * max1020(19, 11) → 19
     * max1020(11, 9) → 11
     *
     * @param a
     * @param b
     * @return
     */
    public static int max1020(int a, int b) {
        if ((a <= 20 && a >= 10)) {
            if ((b <= 20 && b >= 10)) {
                return Math.max(a, b);
            }
            return a;
        } else if (!(a <= 20 && a >= 10)) {
            if ((b <= 20 && b >= 10)) {
                return b;
            }
        } else {
            return 0;
        }
        return 0;
    }
}
