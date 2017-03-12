package Warmup2;

/**
 * Created by Wags on 3/11/17.
 */
public class Array123 {
    public static void main(String[] args) {
        int[] nums = {1,1,3,42,4};
        System.out.print(array123(nums));
    }

    /**
     * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
     * array123([1, 1, 2, 3, 1]) → true
     * array123([1, 1, 2, 4, 1]) → false
     * array123([1, 1, 2, 1, 2, 3]) → true
     * @param nums
     * @return
     */
    public static boolean array123(int[] nums) {
        boolean one = false,two = false,three = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                one = true;
            } if (nums[i] == 2){
                two = true;
            } if (nums[i] == 3){
                three = true;
            }
        }
        if (one && two && three) {
            return true;
        }
        else {
            return false;
        }

    }
}
