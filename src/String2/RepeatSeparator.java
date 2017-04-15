package String2;

/**
 * Created by Wags on 4/14/17.
 */
public class RepeatSeparator {
    public static void main(String[] args) {
        System.out.print("Expected: WordXWordXWord, Received: " + repeatSeparator("Word", "X", 3));
    }

    /**
     * Given two strings, word and a separator sep, return a
     * big string made of count occurrences of the word, separated by the separator string.
     * <p/>
     * repeatSeparator("Word", "X", 3) → "WordXWordXWord"
     * repeatSeparator("This", "And", 2) → "ThisAndThis"
     * repeatSeparator("This", "And", 1) → "This"
     *
     * @param word
     * @param sep
     * @param count
     * @return
     */
    public static String repeatSeparator(String word, String sep, int count) {
        String result = "";
        if (count == 0) {
            return result;
        }
        for (int i = 0; i < count - 1; i++) {
            result += word + sep;
        }

        return result += word;

    }
}
