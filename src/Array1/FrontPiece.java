package Array1;

/**
 * Created by Wags on 3/13/17.
 */
public class FrontPiece {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5};
        System.out.print(frontPiece(nums));
    }

    /**
     * Given an int array of any length, return a
     * new array of its first 2 elements. If the array is
     * smaller than length 2, use whatever elements are present.
     * frontPiece([1, 2, 3]) → [1, 2]
     * frontPiece([1, 2]) → [1, 2]
     * frontPiece([1]) → [1]
     *
     * @param nums
     * @return
     */
    public static int[] frontPiece(int[] nums) {
        if (nums.length != 0){
            if (nums.length == 1) {
                return nums;
            } else {
                return new int[] {nums[0],nums[1]};
            }
        } else {
             return nums;
        }
    }
}
