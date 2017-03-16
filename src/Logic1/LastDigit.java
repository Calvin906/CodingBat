package Logic1;

/**
 * Created by Wags on 3/16/17.
 */
public class LastDigit {
    public static void main(String[] args) {
        System.out.print(lastDigit(23, 45, 3));
    }

    /**
     * Given three ints, a b c, return true if two or more of them have the same
     * rightmost digit. The ints are non-negative. Note: the % "mod"
     * operator computes the remainder, e.g. 17 % 10 is 7.
     * <p/>
     * lastDigit(23, 19, 13) → true
     * lastDigit(23, 19, 12) → false
     * lastDigit(23, 19, 3) → true
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static boolean lastDigit(int a, int b, int c) {
        boolean aSameB = (a % 10 == b % 10);
        boolean aSameC = (a % 10 == c % 10);
        boolean bSameC= (b % 10 == c % 10);

        if (aSameB || bSameC || aSameC){
            return true;
        } else {
            return false;
        }
    }
}
