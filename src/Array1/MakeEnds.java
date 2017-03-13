package Array1;

/**
 * Created by Wags on 3/12/17.
 */
public class MakeEnds {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4};
        System.out.print(makeEnds(nums));
    }

    /**
     * Given an array of ints, return a new array length 2
     * containing the first and last elements from the original array.
     * The original array will be length 1 or more.
     * makeEnds([1, 2, 3]) → [1, 3]
     * makeEnds([1, 2, 3, 4]) → [1, 4]
     * makeEnds([7, 4, 6, 2]) → [7, 2]
     *
     * @param nums
     * @return
     */
    public static int[] makeEnds(int[] nums) {
        int[] mid = new int[2];
        if (nums.length < 2) {
            mid[0] = nums[0];
            mid[1] = nums[0];
        } else {
            mid[0] = nums[0];
            mid[1] = nums[nums.length - 1];
        }
        return mid;
    }
}
