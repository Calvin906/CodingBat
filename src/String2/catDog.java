package String2;

/**
 * Created by Wags on 4/14/17.
 */
public class CatDog {

    public static void main(String[] args) {
        System.out.println(catDog("catdogcat"));
    }

    /**
     * Return true if the string "cat" and "dog" appear the same number of times in the given string.
     * <p/>
     * catDog("catdog") → true
     * catDog("catcat") → false
     * catDog("1cat1cadodog") → true
     *
     * @param str
     * @return
     */
    public static boolean catDog(String str) {
        int cDog = 0;
        int cCat = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).contains("cat")) {
                cCat++;
            }
            if (str.substring(i, i + 3).contains("dog")) {
                cDog++;
            }
        }

        if (cCat == cDog) {
            return true;
        } else {
            return false;
        }
    }

}
