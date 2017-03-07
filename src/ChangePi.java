/**
 * Created by Wags on 3/6/17.
 */
public class ChangePi {
    public static void main(String[] args) {
        String str = "pixsdpi";
        System.out.println(changePi(str));
    }

    /**
     Given a string, compute recursively (no loops) anew string where all appearances of "pi" have been replaced by "3.14".
     changePi("xpix") → "x3.14x"
     changePi("pipi") → "3.143.14"
     changePi("pip") → "3.14p"
     * @param str
     * @return
     */
    public static String changePi(String str) {
       if (str.length() <= 1) {
           return str;
       } else if(str.charAt(0) == 'p' && str.charAt(1) == 'i') {
           return str = "3.14" + changePi(str.substring(2,str.length()));
       } else {
           return str = str.charAt(0) + changePi(str.substring(1,str.length()));
       }
    }
}
