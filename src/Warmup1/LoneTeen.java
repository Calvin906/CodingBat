package Warmup1;

/**
 * Created by Wags on 3/11/17.
 */
public class LoneTeen {
    public static void main(String[] args) {
        System.out.print(loneTeen(13,13));
        System.out.print(loneTeen(21,19));
    }

    /**
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 2 int values, return true if one or the other is teen, but not both.
     * loneTeen(13, 99) → true
     * loneTeen(21, 19) → true
     * loneTeen(13, 13) → false
     * @param a
     * @param b
     * @return
     */
    public static boolean loneTeen(int a, int b) {
        if ((a <= 19 && a >= 13) && (b <= 19 && b >= 13)) {
            return false;
        } else if (a <= 19 && a >= 13) {
            return true;
        } else if (b <= 19 && b >= 13) {
            return true;
        } else {
            return false;
        }
    }
}
