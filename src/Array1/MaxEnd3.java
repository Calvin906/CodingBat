package Array1;

/**
 * Created by Wags on 3/12/17.
 */
public class MaxEnd3 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4};
        System.out.print(maxEnd3(nums));
    }

    /**
     * Given an array of ints length 3, figure out which is larger,
     * the first or last element in the array, and set all the other
     * elements to be that value. Return the changed array.
     * maxEnd3([1, 2, 3]) → [3, 3, 3]
     * maxEnd3([11, 5, 9]) → [11, 11, 11]
     * maxEnd3([2, 11, 3]) → [3, 3, 3]
     *
     * @param nums
     * @return
     */
    public static int[] maxEnd3(int[] nums) {
        int largest = nums[0];
        if (largest < nums[nums.length - 1]) {
            largest = nums[nums.length - 1];
        }
        int[] result = {largest, largest, largest};
        return result;
    }
}
