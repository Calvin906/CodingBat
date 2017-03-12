package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class AtFirst {
    public static void main(String[] args) {
        System.out.print(atFirst("hhehe"));
    }

    /**
     * Given a string, return a string length 2 made of its first
     * 2 chars. If the string length is less than 2, use '@' for the missing chars.
     * atFirst("hello") → "he"
     * atFirst("hi") → "hi"
     * atFirst("h") → "h@"
     * @param str
     * @return
     */
    public static String atFirst(String str) {
       if (str.length() < 2) {
           if (str.length() == 0) {
               return "@"+"@";
           }
           return str + "@";
       } else {
           return str.substring(0,2);
       }
    }
}
