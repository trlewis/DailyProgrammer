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
	    int[] a = new int[] {1,5,7,8};
	    int[] b = new int[] {2,3,4,7,9};
	    
	    int[] c = MergeSorted.combineLists(a, b);
	    
	    MergeSorted.printTest(new int[] {1,5,7,8}, new int[] {2,3,4,7,9});
	    
	    System.out.println("------------------------------");
	    
	    //expected: 1, 2, 3, 7, 15, 19, 20, 21, 22, 23, 24, 25, 25, 25
	    MergeSorted.printTest(new int[] {1,3,7,19,20,25}, 
	            new int[] {2,15,21,22,23,24,25,25});
	    
	    
	    System.out.println("------------------------------");
	    
	    //expected: 1, 2, 4, 5, 8, 9, 12, 12, 13
	    MergeSorted.printTest(new int[] {4,5,8,12}, new int[] {1,2,9,12,13});
	}
	

	public static void monty(final int doors)
	{
	    System.out.println("Monty hall problem with " + doors + " doors:");
	    System.out.println(MontyHall.montyHall(doors, 10000));
	}
}
