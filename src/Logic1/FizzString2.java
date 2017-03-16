package Logic1;

/**
 * Created by Wags on 3/16/17.
 */
public class FizzString2 {
    public static void main(String[] args) {
        System.out.print(fizzString2(3));
    }

    /**
     * Given an int n, return the string form of the number followed by "!".
     * So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz"
     * instead of the number, and if the number is divisible by 5 use "Buzz", and
     * if divisible by both 3 and 5, use "FizzBuzz".
     * Note: the % "mod" operator computes the remainder after division,
     * so 23 % 10 yields 3. What will the remainder be when one number divides
     * evenly into another? (See also: FizzBuzz Code and Introduction to Mod)
     * <p/>
     * fizzString2(1) → "1!"
     * fizzString2(2) → "2!"
     * fizzString2(3) → "Fizz!"
     *
     * @param n
     * @return
     */
    public static String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0){
            return "FizzBuzz!";
        } else if (n % 3 == 0){
            return "Fizz!";
        } else if (n % 5 == 0){
            return "Buzz!";
        } else {
            return String.valueOf(n) +"!";
        }
    }
}
