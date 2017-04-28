package Array2;

/**
 * Created by Wags on 4/27/17.
 */
public class Has12 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        System.out.println("Expected: true, Received: " + has12(nums));
    }

    /**
     * Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
     * <p/>
     * has12([1, 3, 2]) → true
     * has12([3, 1, 2]) → true
     * has12([3, 1, 4, 5, 2]) → true
     *
     * @param nums
     * @return
     */
    public static boolean has12(int[] nums) {
        boolean has1 = false;
        for (int i = 0; i < nums.length;i++){
            if (nums[i] == 1){
                has1 = true;
            }
            if (has1 && nums[i] == 2){
                return true;
            }
        }
        return false;
    }
}
