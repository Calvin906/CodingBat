package Array1;

/**
 * Created by Wags on 3/12/17.
 */
public class MiddleWay {
    public static void main(String[] args) {
        int[] a = {2,3,4};
        int[] b = {4,4,5};
        System.out.print(middleWay(a,b));
    }

    /**
     * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
     * middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
     * middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
     * middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
     * @param a
     * @param b
     * @return
     */
    public static int[] middleWay(int[] a, int[] b){
        int[] mid = {a[1], b[1]};
        return mid;

    }
}
