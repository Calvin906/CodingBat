package Array1;

/**
 * Created by Wags on 3/12/17.
 */
public class Reverse3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.print(reverse3(nums));
    }

    /**
     * Given an array of ints length 3, return a new array
     * with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
     * reverse3([1, 2, 3]) → [3, 2, 1]
     * reverse3([5, 11, 9]) → [9, 11, 5]
     * reverse3([7, 0, 0]) → [0, 0, 7]
     * @param nums
     * @return
     */
    public static int[] reverse3(int[] nums) {
        int[] result = {nums[2], nums[1], nums[0]};
        return result;
    }
}
