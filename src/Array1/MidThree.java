package Array1;

/**
 * Created by Wags on 3/13/17.
 */
public class MidThree {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 3, 44};
        System.out.print(midThree(nums));
    }

    /**
     * Given an array of ints of odd length, return a new array
     * length 3 containing the elements from the middle of the array.
     * The array length will be at least 3.
     * midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
     * midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
     * midThree([1, 2, 3]) → [1, 2, 3]
     *
     * @param nums
     * @return
     */
    public static int[] midThree(int[] nums) {
        if (nums.length == 3) {
            return nums;
        } else {
            int[] n = new int[3];
            n[0] = nums[nums.length / 2 - 1];
            n[1] = nums[nums.length / 2];
            n[2] = nums[nums.length / 2 + 1];
            return n;
        }

    }
}
