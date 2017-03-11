package Warmup1;

/**
 * Created by Wags on 3/11/17.
 */
public class SleepIn {
    public static void main(String[] args) {
        System.out.println(sleepIn(false,false));
    }

    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true
     * if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     * sleepIn(false, false) → true
     * sleepIn(true, false) → false
     * sleepIn(false, true) → true
     * @param weekday
     * @param vacation
     * @return
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {
            return true;
        } else {
            return false;
        }
    }
}
