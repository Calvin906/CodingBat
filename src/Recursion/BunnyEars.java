package Recursion;

/**
 * Created by Wags on 3/10/17.
 */
public class BunnyEars {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(bunnyEars(n));
    }

    /**
     * We have a number of bunnies and each bunny has two big floppy ears.
     * We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
     * bunnyEars(0) → 0
     * bunnyEars(1) → 2
     * bunnyEars(2) → 4
     * @param bunnies
     * @return
     */
    public static int bunnyEars(int bunnies) {
        if(bunnies == 0) {
            return 0;
        } else {
            return bunnyEars(bunnies - 1) + 2;
        }
    }
}
