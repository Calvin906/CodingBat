/**
 * Created by Wags on 3/6/17.
 */
public class CountMinChange {

    public static void main(String[] args) {

        int amount = 87;

        int change = countChange(amount);
        System.out.println(String.valueOf(change));
    }

    /**
     * Recursive function to return the amount of change.
     * @param n
     * @return
     */
    public static int countChange(int n) {
        if(n == 0) {
            return 0;
        }
        int[] coins = {100,50,25,10,5,1};
        int c = n + 1;

        for (int i = 0; i < coins.length;i++ ) {
            if (coins[i] <= n) {
                c = Math.min(c, countChange(n-coins[i]) + 1);
            }
        }
        return c;
    }
}
