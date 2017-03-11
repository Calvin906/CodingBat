package Recursion;

/**
 * Created by Wags on 3/9/17.
 */
public class ParenBit {
    public static void main(String[] args) {
        String str = "xyz(abc)123";
        System.out.println(parenBit(str));
    }

    /**
     * Given a string that contains a single pair of parenthesis,
     * compute recursively a new string made of only of the parenthesis and their contents,
     * so "xyz(abc)123" yields "(abc)".
     * parenBit("xyz(abc)123") → "(abc)"
     * parenBit("x(hello)") → "(hello)"
     * parenBit("(xy)1") → "(xy)"
     * @param str
     * @return
     */
    public static String parenBit(String str) {
        if (str.length() == 0) {
            return str;
        } else if (str.charAt(0) != '(') {
            return parenBit(str.substring(1));
        } else if (str.charAt(str.length()-1) != ')') {
            return parenBit(str.substring(0,str.length()-1));
        } else {
            return str;
        }
    }
}
