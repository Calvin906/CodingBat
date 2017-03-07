/**
 * Created by Wags on 3/6/17.
 */
public class Array220 {
    public static void main(String[] args) {
        int[] arr = {3,30};
        System.out.println(array220(arr, 0));
    }

    /**
     * Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10.
     * We'll use the convention of considering only the part of the array that begins at the given index.
     * In this way, a recursive call can pass index+1 to move down the array.
     * The initial call will pass in index as 0.
     array220([1, 2, 20], 0) → true
     array220([3, 30], 0) → true
     array220([3], 0) → false
     * @param nums
     * @param index
     * @return
     */
    public static boolean array220(int[] nums, int index) {
        if (nums.length == index) {
            return false;
        }
        for (int i = index; i < nums.length; i++ ) {
            if (nums[index] * 10 == nums[i]) {
                return true;
            }
        }
        return array220(nums, index+1);
    }

}
