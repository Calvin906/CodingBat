package Array2;

/**
 * Created by Wags on 4/17/17.
 */
public class More14 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 1};
        System.out.println("Expected: true, Received: " + more14(nums));
    }

    /**
     * Given an array of ints, return true if the number of 1's is greater than the number of 4's
     * <p/>
     * more14([1, 4, 1]) → true
     * more14([1, 4, 1, 4]) → false
     * more14([1, 1]) → true
     *
     * @param nums
     * @return
     */
    public static boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count1++;
            }
            if (nums[i] == 4) {
                count4++;
            }

        }

        return count1 > count4;

    }
}
