package Warmup1;

/**
 * Created by Wags on 3/11/17.
 */
public class Diff21 {
    public static void main(String[] args) {
        System.out.println(diff21(11));
    }

    /**
     * Given an int n, return the absolute difference between n and 21,
     * except return double the absolute difference if n is over 21.
     * diff21(19) → 2
     * diff21(10) → 11
     * diff21(21) → 0
     * @param n
     * @return
     */
    public static int diff21(int n){
        return n > 21 ? Math.abs(21 - n) * 2: 21 -n;
    }
}
