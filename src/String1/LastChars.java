package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class LastChars {
    public static void main(String[] args) {
        System.out.print(lastChars("last", "Chars"));
    }

    /**
     * Given 2 strings, a and b, return a new string made of the first char of
     * a and the last char of b, so "yo" and "java" yields "ya".
     * If either string is length 0, use '@' for its missing char.
     * lastChars("last", "chars") → "ls"
     * lastChars("yo", "java") → "ya"
     * lastChars("hi", "") → "h@"
     * @param a
     * @param b
     * @return
     */
    public static String lastChars(String a, String b){
        if (a == "") {
            if (b == "") {
                return "@"+"@";
            }
            return "@" + b.substring(b.length()-1);
        } else if (b == ""){
            return a.substring(0,1) + "@";
        }
        return a.substring(0,1) + b.substring(b.length()-1);
    }
}
