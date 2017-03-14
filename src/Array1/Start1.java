package Array1;

/**
 * Created by Wags on 3/13/17.
 */
public class Start1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 4};
        int[] b = {4, 5, 6};
        System.out.print(start1(a, b));

    }

    /**
     * Start with 2 int arrays, a and b,
     * of any length. Return how many of the arrays have 1 as their first element.
     * start1([1, 2, 3], [1, 3]) → 2
     * start1([7, 2, 3], [1]) → 1
     * start1([1, 2], []) → 1
     *
     * @param a
     * @param b
     * @return
     */
    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length != 0){
            if (a[0] == 1){
                count++;
            }
        } if (b.length != 0){
            if (b[0] == 1){
                count++;
            }
        }
        return count;
    }
}


