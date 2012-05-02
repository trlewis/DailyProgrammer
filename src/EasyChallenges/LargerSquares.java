package EasyChallenges;

/**
 * @author Travis Lewis
 * Date: 6 April 2012
 * Challenge #34
 * 
 * A very basic challenge:
 * 
 * Define a procedure that takes three numbers as arguments and returns 
 * the sum of the squares of the two larger numbers.
 * 
 * Your task is to write the indicated function.
 */
public class LargerSquares {
	public static int getSquare(final int the_first, final int the_second, final int the_third)
	{
		if(the_first <= the_second && the_first <= the_third)
			return (the_second * the_second) + (the_third * the_third);
		else if(the_second <= the_first && the_second <= the_third)
			return (the_first * the_first) + (the_third * the_third);
		else
			return (the_second * the_second) + (the_first * the_first);
	}
}
