package String3;

/**
 * Created by Wags on 4/15/17.
 */
public class EqualIsNot {
    public static void main(String[] args) {
        System.out.println("Expected: false, Received: " + equalIsNot("This is not"));

    }

    /**
     * Given a string, return true if the number of appearances
     * of "is" anywhere in the string is equal to the number of
     * appearances of "not" anywhere in the string (case sensitive).
     * <p/>
     * equalIsNot("This is not") → false
     * equalIsNot("This is notnot") → true
     * equalIsNot("noisxxnotyynotxisi") → true
     *
     * @param str
     * @return
     */
    public static boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.length() >= i+2 && str.substring(i,i+2).contains("is")){
                isCount++;
            }
            if (str.length() >= i + 3 && str.substring(i,i+3).contains("not")){
                notCount++;
            }
        }

        return isCount == notCount;
    }
}
