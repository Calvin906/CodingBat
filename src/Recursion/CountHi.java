package Recursion;

/**
 * Created by Wags on 3/2/17.
 */
public class CountHi {
    public static void main(String[] args) {
        String str = "ihihihhihihi";
        System.out.println(countHi(str));
    }

    public static int countHi(String str) {
        if (str.length() <= 1) {
            return 0;
        } else if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            return countHi(str.substring(1, str.length())) + 1;
        }
        return countHi(str.substring(1, str.length()));
    }
}
