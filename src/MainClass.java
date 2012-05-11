import EasyChallenges.*;
import IntermediateChallenges.*;

public class MainClass
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println(ASCIIDirectory.printDirectory("/home/econobeing/stuff/testDir/", 1));
	    
	    //ASCIIDirectory.listDir("/home/econobeing/programming/", 10, 2);
	}

	public static void monty(final int doors)
	{
	    System.out.println("Monty hall problem with " + doors + " doors:");
	    System.out.println(MontyHall.montyHall(doors, 10000));
	}
}
