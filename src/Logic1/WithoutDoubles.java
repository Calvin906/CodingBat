package Logic1;

/**
 * Created by Wags on 3/16/17.
 */
public class WithoutDoubles {

    public static void main(String[] args) {
        System.out.print(withoutDoubles(3, 5, true));
    }

    /**
     * Return the sum of two 6-sided dice rolls, each in the range 1..6.
     * However, if noDoubles is true, if the two dice show the same value,
     * increment one die to the next value, wrapping around to 1 if its value was 6.
     * <p/>
     * withoutDoubles(2, 3, true) → 5
     * withoutDoubles(3, 3, true) → 7
     * withoutDoubles(3, 3, false) → 6
     *
     * @param die1
     * @param die2
     * @param noDoubles
     * @return
     */
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        boolean sameDie = die1 == die2;
        boolean aIs6 = die1 == 6;
        boolean bIs6 = die2 == 6;

        if (sameDie && !noDoubles) {
            return die1 + die2;
        } else if (sameDie & noDoubles) {
            if (aIs6 || bIs6) {
                return die1 + 1;
            }
            return die1 + die2 + 1;
        } else {
            return die1 + die2;
        }
    }
}