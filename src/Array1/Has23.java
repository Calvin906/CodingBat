package Array1;

/**
 * Created by Wags on 3/12/17.
 */
public class Has23 {
    public static void main(String[] args) {
        int[] nums = {3, 4};
        System.out.print(has23(nums));
    }

    /**
     * Given an int array length 2, return true if it contains a 2 or a 3.
     * has23([2, 5]) → true
     * has23([4, 3]) → true
     * has23([4, 5]) → false
     * @param nums
     * @return
     */
    public static boolean has23(int[] nums) {
        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) {
            return true;
        } else {
            return false;
        }
    }
}
