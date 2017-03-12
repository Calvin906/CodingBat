package Warmup2;

/**
 * Created by Wags on 3/11/17.
 */
public class ArrayCount9 {
    public static void main(String[] args) {
        int[] arr = {1,4,3,9,9};
        System.out.print(arrayCount9(arr));
    }

    /**
     * Given an array of ints, return the number of 9's in the array.
     * arrayCount9([1, 2, 9]) → 1
     * arrayCount9([1, 9, 9]) → 2
     * arrayCount9([1, 9, 9, 3, 9]) → 3
     * @param nums
     * @return
     */
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }


}
