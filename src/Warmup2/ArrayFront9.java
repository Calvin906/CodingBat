package Warmup2;

/**
 * Created by Wags on 3/11/17.
 */
public class ArrayFront9 {
    public static void main(String[] args) {
        int[] arr = {1,2,9,3,4};
        System.out.print(arrayFront9(arr));
    }

    /**
     * Given an array of ints, return true if one of the first 4 elements in the array is a 9.
     * The array length may be less than 4.
     * arrayFront9([1, 2, 9, 3, 4]) → true
     * arrayFront9([1, 2, 3, 4, 9]) → false
     * arrayFront9([1, 2, 3, 4, 5]) → false
     * @param nums
     * @return
     */
    public static boolean arrayFront9(int[] nums) {
        int size = 4;
        if (nums.length < size) {
            size = nums.length;
        }
        for (int i = 0; i < size; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }
}
