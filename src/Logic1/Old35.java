package Logic1;

/**
 * Created by Wags on 3/15/17.
 */
public class Old35 {

    public static void main(String[] args) {
        System.out.print(old35(15));
    }

    /**
     * Return true if the given non-negative number is a
     * multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod
     * old35(3) → true
     * old35(10) → true
     * old35(15) → false
     *
     * @param n
     * @return
     */
    public static boolean old35(int n) {
        if ((n % 3 == 0 && !(n % 5 == 0))) {
            return true;
        } else if (!(n % 3 == 0) && (n % 5 == 0)){
            return true;
        } else {
            return false;
        }
    }
}