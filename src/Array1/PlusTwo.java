package Array1;

/**
 * Created by Wags on 3/13/17.
 */
public class PlusTwo {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3, 4};
        System.out.print(plusTwo(a, b));
    }

    /**
     * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
     * plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
     * plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
     * plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
     *
     * @param a
     * @param b
     * @return
     */
    public static int[] plusTwo(int[] a, int[] b) {
        int[] result = new int[4];
        result[0] = a[0];
        result[1] = a[1];
        result[2] = b[0];
        result[3] = b[1];
        return result;

    }


}
