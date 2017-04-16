package String3;

/**
 * Created by Wags on 4/16/17.
 */
public class MaxBlock {
    public static void main(String[] args) {
        System.out.println("Expected: 2, Received: " + maxBlock("hoopla"));
    }

    /**
     * Given a string, return the length of the largest "block"
     * in the string. A block is a run of adjacent chars that are the same.
     * <p/>
     * maxBlock("hoopla") → 2
     * maxBlock("abbCCCddBBBxx") → 3
     * maxBlock("") → 0
     *
     * @param str
     * @return
     */
    public static int maxBlock(String str) {
        if (str.length()  < 1){
            return 0;
        }
        int high = 1;
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i + 1) == str.charAt(i)) {
                count++;
                if (high < count){
                    high = count;
                }
            } else {
                count = 1;
            }
        }
        return high;
    }
}
