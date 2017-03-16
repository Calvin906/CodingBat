package Logic1;

/**
 * Created by Wags on 3/16/17.
 */
public class InOrder {
    public static void main(String[] args) {
        System.out.print(inOrder(1, 4, 5, false));
    }

    /**
     * Given three ints, a b c, return true if b is greater than a,
     * and c is greater than b. However, with the exception that if "bOk" is true,
     * b does not need to be greater than a.
     * <p/>
     * inOrder(1, 2, 4, false) → true
     * inOrder(1, 2, 1, false) → false
     * inOrder(1, 1, 2, true) → true
     *
     * @param a
     * @param b
     * @param c
     * @param bOk
     * @return
     */
    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        boolean aAndB = a < b;
        boolean bAndC = b < c;

        if (aAndB && bAndC) {
            return true;
        } else if (!aAndB && bAndC && bOk) {
            return true;
        } else {
            return false;
        }
    }
}
