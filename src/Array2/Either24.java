package Array2;

/**
 * Created by Wags on 4/27/17.
 */
public class Either24 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.print("Expected: true, Received: " + either24(arr));
    }

    /**
     * Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
     * <p/>
     * either24([1, 2, 2]) → true
     * either24([4, 4, 1]) → true
     * either24([4, 4, 1, 2, 2]) → false
     *
     * @param nums
     * @return
     */
    public static boolean either24(int[] nums) {
        int count = 0;
        boolean hasOne = false;

        for (int i = 0; i < nums.length-1; i++){
            if ((nums[i] == 2 && nums[i+1] == 2) ||(nums[i] == 4 && nums[i+1] == 4)){
                count++;
                hasOne = true;
            }
        }
        if (count < 2 && hasOne){
            return true;
        }
        return false;
    }
}
