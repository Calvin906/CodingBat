package Logic1;

/**
 * Created by Wags on 3/15/17.
 */
public class SpecialEleven {
    public static void main(String[] args) {
        System.out.print(specialEleven(24));
    }

    /**
     * We'll say a number is special if it is a multiple of 11 or
     * if it is one more than a multiple of 11. Return true if the given non-negative number
     * is special. Use the % "mod" operator -- see Introduction to Mod
     * specialEleven(22) → true
     * specialEleven(23) → true
     * specialEleven(24) → false
     *
     * @param n
     * @return
     */
    public static boolean specialEleven(int n) {
        if (n % 11 == 0 || n % 11 == 1) {
            return true;
        } else {
            return false;
        }

    }
}
