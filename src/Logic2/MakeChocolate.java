package Logic2;

/**
 * Created by Wags on 3/31/17.
 */
public class MakeChocolate {
    public static void main(String[] args) {
        System.out.print(makeChocolate(4, 1, 9));
    }

    /**
     * We want make a package of goal kilos of chocolate.
     * We have small bars (1 kilo each) and big bars (5 kilos each).
     * Return the number of small bars to use, assuming we always use
     * big bars before small bars. Return -1 if it can't be done.
     * <p/>
     * makeChocolate(4, 1, 9) → 4
     * makeChocolate(4, 1, 10) → -1
     * makeChocolate(4, 1, 7) → 2
     *
     * @param small
     * @param big
     * @param goal
     * @return
     */
    public static int makeChocolate(int small, int big, int goal) {
        int mB = goal /5;
        if (big > mB){
            return (goal <= 5 * mB + small) ? (goal - 5 * mB) : -1;
        }
        return (goal <= 5 * big + small) ? (goal - 5 * big): -1;
    }
}
