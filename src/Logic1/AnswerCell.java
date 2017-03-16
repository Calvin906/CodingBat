package Logic1;

/**
 * Created by Wags on 3/16/17.
 */
public class AnswerCell {

    public static void main(String[] args) {
        System.out.print(answerCell(false, false, false));
    }


    /**
     * Your cell phone rings. Return true if you should answer it.
     * Normally you answer, except in the morning you only answer if
     * it is your mom calling. In all cases, if you are asleep, you do not answer.
     * answerCell(false, false, false) → true
     * answerCell(false, false, true) → false
     * answerCell(true, false, false) → false
     *
     * @param isMorning
     * @param isMom
     * @param isAsleep
     * @return
     */
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isMom && !isAsleep){
            return true;
        } else if (!isAsleep && !isMorning){
            return true;
        } else {
            return false;
        }
    }
}
