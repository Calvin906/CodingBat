package Array1;

/**
 * Created by Wags on 3/12/17.
 */
public class Sum3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.print(sum3(nums));
    }

    /**
     * Given an array of ints length 3, return the sum of all the elements.
     * sum3([1, 2, 3]) → 6
     * sum3([5, 11, 2]) → 18
     * sum3([7, 0, 0]) → 7
     *
     * @param nums
     * @return
     */
    public static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }
}
