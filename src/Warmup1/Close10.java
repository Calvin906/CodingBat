package Warmup1;

/**
 * Created by Wags on 3/11/17.
 */
public class Close10 {
    public static void main(String[] args) {
        System.out.print(close10(13, 7));
    }

    /**
     * Given 2 int values, return whichever value is nearest to the value 10, or
     * return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
     * close10(8, 13) → 8
     * close10(13, 8) → 8
     * close10(13, 7) → 0
     *
     * @param a
     * @param b
     * @return
     */
    public static int close10(int a, int b) {
        if (Math.abs(10 - a) == Math.abs(10 - b)) {
            return 0;
        } else {
            return Math.abs(10 - a) > Math.abs(10 - b) ? b : a;
        }
    }
}
