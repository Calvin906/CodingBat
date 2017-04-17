package Array2;

/**
 * Created by Wags on 4/16/17.
 */
public class Has22 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 6, 3, 4, 7};
        System.out.println("Expected: true, Received: " + has22(nums));
    }

    /**
     * Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
     * <p/>
     * has22([1, 2, 2]) → true
     * has22([1, 2, 1, 2]) → false
     * has22([2, 1, 2]) → false
     *
     * @param nums
     * @return
     */
    public static boolean has22(int[] nums) {

        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] == 2 && nums[i+1] == 2){
                return true;
            }
        }
        return false;
    }
}
