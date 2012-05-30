import EasyChallenges.*;
import IntermediateChallenges.*;
import DifficultChallenges.*;

public class MainClass
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
	    String str = BaseConverter.convertToBaseX(12345678 , 23);
	    System.out.println(str);
	    System.out.println(BaseConverter.isPalindrome("abccba"));
	    System.out.println(BaseConverter.isPalindrome("abcba"));
	    System.out.println(BaseConverter.isPalindrome("abcdba"));
	    System.out.println(BaseConverter.isPalindrome("abcefecgba"));
	    System.out.println(BaseConverter.isPalindrome(str));
	    
	    boolean palindrome = false;
	    int num = 10858;
	    //int base = 2;
	    //while(!palindrome) {
	    for(int base = 2 ; base <= 36 ; base++) {
	        String conv = BaseConverter.convertToBaseX(num, base);
	        System.out.print(num + " in base " + base + ": " + conv);
	        palindrome = BaseConverter.isPalindrome(conv);
	        conv = palindrome ? " palindrome" : "";
	        System.out.println(conv);
	       
	    }
	    convertBase(19959694, 35);
	    String ls = "376609378180550";
        convertBase(Long.parseLong(ls), 29);
	}
	
	public static void convertBase(long number, int base) {
	       System.out.println(number + " in base " + base + " is: " + BaseConverter.convertToBaseX(number, base));
	}

	public static void monty(final int doors)
	{
	    System.out.println("Monty hall problem with " + doors + " doors:");
	    System.out.println(MontyHall.montyHall(doors, 10000));
	}
}
