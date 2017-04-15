package String2;

/**
 * Created by Wags on 4/15/17.
 */
public class PlusOut {
    public static void main(String[] args) {
        System.out.println("Expected: ++xy++, Received: " + plusOut("12xy34", "xy"));
    }

    /**
     * Given a string and a non-empty word string, return a version
     * of the original String where all chars have been replaced by
     * pluses ("+"), except for appearances of the word string which are preserved unchanged.
     * <p/>
     * plusOut("12xy34", "xy") → "++xy++"
     * plusOut("12xy34", "1") → "1+++++"
     * plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
     *
     * @param str
     * @param word
     * @return
     */
    public static String plusOut(String str, String word) {
        String result = "";
        if (str.contains(word)){
            str = str.replace(word,  "--");
        }

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != '-'){
                str= str.replace(str.substring(i,i+1), "+");
            }
        }
        str = str.replace("--",word);
        return str;
    }
}
