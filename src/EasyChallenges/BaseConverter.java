package EasyChallenges;

/**
 * @author Travis Lewis
 * Date: 30 May 2012
 * Challenge #58
 *
 *As computer programmers are well aware, it can be very useful to write numbers
 * using numerical bases other than the familiar base 10 notation we use in
 * everyday life. In computer programming, base 2 and base 16 are especially handy. 
 * In base 2, the number 1234 becomes 10011010010 and in base 16 it becomes 4D2.
 * 
 * Because there are only 10 regular digits, when numbers are written in base 16, 
 * the first few letters of the alphabet are added to represent the remaining 
 * required digits, so 'A' stands in for 10, 'B' for 11, 'C' for 12, 'D' for 13, 
 * 'E' for 14 and 'F' for 15.
 * 
 * Of course, this trick of adding letters to stand in for numbers allows us to 
 * represent higher bases than 16; if you can use all letters of the alphabet, 
 * you can represent bases up to base 36 (because there are ten regular digits 
 * and 26 "letter-digits"). So for instance, 12345678 becomes 1L2FHE in base 23 
 * and 4IDHAA in base 19.
 * 
 * Write a program that will take a number and convert it to any base between 
 * 2 and 36. Have the program print out 19959694 in base 35 and 376609378180550 
 * in base 29.
 * 
 * NOTE: Many languages have this built in as a library function. For instance, 
 * in Java, the function Integer.toString(i, radix) does exactly this. However, 
 * the entire point of this challenge is to write the program yourself, so you are 
 * not allowed to use any library functions like this.
 */
public class BaseConverter {
    static char[] values = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    
    public static String convertToBaseX(long number, final int base) {
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            sb.append(values[(int)(number % base)]);
            number /= base;
        }
        return sb.reverse().toString();
    }
    
    public static boolean isPalindrome(final String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb.reverse().toString().equals(str);
    }
    
}

