package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class MakeAbba {
    public static void main(String[] args) {
        String str = "What";
        String str1 = "Up";
        System.out.print(makeAbba(str,str1));
    }

    /**
     * Given two strings, a and b, return the result of putting them together in the order abba,
     * e.g. "Hi" and "Bye" returns "HiByeByeHi".
     * makeAbba("Hi", "Bye") → "HiByeByeHi"
     * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
     * makeAbba("What", "Up") → "WhatUpUpWhat"
     * @param a
     * @param b
     * @return
     */
    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }
}
