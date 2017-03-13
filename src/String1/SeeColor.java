package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class SeeColor {
    public static void main(String[] args) {
        System.out.print(seeColor("bluexxx"));
    }

    /**
     * Given a string, if the string begins with "red" or "blue"
     * return that color string, otherwise return the empty string.
     * seeColor("redxx") → "red"
     * seeColor("xxred") → ""
     * seeColor("blueTimes") → "blue"
     *
     * @param str
     * @return
     */
    public static String seeColor(String str) {
        if (str.startsWith("red")){
            return "red";
        } else if (str.startsWith("blue")){
            return "blue";
        }
        return "";
    }

}
