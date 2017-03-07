/**
 * Created by Wags on 3/3/17.
 */
public class CountBinary {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countB(n));
    }

    //Naive recursion
    public static int countB(int n){
        if (n <= 0) {
            return 0;
        } else if(n == 1) {
            return 2;
        } else if(n == 2) {
            return 3;
        } else {
            return countB(n-1) + countB(n-2);
        }
    }
 }
