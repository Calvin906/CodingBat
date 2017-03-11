package Warmup1;

/**
 * Created by Wags on 3/11/17.
 */
public class IntMax {
    public static void main(String[] args){
        System.out.print(intMax(3,44,1));
    }

    /**
     * Given three int values, a b c, return the largest.
     * intMax(1, 2, 3) → 3
     * intMax(1, 3, 2) → 3
     * intMax(3, 2, 1) → 3
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int intMax(int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
    }
}
