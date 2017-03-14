package Array1;

/**
 * Created by Wags on 3/13/17.
 */
public class BiggerTwo {
    public static void main(String[] args) {
        int[] a = {1,3};
        int[] b = {3,5};
        System.out.print(biggerTwo(a,b));
    }

    /**
     * Start with 2 int arrays, a and b, each length 2.
     * Consider the sum of the values in each array.
     * Return the array which has the largest sum. In event of a tie, return a.
     * biggerTwo([1, 2], [3, 4]) → [3, 4]
     * biggerTwo([3, 4], [1, 2]) → [3, 4]
     * biggerTwo([1, 1], [1, 2]) → [1, 2]
     * @param a
     * @param b
     * @return
     */
    public static int[] biggerTwo(int[] a, int[] b) {
        if (a[0] + a[1] >= b[0]+b[1]){
            return a;
        } else {
            return b;
        }

    }
}
