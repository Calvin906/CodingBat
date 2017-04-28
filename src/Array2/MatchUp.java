package Array2;

/**
 * Created by Wags on 4/27/17.
 */
public class MatchUp {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 10};
        System.out.print(matchUp(arr1, arr2));
    }

    /**
     * Given arrays nums1 and nums2 of the same length, for every element in
     * nums1, consider the corresponding element in nums2 (at the same index).
     * Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
     * <p/>
     * matchUp([1, 2, 3], [2, 3, 10]) → 2
     * matchUp([1, 2, 3], [2, 3, 5]) → 3
     * matchUp([1, 2, 3], [2, 3, 3]) → 2
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        if (nums1.length != nums2.length) {
            return 0;
        }

        for (int i = 0; i < nums1.length; i++) {
            int num1 = nums1[i];
            int num2 = nums2[i];
            int diff = num1 - num2;
            if ((num1 != num2) && Math.abs(diff) <= 2) {
                count++;
            }

        }
        return count;

    }
}
