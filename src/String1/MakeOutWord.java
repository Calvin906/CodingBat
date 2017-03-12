package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class MakeOutWord {
    public static void main(String[] args) {
        System.out.print(makeOutWord("[[]]", "Yay"));
    }

    /**
     * Given an "out" string length 4, such as "<<>>", and a word, return a
     * new string where the word is in the middle of the out string, e.g. "<<word>>".
     * Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
     * makeOutWord("<<>>", "Yay") → "<<Yay>>"
     * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
     * makeOutWord("[[]]", "word") → "[[word]]"
     * @param out
     * @param word
     * @return
     */
    public static String makeOutWord(String out, String word) {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < out.length(); i++) {
            if (i == out.length()/2) {
                s.append(word);
            }
            s.append(out.charAt(i));
        }
        return s.toString();
    }
}
