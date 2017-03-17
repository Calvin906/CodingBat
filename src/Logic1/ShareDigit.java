package Logic1;

/**
 * Created by Wags on 3/16/17.
 */
public class ShareDigit {
    public static void main(String[] args) {
        System.out.print(shareDigit(23, 44));
    }

    /**
     * Given two ints, each in the range 10..99,
     * return true if there is a digit that appears in
     * both numbers, such as the 2 in 12 and 23.
     * (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
     * <p/>
     * shareDigit(12, 23) → true
     * shareDigit(12, 43) → false
     * shareDigit(12, 44) → false
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean shareDigit(int a, int b) {
        int aRight = a % 10;
        int aLeft = a / 10;
        int bRight = b % 10;
        int bLeft = b / 10;

        if (aRight == bRight || aRight == bLeft || aLeft == bRight || aLeft == bLeft){
            return true;
        } else {
            return false;
        }
    }
}
