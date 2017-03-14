package Array1;

/**
 * Created by Wags on 3/14/17.
 */
public class Front11 {
    public static void main(String[] args) {
        int[] a = {3, 4, 5};
        int[] b = {4, 5, 6};
        System.out.print(front11(a, b));
    }

    /**
     * Given 2 int arrays, a and b, of any length, return a
     * new array with the first element of each array.
     * If either array is length 0, ignore that array.
     * front11([1, 2, 3], [7, 9, 8]) → [1, 7]
     * front11([1], [2]) → [1, 2]
     * front11([1, 7], []) → [1]
     *
     * @param a
     * @param b
     * @return
     */
    public static int[] front11(int[] a, int[] b) {
        if (a.length >= 1 && b.length >= 1) {
            return new int[]{a[0], b[0]};
        } else if (a.length >= 1) {
            return new int[]{a[0]};
        } else if (b.length >= 1) {
            return new int[]{b[0]};
        }
        return new int[]{};
    }
}
