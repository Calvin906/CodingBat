package Recursion;

/**
 * Created by Wags on 3/7/17.
 */
public class CountABC {
    public static void main(String[] args) {
        String str = "abcdddabc";
        System.out.println(countAbc(str));
    }

    /**
     * Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
     * countAbc("abc") → 1
     * countAbc("abcxxabc") → 2
     * countAbc("abaxxaba") → 2
     * @param str
     * @return
     */
    public static int countAbc(String str) {
        if (str.length() <= 2) {
            return 0;
        } else if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            if (str.charAt(2) == 'a' || str.charAt(2) == 'c') {
                return countAbc(str.substring(1)) + 1;
            }
        }
            return countAbc(str.substring(1));
    }
}
