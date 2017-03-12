package Recursion;

/**
 * Created by Wags on 3/11/17.
 */
public class StringE {
    public static void main(String[] args) {
        System.out.print(stringE("heeellee"));
    }

    /**
     * return true if the given string contains between 1 and 3 'e' chars.
     * stringE("Hello") → true
     * stringE("Heelle") → true
     * stringE("Heelele") → false
     * @param str
     * @return
     */
    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e'){
                count++;
            }
        }
        if (count >= 1 && count <= 3) {
            return true;
        } else  {
            return false;
        }
    }
}
