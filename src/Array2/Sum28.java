package Array2;

/**
 * Created by Wags on 4/17/17.
 */
public class Sum28 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 2, 3, 6, 3, 4, 7};
        System.out.println("Expected: true, Received: " + sum28(nums));
    }

    /**
     * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
     * <p/>
     * sum28([2, 3, 2, 2, 4, 2]) → true
     * sum28([2, 3, 2, 2, 4, 2, 2]) → false
     * sum28([1, 2, 3, 4]) → false
     *
     * @param nums
     * @return
     */
    public static boolean sum28(int[] nums) {
        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                count2 += 2;
            }
        }

        return count2 == 8;

    }
}
