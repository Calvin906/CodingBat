package Array2;

/**
 * Created by Wags on 4/27/17.
 */
public class HaveThree {
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 3, 1, 3};
        System.out.println("Expected: true, Received: " + haveThree(arr1));
    }

    /**
     * Given an array of ints, return true if the value 3 appears
     * in the array exactly 3 times, and no 3's are next to each other.
     * <p/>
     * haveThree([3, 1, 3, 1, 3]) → true
     * haveThree([3, 1, 3, 3]) → false
     * haveThree([3, 4, 3, 3, 4]) → false
     *
     * @param nums
     * @return
     */
    public static boolean haveThree(int[] nums) {
        int count3 = 0;
        boolean is3 = false;

        for (int i = 0; i < nums.length;i++){
            if (nums[i] == 3 && !is3){
                is3 = true;
                count3++;
            }
            if (nums[i] != 3){
                is3 = false;
            }
        }

        return count3 == 3;
    }
}
