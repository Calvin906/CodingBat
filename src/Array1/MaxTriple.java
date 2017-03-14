package Array1;

/**
 * Created by Wags on 3/13/17.
 */
public class MaxTriple {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5};
        System.out.print(maxTriple(nums));
    }

    /**
     * Given an array of ints of odd length, look at the first,
     * last, and middle values in the array and return the largest.
     * The array length will be a least 1.
     * maxTriple([1, 2, 3]) → 3
     * maxTriple([1, 5, 3]) → 5
     * maxTriple([5, 2, 3]) → 5
     *
     * @param nums
     * @return
     */
    public static int maxTriple(int[] nums) {
        if (nums.length == 3) {
            return Math.max(Math.max(nums[0], nums[1]), nums[2]);
        } else {
            return Math.max(Math.max(nums[0], nums[nums.length / 2]), nums[nums.length - 1]);
        }
    }
}
