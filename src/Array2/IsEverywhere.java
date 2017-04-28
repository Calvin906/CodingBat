package Array2;

/**
 * Created by Wags on 4/17/17.
 */
public class IsEverywhere {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3};
        System.out.println("Expected: true, Received: " + isEverywhere(nums, 1));
    }

    /**
     * We'll say that a value is "everywhere" in an array if for
     * every pair of adjacent elements in the array, at least one
     * of the pair is that value. Return true if the given value is everywhere in the array.
     * <p/>
     * isEverywhere([1, 2, 1, 3], 1) → true
     * isEverywhere([1, 2, 1, 3], 2) → false
     * isEverywhere([1, 2, 1, 3, 4], 1) → false
     *
     * @param nums
     * @param val
     * @return
     */
    public static boolean isEverywhere(int[] nums, int val) {
        boolean result = true;
        for (int i = 0; i <= nums.length-2; i++){
            if (nums[i] != val && nums[i+1] != val){
                result = false;
            }
        }
        return result;
    }
}
