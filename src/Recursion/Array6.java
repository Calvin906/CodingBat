package Recursion;

/**
 * Created by Wags on 3/6/17.
 */
public class Array6 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,2,};
        System.out.println(array6(arr,0));

    }

    /**
     * Given an array of ints, compute recursively if the array contains a 6.
     * We'll use the convention of considering only the part of the array that begins at the given index.
     * In this way, a recursive call can pass index+1 to move down the array.
     * The initial call will pass in index as 0.
     * array6([1, 6, 4], 0) → true
     * array6([1, 4], 0) → false
     * array6([6], 0) → true
     * @param arr
     * @param index
     * @return
     */
    public static boolean array6(int[] arr, int index) {
        if (arr.length == index) {
            return false;
        } return arr[index] == 6 ? true: array6(arr, index +1);
    }
}
