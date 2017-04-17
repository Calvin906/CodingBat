package Array2;

/**
 * Created by Wags on 4/16/17.
 */
public class CenteredAverage {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 100};
        System.out.println("Expected: 3, Received: " + centeredAverage(nums));
    }

    /**
     * Return the "centered" average of an array of ints,
     * which we'll say is the mean average of the values,
     * except ignoring the largest and smallest values in the array.
     * If there are multiple copies of the smallest value, ignore just
     * one copy, and likewise for the largest value. Use int division to produce the
     * final average. You may assume that the array is length 3 or more.
     * <p/>
     * centeredAverage([1, 2, 3, 4, 100]) → 3
     * centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
     * centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
     *
     * @param nums
     * @return
     */
    public static int centeredAverage(int[] nums) {
        int large = nums[0];
        int small = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (small < nums[i]){
                small = nums[i];
            }
            if (large > nums[i]){
                large = nums[i];
            }
            sum += nums[i];
        }

        return (sum - (large + small)) / (nums.length -2);

    }
}
