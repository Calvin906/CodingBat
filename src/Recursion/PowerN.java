package Recursion;

/**
 * Created by Wags on 3/10/17.
 */
public class PowerN {
    public static void main(String[] args) {
        int base = 3;
        int n = 3;
        System.out.println(powerN(base,n));

    }

    /**
     * Given base and n that are both 1 or more, compute recursively (no loops)
     * the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
     * powerN(3, 1) → 3
     * powerN(3, 2) → 9
     * powerN(3, 3) → 27
     * @param base
     * @param n
     * @return
     */
    public static int powerN(int base, int n) {
        if(n <=  1) {
            return base;
        } return powerN(base, n - 1) * base;
    }
}
