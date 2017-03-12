package Warmup2;

/**
 * Created by Wags on 3/11/17.
 */
public class NoTriples {
    public static void main(String[] args) {
        int[] nums = {1,1,1,4,3,4};
        System.out.print(noTriples(nums));
    }

    /**
     * Given an array of ints, we'll say that a triple is a value appearing 3 times in
     * a row in the array. Return true if the array does not contain any triples.
     * noTriples([1, 1, 2, 2, 1]) → true
     * noTriples([1, 1, 2, 2, 2, 1]) → false
     * noTriples([1, 1, 1, 2, 2, 2, 1]) → false
     * @param nums
     * @return
     */
    public static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == nums[i+1] && nums[i] == nums[i+2]){
                return false;
            }
        }
        return true;
    }
}
