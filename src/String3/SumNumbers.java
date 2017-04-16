package String3;

/**
 * Created by Wags on 4/16/17.
 */
public class SumNumbers {
    public static void main(String[] args) {
        System.out.println("Expected: 18, Received: " + sumNumbers("7 11"));
    }

    /**
     * Given a string, return the sum of the numbers appearing in
     * the string, ignoring all other characters. A number is a
     * series of 1 or more digit chars in a row. (Note: Character.isDigit(char)
     * tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
     * <p/>
     * sumNumbers("abc123xyz") → 123
     * sumNumbers("aa11b33") → 44
     * sumNumbers("7 11") → 18
     *
     * @param str
     * @return
     */
    public static int sumNumbers(String str) {
        int sum = 0;
        String summ = "";
        str = str + " ";
        boolean isDigit = false;
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if (isDigit && Character.isDigit(str.charAt(i))) {
                summ += str.charAt(i);
            } else if (Character.isDigit(str.charAt(i))) {
                summ += str.charAt(i);
                isDigit = true;
            } else {
                if (summ != "" && isDigit == true) {
                    sum += Integer.parseInt(summ);
                    summ = "";
                }
                isDigit = false;

            }
        }
        return sum;

    }
}
