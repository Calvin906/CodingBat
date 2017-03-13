package Array1;

/**
 * Created by Wags on 3/12/17.
 */
public class RotateLeft3 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4};
        System.out.print(rotateLeft3(nums));
    }

    /**
     * Given an array of ints length 3, return an array with the
     * elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
     * rotateLeft3([1, 2, 3]) → [2, 3, 1]
     * rotateLeft3([5, 11, 9]) → [11, 9, 5]
     * rotateLeft3([7, 0, 0]) → [0, 0, 7]
     *
     * @param nums
     * @return
     */
    public static int[] rotateLeft3(int[] nums) {
        int[] result = {nums[1], nums[2], nums[0]};
        return result;
    }
}
