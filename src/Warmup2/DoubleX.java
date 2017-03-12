package Warmup2;

/**
 * Created by Wags on 3/11/17.
 */
public class DoubleX {
    public static void main(String[] args) {
        System.out.print(doubleX("axxxsdf"));
    }

    /**
     * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
     * doubleX("axxbb") → true
     * doubleX("axaxax") → false
     * doubleX("xxxxx") → true
     * @param str
     * @return
     */
    public static boolean doubleX(String str) {
        boolean isX = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.length() < 2) {
                return false;
            }
            if (str.charAt(i) == 'x') {
                isX = true;
                if (str.charAt(i + 1) == 'x') {
                    return true;
                }
            }
            if (isX) {
                return false;
            }
        }
        return false;
    }
}
