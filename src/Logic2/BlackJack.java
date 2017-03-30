package Logic2;

/**
 * Created by Wags on 3/29/17.
 */
public class BlackJack {
    public static void main(String[] args) {
        System.out.print(blackJack(34, 33));
    }

    /**
     * Given 2 int values greater than 0,
     * return whichever value is nearest
     * to 21 without going over. Return 0 if they both go over.
     * <p/>
     * blackjack(19, 21) → 21
     * blackjack(21, 19) → 21
     * blackjack(19, 22) → 19
     *
     * @param a
     * @param b
     * @return
     */
    public static int blackJack(int a, int b) {
        boolean aIsOver = 21 - a < 0;
        boolean bIsOver = 21 - b < 0;

        if (!aIsOver && !bIsOver) {
            return Math.max(a, b);
        } else if (aIsOver && bIsOver) {
            return 0;
        } else if (aIsOver) {
            return b;
        }
        return a;
    }
}
