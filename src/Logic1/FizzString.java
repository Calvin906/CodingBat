package Logic1;

/**
 * Created by Wags on 3/16/17.
 */
public class FizzString {

    public static void main(String[] args) {
        System.out.print(fizzString("fib"));
    }

    /**
     * Given a string str, if the string starts with "f" return "Fizz".
     * If the string ends with "b" return "Buzz". If both the "f" and "b"
     * conditions are true, return "FizzBuzz". In all other cases,
     * return the string unchanged. (See also: FizzBuzz Code)
     * <p/>
     * fizzString("fig") → "Fizz"
     * fizzString("dib") → "Buzz"
     * fizzString("fib") → "FizzBuzz"
     *
     * @param str
     * @return
     */
    public static String fizzString(String str) {
        if (str.charAt(0) == 'f'){
            if (str.charAt(str.length()-1) == 'b'){
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (str.charAt(str.length()-1) == 'b'){
            return "Buzz";
        } else {
            return str;
        }
    }
}
