package String2;

/**
 * Created by Wags on 4/14/17.
 */
public class CountHi {
    public static void main(String[] args) {
        System.out.print(countHi("abc ho hi"));
    }

    /**
     * Return the number of times that the string "hi" appears anywhere in the given string.
     * <p/>
     * countHi("abc hi ho") → 1
     * countHi("ABChi hi") → 2
     * countHi("hihi") → 2
     *
     * @param str
     * @return
     */
    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(0, 2).contains("hi")) {
            return countHi(str.substring(2)) + 1;
        }

        return countHi(str.substring(1));
    }
}
