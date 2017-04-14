package String2;

/**
 * Created by Wags on 4/14/17.
 */
public class CountCode {

    public static void main(String[] args) {
        System.out.print(countCode("codexxcode"));
    }

    /**
     * Return the number of times that the string "code"
     * appears anywhere in the given string, except
     * we'll accept any letter for the 'd', so "cope" and "cooe" count.
     * <p/>
     * countCode("aaacodebbb") → 1
     * countCode("codexxcode") → 2
     * countCode("cozexxcope") → 2
     *
     * @param str
     * @return
     */
    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-3; i++){
            String s = str.substring(i,i+2);
            String sd = str.substring(i+3, i+4);
            if (str.substring(i,i+2).contains("co") && str.substring(i+3, i+4).contains("e")){
                count++;
            }
        }
        return count;

    }
}
