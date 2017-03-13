package Array1;

/**
 * Created by Wags on 3/12/17.
 */
public class SameFirstLast {
    public static void main(String[] args) {
        int[] nums = { 6,1,2,3};
        System.out.print(sameFirstLast(nums));
    }

    /**
     * Given an array of ints, return true if the array is
     * length 1 or more, and the first element and the last element are equal.
     * sameFirstLast([1, 2, 3]) → false
     * sameFirstLast([1, 2, 3, 1]) → true
     * sameFirstLast([1, 2, 1]) → true
     * @param nums
     * @return
     */
    public static boolean sameFirstLast(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        if (nums[0] == nums[nums.length - 1]) {
            return true;
        } else {
            return false;
        }
    }
}
