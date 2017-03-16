package Logic1;

/**
 * Created by Wags on 3/15/17.
 */
public class Less20 {
    public static void main(String[] args) {
        System.out.print(less20(18));
    }

    /**
     * Return true if the given non-negative number is 1 or 2
     * less than a multiple of 20. So for example 38 and 39 return true,
     * but 40 returns false. See also: Introduction to Mod
     * less20(18) → true
     * less20(19) → true
     * less20(20) → false
     *
     * @param n
     * @return
     */
    public static boolean less20(int n) {
        if ((n + 1) % 20 == 0 || (n + 2) % 20 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
