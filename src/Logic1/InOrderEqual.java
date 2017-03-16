package Logic1;

/**
 * Created by Wags on 3/16/17.
 */
public class InOrderEqual {
    public static void main(String[] args) {
        System.out.print(inOrderEqual(5, 5, 7, true));
    }

    /**
     * Given three ints, a b c, return true if they are in strict increasing order,
     * such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However,
     * with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.
     * <p/>
     * inOrderEqual(2, 5, 11, false) → true
     * inOrderEqual(5, 7, 6, false) → false
     * inOrderEqual(5, 5, 7, true) → true
     *
     * @param a
     * @param b
     * @param c
     * @param equalOk
     * @return
     */
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        boolean aAndB = a < b;
        boolean bAndC = b < c;

        if (aAndB && bAndC){
            return true;
        } else if (a <= b && b <= c && equalOk){
            return true;
        } else {
            return false;
        }
    }
}
