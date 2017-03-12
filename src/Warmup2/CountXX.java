package Warmup2;

/**
 * Created by Wags on 3/11/17.
 */
public class CountXX {
    public static void main(String[] args) {
        System.out.print(countXX("cdcddxxxsxs"));
    }

    /**
     * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
     * countXX("abcxx") → 1
     * countXX("xxx") → 2
     * countXX("xxxx") → 3
     * @param str
     * @return
     */
    public static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.length() - i < 2) {
                return count;
            } else if (str.charAt(i) == 'x' && str.charAt(i+1) == 'x'){
                count++;
            }
        }
        return count;
    }
}
