package Array2;

/**
 * Created by Wags on 4/27/17.
 */
public class TwoTwo {
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 2, 3};
        System.out.println("Expected: true, Received: " + twoTwo(arr1));
    }

    /**
     * Given an array of ints, return true if every 2 that appears in the array is next to another 2.
     * <p/>
     * twoTwo([4, 2, 2, 3]) → true
     * twoTwo([2, 2, 4]) → true
     * twoTwo([2, 2, 4, 2]) → false
     *
     * @param nums
     * @return
     */
    public static boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 2)
                continue;
            if (i >= 1 && nums[i - 1] == 2)
                continue;
            if (i < (nums.length - 1) && nums[i + 1] == 2)
                continue;
            return false;
        }
        return true;
    }
}
