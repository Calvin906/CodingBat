package Logic2;

/**
 * Created by Wags on 3/27/17.
 */
public class LoneSum {
    public static void main(String[] args) {
        System.out.print(loneSum(3, 3, 3));
    }

    /**
     * Given 3 int values, a b c, return their sum.
     * However, if one of the values is the same as another of the values,
     * it does not count towards the sum.
     * <p/>
     * loneSum(1, 2, 3) → 6
     * loneSum(3, 2, 3) → 2
     * loneSum(3, 3, 3) → 0
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int loneSum(int a, int b, int c) {
        boolean aSb = a == b;
        boolean bSc = b == c;
        boolean aSc = a == c;

        if (aSb && bSc){
            return 0;
        }else if (aSb){
            return c;
        } else if (aSc){
            return b;
        } else if (bSc){
            return a;
        } else {
            return a + b + c;
        }


    }
}
