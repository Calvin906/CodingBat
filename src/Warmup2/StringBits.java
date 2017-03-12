package Warmup2;

/**
 * Created by Wags on 3/11/17.
 */
public class StringBits {
    public static void main(String[] args) {
        System.out.print(stringBits("Heedsadf"));
    }

    /**
     * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
     * stringBits("Hello") → "Hlo"
     * stringBits("Hi") → "H"
     * stringBits("Heeololeo") → "Hello"
     * @param str
     * @return
     */
    public static String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2){
            result += str.charAt(i);
        }
        return result;
    }
}
