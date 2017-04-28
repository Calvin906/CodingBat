package Array2;

/**
 * Created by Wags on 4/17/17.
 */
public class FizzArray {
    public static void main(String[] args) {
        printArr(fizzArray(4));
    }

    /**
     * Given a number n, create and return a new int array of length n,
     * containing the numbers 0, 1, 2, ... n-1.
     * The given n may be 0, in which case just return a length 0 array.
     * You do not need a separate if-statement for the length-0 case; the for-loop
     * should naturally execute 0 times in that case, so it just works.
     * The syntax to make a new int array is: new int[desired_length]   (See also: FizzBuzz Code)
     * <p/>
     * fizzArray(4) → [0, 1, 2, 3]
     * fizzArray(1) → [0]
     * fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
     *
     * @param n
     * @return
     */
    public static int[] fizzArray(int n) {

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }

        return a;
    }

    /**
     * Print array
     * @param a
     */
    public static void printArr(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]);
            if (i < a.length-1){
                System.out.print(", ");
            }
        }
    }
}
