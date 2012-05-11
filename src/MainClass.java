import EasyChallenges.*;

public class MainClass
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		for(int i = 2 ; i < 101 ; i++)
		{
		    monty(i);
		}
	}

	public static void monty(final int doors)
	{
	    System.out.println("Monty hall problem with " + doors + " doors:");
	    System.out.println(MontyHall.montyHall(doors, 10000));
	}
}
