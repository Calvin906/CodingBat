package Logic2;

/**
 * Created by Wags on 3/29/17.
 */
public class LuckySum {
    public static void main(String[] args) {
        System.out.print(luckySum(1, 13, 3));
    }

    /**
     * Given 3 int values, a b c, return their sum.
     * However, if one of the values is 13 then it does not
     * count towards the sum and values to its right do not count.
     * So for example, if b is 13, then both b and c do not count.
     * <p/>
     * luckySum(1, 2, 3) → 6
     * luckySum(1, 2, 13) → 3
     * luckySum(1, 13, 3) → 1
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int luckySum(int a, int b, int c) {
        boolean aIs = a == 13;
        boolean bIs = b == 13;
        boolean cIs = c == 13;

        if (aIs){
            return 0;
        }
        if (bIs){
            return a;
        }
        if (cIs){
            return a + b;
        }
        return a + b + c;

    }
}
