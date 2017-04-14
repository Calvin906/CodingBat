package String2;

/**
 * Created by Wags on 4/14/17.
 */
public class EndOther {
    public static void main(String[] args) {
        System.out.print(endOther("AbC", "HiaBc"));
    }

    /**
     * Given two strings, return true if either of the strings
     * appears at the very end of the other string, ignoring upper/lower case
     * differences (in other words, the computation should not be "case sensitive").
     * Note: str.toLowerCase() returns the lowercase version of a string.
     * <p/>
     * endOther("Hiabc", "abc") → true
     * endOther("AbC", "HiaBc") → true
     * endOther("abc", "abXabc") → true
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean endOther(String a, String b) {
        boolean aShort = a.length() <= b.length();
        boolean bShort = b.length() < a.length();

        String bb = b.toLowerCase();
        String aa = a.toLowerCase();
        if (aShort){
            if (bb.endsWith(aa)){
                return true;
            }
        } else if (bShort){
            if (aa.endsWith(bb)){
                return true;
            }
        }

        return false;
    }
}
