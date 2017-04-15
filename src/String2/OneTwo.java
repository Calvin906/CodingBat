package String2;

/**
 * Created by Wags on 4/14/17.
 */
public class OneTwo {
    public static void main(String[] args) {
        System.out.println("Expected: catdog, Received: " + oneTwo("tcagdo"));
    }

    /**
     * Given a string, compute a new string by moving the first char
     * to come after the next two chars, so "abc" yields "bca". Repeat
     * this process for each subsequent group of 3 chars, so "abcdef"
     * yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
     * <p/>
     * oneTwo("abc") → "bca"
     * oneTwo("tca") → "cat"
     * oneTwo("tcagdo") → "catdog"
     *
     * @param str
     * @return
     */
    public static String oneTwo(String str) {
        String result = "";
        for (int i = 0; i < str.length()-2; i+=3) {
            result += str.substring(i+1, i+3) + str.substring(i,i+1);
        }
        return result;
    }
}
