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
	    System.out.println("hi: " + T9Spelling.convertToT9("hi"));
	    System.out.println("yes: " + T9Spelling.convertToT9("yes"));
	    System.out.println("foo  bar: " + T9Spelling.convertToT9("foo  bar"));
	    System.out.println("hello world: " + T9Spelling.convertToT9("hello world"));
	}

	public static void monty(final int doors)
	{
	    System.out.println("Monty hall problem with " + doors + " doors:");
	    System.out.println(MontyHall.montyHall(doors, 10000));
	}
}
