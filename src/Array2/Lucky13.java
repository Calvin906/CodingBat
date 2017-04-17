package Array2;

/**
 * Created by Wags on 4/17/17.
 */
public class Lucky13 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 6, 3, 4, 7};
        System.out.println("Expected: false, Received: " + luck13(nums));
    }


    /**
     * Given an array of ints, return true if the array contains no 1's and no 3's.
     * <p/>
     * lucky13([0, 2, 4]) → true
     * lucky13([1, 2, 3]) → false
     * lucky13([1, 2, 4]) → false
     *
     * @param nums
     * @return
     */
    public static boolean luck13(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3 ) {
                return false;
            }
        }
        return true;

    }
}
