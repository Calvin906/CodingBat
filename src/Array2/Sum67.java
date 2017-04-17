package Array2;

/**
 * Created by Wags on 4/16/17.
 */
public class Sum67 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 6, 3, 4, 7};
        System.out.println("Expected: 4, Received: " + sum67(nums));
    }

    /**
     * Return the sum of the numbers in the array, except ignore
     * sections of numbers starting with a 6 and extending to
     * the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
     * <p/>
     * sum67([1, 2, 2]) → 5
     * sum67([1, 2, 2, 6, 99, 99, 7]) → 5
     * sum67([1, 1, 6, 7, 2]) → 4
     *
     * @param nums
     * @return
     */
    public static int sum67(int[] nums) {
        boolean has7 = true;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 6) {
                has7 = false;
            } else if (nums[i] == 7 && has7 == false) {
                has7 = true;
            } else if (has7 == true) {
                sum += nums[i];
            }
        }

        return sum;
    }
}

