package String2;

/**
 * Created by Wags on 4/14/17.
 */
public class GetSandwich {
    public static void main(String[] args) {
        System.out.println("Expected: jam, Received: " + getSandwich("breadjambread"));
        System.out.print("Expected: jam, Received: " + getSandwich2("breadjambread"));
    }

    /**
     * A sandwich is two pieces of bread with something in between.
     * Return the string that is between the first and last appearance
     * of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
     * <p/>
     * getSandwich("breadjambread") → "jam"
     * getSandwich("xxbreadjambreadyy") → "jam"
     * getSandwich("xxbreadyy") → ""
     *
     * @param str
     * @return
     */
    public static String getSandwich(String str) {
        int f = str.indexOf("bread");
        int l = str.lastIndexOf("bread");
        if (f == l ){
            return "";
        }
        return str.substring(f + 5, l);
    }

    /**
     * Without special methods
     * @param str
     * @return
     */
    public static String getSandwich2(String str){
        int first = 0;
        int last = 0;
        boolean isFound = false;

        if (str.length()<= 10){
            return "";
        }

        for (int i = 0; i < str.length()-4; i++){
            if (str.substring(i,i+5).contains("bread") && isFound == true){
                last = i;
            }
            if (str.substring(i,i+5).contains("bread") && isFound == false){
                first = i+5;
                isFound = true;
            }
        }
        return str.substring(first, last);
    }
}
