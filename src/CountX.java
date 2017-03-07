/**
 * Created by Wags on 3/2/17.
 */
public class CountX {
    public static void main(String[] args) {
        String str = "xttxX";
        System.out.println(count(str));
    }

    /**
     * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
     countX("xxhixx") → 4
     countX("xhixhix") → 3
     countX("hi") → 0
     * @param str
     * @return
     */
    public static int count(String str) {
        if (str.equals("")) {
            return 0;
        } else if (str.charAt(0) == 'x') {
            return count(str.substring(1, str.length())) +1;
        }
        return count(str.substring(1, str.length()));
    }
}
