package Logic2;

/**
 * Created by Wags on 3/27/17.
 */
public class MakeBricks {

    public static void main(String[] args) {

        System.out.print(makeBricks(3, 1, 8));
        System.out.print(makeBricks2(3, 1, 8));

    }

    /**
     * We want to make a row of bricks that is goal inches long.
     * We have a number of small bricks (1 inch each)
     * and big bricks (5 inches each).
     * Return true if it is possible to make the
     * goal by choosing from the given bricks.
     * This is a little harder than it looks and can be done
     * without any loops.
     * <p/>
     * makeBricks(3, 1, 8) → true
     * makeBricks(3, 1, 9) → false
     * makeBricks(3, 2, 10) → true
     *
     * @param small
     * @param big
     * @param goal
     * @return
     */
    public static boolean makeBricks(int small, int big, int goal) {
        int count = 0;
        for (int i = 1; i <= big; i++) {
            if (i * 5 <= goal) {
                count++;
            }
        }

        int total = 5 * count;
        total += small;
        if (total >= goal) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Without a loop
     *
     * @param small
     * @param big
     * @param goal
     * @return
     */
    public static boolean makeBricks2(int small, int big, int goal) {
        if (goal > big * 5 + small) {
            return false;
        } else if (goal % 5 > small) {
            return false;
        }
        return true;
    }
}
