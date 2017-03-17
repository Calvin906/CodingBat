package Logic1;

/**
 * Created by Wags on 3/16/17.
 */
public class RedTicket {
    public static void main(String[] args) {
        System.out.print(redTicket(2, 3, 4));
    }

    /**
     * You have a red lottery ticket showing ints a, b, and c,
     * each of which is 0, 1, or 2. If they are all the value 2,
     * the result is 10. Otherwise if they are all the same, the result is 5.
     * Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.
     * <p/>
     * redTicket(2, 2, 2) → 10
     * redTicket(2, 2, 1) → 0
     * redTicket(0, 0, 0) → 5
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int redTicket(int a, int b, int c) {
        boolean isTwo = a == 2 && b == 2 & c == 2;
        boolean isSame = a == b && a == c;
        boolean isDiff = a != b & a != c;

        if (isTwo) {
            return 10;
        } else if (isSame) {
            return 5;
        } else if (isDiff) {
            return 1;
        } else {
            return 0;
        }
    }
}
