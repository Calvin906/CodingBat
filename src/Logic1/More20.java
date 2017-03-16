package Logic1;

/**
 * Created by Wags on 3/15/17.
 */
public class More20 {
    public static void main(String[] args) {
        System.out.print(more20(22));
    }

    /**
     * Return true if the given non-negative number is 1 or 2 more
     * than a multiple of 20. See also: Introduction to Mod
     * more20(20) → false
     * more20(21) → true
     * more20(22) → true
     *
     * @param n
     * @return
     */
    public static boolean more20(int n) {
        if (n % 20 == 1 || n % 20 == 2){
            return true;
        } else {
            return false;
        }

    }
}
