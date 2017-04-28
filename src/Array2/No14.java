package Array2;

/**
 * Created by Wags on 4/17/17.
 */
public class No14 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("Expected: true, Received: " + no14(nums));
    }

    /**
     * Given an array of ints, return true if it contains no 1's or it contains no 4's.
     * <p/>
     * no14([1, 2, 3]) → true
     * no14([1, 2, 3, 4]) → false
     * no14([2, 3, 4]) → true
     *
     * @param nums
     * @return
     */
    public static boolean no14(int[] nums) {
        int ones = 0;
        int fours = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ones++;
            }
            if (nums[i] == 4) {
                fours++;
            }
        }

        if (ones == 0 || fours == 0) {
            return true;
        } else {
            return false;
        }
    }
}
