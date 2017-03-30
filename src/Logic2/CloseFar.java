package Logic2;

/**
 * Created by Wags on 3/29/17.
 */
public class CloseFar {

    public static void main(String[] args) {
        System.out.print(closeFar(0, -1, 10


        ));
    }

    /**
     * Given three ints, a b c, return true if one of b
     * or c is "close" (differing from a by at most 1),
     * while the other is "far", differing from both other
     * values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.
     * <p/>
     * closeFar(1, 2, 10) → true
     * closeFar(1, 2, 3) → false
     * closeFar(4, 1, 3) → true
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static boolean closeFar(int a, int b, int c) {
        boolean bC = Math.abs(a - b) < 2;
        boolean bF = Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2;
        boolean cC = Math.abs(a - c) < 2;
        boolean cF = Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2;

        if ((bC && cF) || (bF && cC)) {
            return true;
        } else {
            return false;
        }

    }
}
