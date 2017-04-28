package Array2;

/**
 * Created by Wags on 4/24/17.
 */
public class Only14 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 1, 4};
        System.out.println("Expected: true, Received: " + only14(nums));
    }

    /**
     * Given an array of ints, return true if every element is a 1 or a 4.
     * <p/>
     * only14([1, 4, 1, 4]) → true
     * only14([1, 4, 2, 4]) → false
     * only14([1, 1]) → true
     *
     * @param nums
     * @return
     */
    public static boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int s = nums[i];
            if (nums[i] != 1 && nums[i] != 4) {
                return false;
            }
        }
        return true;

    }
}
