package Array2;

/**
 * Created by Wags on 4/27/17.
 */
public class ModThree {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 5};
        System.out.println("Expected: true, Received: " + modThree(arr1));
    }

    /**
     * Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
     * <p/>
     * modThree([2, 1, 3, 5]) → true
     * modThree([2, 1, 2, 5]) → false
     * modThree([2, 4, 2, 5]) → true
     *
     * @param nums
     * @return
     */
    public static boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                return true;
            }
            if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0) {
                return true;
            }
        }

        return false;
    }
}
