package Logic1;

/**
 * Created by Wags on 3/16/17.
 */
public class TwoAsOne {
    public static void main(String[] args) {
        System.out.print(twoAsOne(3, 4, 5));
    }

    /**
     * Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
     * <p/>
     * twoAsOne(1, 2, 3) → true
     * twoAsOne(3, 1, 2) → true
     * twoAsOne(3, 2, 2) → false
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static boolean twoAsOne(int a, int b, int c) {
        if (a + b == c || b + c == a || a + c == b){
            return true;
        } else {
            return false;
        }
    }

}
