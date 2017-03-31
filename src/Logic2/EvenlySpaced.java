package Logic2;

/**
 * Created by Wags on 3/31/17.
 */
public class EvenlySpaced {

    public static void main(String[] args) {
        System.out.print(evenlySpaced(6, 2, 4));
    }

    /**
     * Given three ints, a b c, one of them is small,
     * one is medium and one is large. Return true if the
     * three values are evenly spaced, so the difference
     * between small and medium is the same as the difference between medium and large.
     * <p/>
     * evenlySpaced(2, 4, 6) → true
     * evenlySpaced(4, 6, 2) → true
     * evenlySpaced(4, 6, 3) → false
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static boolean evenlySpaced(int a, int b, int c) {
        if (a == b && b == c) {
            return true;
        } else if (a == b || a == c || b == c) {
            return false;
        }
        return Math.abs(a - b) == Math.abs(b - c) || Math.abs(a - c) == Math.abs(a - b) || Math.abs(c - a) == Math.abs(b - c);

    }

}
