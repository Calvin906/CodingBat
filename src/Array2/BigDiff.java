package Array2;

/**
 * Created by Wags on 4/16/17.
 */
public class BigDiff {

    public static void main(String[] args) {
        int[] nums = {10, 3, 5, 6};
        System.out.println("Expected: 7, Received: " + bigDiff(nums));
    }

    /**
     * Given an array length 1 or more of ints, return the
     * difference between the largest and smallest values in the array.
     * Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
     * <p/>
     * bigDiff([10, 3, 5, 6]) → 7
     * bigDiff([7, 2, 10, 9]) → 8
     * bigDiff([2, 10, 7, 2]) → 8
     *
     * @param nums
     * @return
     */
    public static int bigDiff(int[] nums) {
        int small = nums[0];
        int large = nums[0];

        for (int i = 0; i < nums.length-1; i++) {
            if (small > nums[i]){
                small = nums[i];
            }
            if (large < nums[i]){
                large = nums[i];
            }
        }

        return large - small;

    }
}
