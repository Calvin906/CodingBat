package String2;

/**
 * Created by Wags on 4/14/17.
 */
public class XyzThere {
    public static void main(String[] args) {
        System.out.println(xyzThere("abc.xyz"));
    }

    /**
     * Return true if the given string contains an appearance
     * of "xyz" where the xyz is not directly preceded
     * by a period (.). So "xxyz" counts but "x.xyz" does not.
     * <p/>
     * xyzThere("abcxyz") → true
     * xyzThere("abc.xyz") → false
     * xyzThere("xyz.abc") → true
     *
     * @param str
     * @return
     */
    public static boolean xyzThere(String str) {
        if (str.length() < 3){
            return false;
        }
        if (str.substring(0,1).equals(".")){
            return xyzThere(str.substring(2));
        } else if (str.substring(0,3).equals("xyz")){
            return true;
        }
        return xyzThere(str.substring(1));
    }
}
