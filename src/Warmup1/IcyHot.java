package Warmup1;

/**
 * Created by Wags on 3/11/17.
 */
public class IcyHot {
    public static void main(String[] args) {
        System.out.println(icyHot(2,120));

    }

    /**
     * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     * icyHot(120, -1) → true
     * icyHot(-1, 120) → true
     * icyHot(2, 120) → false
     * @param temp1
     * @param temp2
     * @return
     */
    public static boolean icyHot(int temp1, int temp2) {
       return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0) ? true: false;
    }
}
