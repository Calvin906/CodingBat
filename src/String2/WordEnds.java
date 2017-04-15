package String2;

/**
 * Created by Wags on 4/15/17.
 */
public class WordEnds {
    public static void main(String[] args) {
        System.out.println("Expected: c13i, Received: " + wordEnds("aabcXY123XYijk", "XY"));
    }

    /**
     * Given a string and a non-empty word string, return a string
     * made of each char just before and just after every
     * appearance of the word in the string.
     * Ignore cases where there is no char before or
     * after the word, and a char may be included twice if it is between two words.
     * <p/>
     * wordEnds("abcXY123XYijk", "XY") → "c13i"
     * wordEnds("XY123XY", "XY") → "13"
     * wordEnds("XY1XY", "XY") → "11"
     *
     * @param str
     * @param word
     * @return
     */
    public static String wordEnds(String str, String word) {
        int sLen = str.length();
        int wLen = word.length();
        String result = "";

        for (int i = 0; i < sLen - wLen + 1; i++) {
            String tmp = str.substring(i, i + wLen);
            if (i > 0 && tmp.equals(word)) {
                result += str.substring(i - 1, i);
            }
            if (i < sLen - wLen && tmp.equals(word)) {
                result += str.substring(i + wLen, i + wLen + 1);
            }
        }

        return result;
    }

}
