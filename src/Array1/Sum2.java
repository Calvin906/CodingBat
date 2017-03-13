package Array1;

/**
 * Created by Wags on 3/12/17.
 */
public class Sum2 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        System.out.print(sum2(nums));
    }

    /**
     * Given an array of ints, return the sum of the first
     * 2 elements in the array. If the array length is less than 2,
     * just sum up the elements that exist, returning 0 if the array is length 0.
     * sum2([1, 2, 3]) → 3
     * sum2([1, 1]) → 2
     * sum2([1, 1, 1, 1]) → 2
     *
     * @param nums
     * @return
     */
    public static int sum2(int[] nums) {
        if (nums.length >= 2) {
            return nums[0] + nums[1];
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return 0;
        }
    }
}
