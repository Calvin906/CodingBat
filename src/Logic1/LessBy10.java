package Logic1;

/**
 * Created by Wags on 3/16/17.
 */
public class LessBy10 {
    public static void main(String[] args) {
        System.out.print(lessBy10(1, 7, 13));
    }

    /**
     * Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
     * <p/>
     * lessBy10(1, 7, 11) → true
     * lessBy10(1, 7, 10) → false
     * lessBy10(11, 1, 7) → true
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static boolean lessBy10(int a, int b, int c) {
        boolean aTenB = Math.abs(a - b) >= 10;
        boolean bTenC = Math.abs(b - c) >= 10;
        boolean aTenC = Math.abs(a - c) >= 10;

        return aTenB || aTenC || bTenC ? true : false;

    }
}
