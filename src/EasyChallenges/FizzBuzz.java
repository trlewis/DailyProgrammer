package EasyChallenges;

/**
 * @author Travis Lewis
 * Date: 13 April 2012
 * Challenge #39
 * 
 * You are to write a function that displays the numbers from 1 to an input
 * parameter n, one per line, except that if the current number is divisible 
 * by 3 the function should write �Fizz� instead of the number, if the current 
 * number is divisible by 5 the function should write �Buzz� instead of the 
 * number, and if the current number is divisible by both 3 and 5 the function 
 * should write �FizzBuzz� instead of the number.
 * 
 * For instance, if n is 20, the program should write 
 * 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 
 * 16, 17, Fizz, 19, and Buzz on twenty successive lines.
 */
public class FizzBuzz
{
    public static void showNum(final int number){
        for (int i = 1; i <= number; i++){
            String s = (i % 3 != 0 && i % 5 != 0) ? Integer.toString(i) : "";
            s += (i % 3 == 0) ? "Fizz" : "";
            s += (i % 5 == 0) ? "Buzz" : "";
            System.out.println(s);
        }
    }
}
