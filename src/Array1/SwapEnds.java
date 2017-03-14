package Array1;

/**
 * Created by Wags on 3/13/17.
 */
public class SwapEnds {
    public static void main(String[] args)  {
        int[] nums = {2,3,4,5};
        System.out.print(swapEnds(nums));
    }

    /**
     * Given an array of ints, swap the first and
     * last elements in the array. Return the modified
     * array. The array length will be at least 1.
     * swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
     * swapEnds([1, 2, 3]) → [3, 2, 1]
     * swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
     * @param nums
     * @return
     */
    public static int[] swapEnds(int[] nums) {
        if (nums.length == 1) {
            return nums;
        } else {
            int temp = nums[nums.length-1];
            nums[nums.length-1] = nums[0];
            nums[0] = temp;
            return nums;
        }
    }
}
