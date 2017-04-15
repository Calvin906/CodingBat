package String2;

/**
 * Created by Wags on 4/14/17.
 */
public class BobThere {
    public static void main(String[] args) {
        System.out.print(bobThere("bab"));
    }

    /**
     * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
     * <p/>
     * bobThere("abcbob") → true
     * bobThere("b9b") → true
     * bobThere("bac") → false
     *
     * @param str
     * @return
     */
    public static boolean bobThere(String str) {

        for (int i = 0; i < str.length()-2; i++){
            if (str.substring(i,i+1).equals("b") && str.substring(i+2, i+3).equals("b")){
                return true;
            }
        }
        return false;
    }
}
