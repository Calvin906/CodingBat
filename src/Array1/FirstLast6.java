package Array1;

/**
 * Created by Wags on 3/12/17.
 */
public class FirstLast6 {
    public static void main(String[] args) {
        int[] nums = { 6,1,2,3};
        System.out.print(firstLast6(nums));
    }

    /**
     * Given an array of ints, return true if 6 appears as either
     * the first or last element in the array. The array will be length 1 or more.
     * firstLast6([1, 2, 6]) → true
     * firstLast6([6, 1, 2, 3]) → true
     * firstLast6([13, 6, 1, 2, 3]) → false
     * @param nums
     * @return
     */
    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length-1] == 6 ) {
            return true;
        } else {
            return false;
        }
    }
}
