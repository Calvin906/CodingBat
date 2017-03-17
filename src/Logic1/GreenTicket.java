package Logic1;

/**
 * Created by Wags on 3/16/17.
 */
public class GreenTicket {
    public static void main(String[] args) {
        System.out.print(greenTicket(2, 3, 5));
    }

    /**
     * You have a green lottery ticket, with ints a, b, and c on it.
     * If the numbers are all different from each other, the result is 0.
     * If all of the numbers are the same, the result is 20.
     * If two of the numbers are the same, the result is 10.
     * <p/>
     * greenTicket(1, 2, 3) → 0
     * greenTicket(2, 2, 2) → 20
     * greenTicket(1, 1, 2) → 10
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int greenTicket(int a, int b, int c) {
        boolean isDiff = a != b && a != c && b != c;
        boolean isAllSame = a == b && a == c;
        boolean isTwoSame = (a == b) || (a == c) || (b == c);

        if (isAllSame){
            return 20;
        } else if (isTwoSame){
            return 10;
        } else {
            return 0;
        }
    }

}
