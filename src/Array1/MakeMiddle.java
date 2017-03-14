package Array1;

/**
 * Created by Wags on 3/13/17.
 */
public class MakeMiddle {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4};
        System.out.print(makeMiddle(nums));
    }

    /**
     * Given an array of ints of even length,
     * return a new array length 2 containing the middle
     * two elements from the original array.
     * The original array will be length 2 or more.
     * <p/>
     * makeMiddle([1, 2, 3, 4]) → [2, 3]
     * makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
     * makeMiddle([1, 2]) → [1, 2]
     *
     * @param nums
     * @return
     */
    public static int[] makeMiddle(int[] nums) {
        int[] result = new int[2];
        result[0] = nums[nums.length / 2 - 1];
        result[1] = nums[nums.length / 2];
        return result;

    }
}
