package EasyChallenges;

/** 
* @author Travis Lewis
* Date: 5 April 2012
* 
* Challenge #36
* 
* 1000 Lockers Problem.
* In an imaginary high school there exist 1000 lockers labelled 1, 2, ..., 1000. 
* All of them are closed. 1000 students are to "toggle" a locker's state.  
* The first student toggles all of them 
* The second one toggles every other one (i.e, 2, 4, 6, ...)  
* The third one toggles the multiples of 3 (3, 6, 9, ...) and so on until all 
* students have finished.
* 
* To toggle means to close the locker if it is open, and to open it if it's closed.
* 
* How many and which lockers are open in the end?
*/
public class LockerProblem {

	public static void lockerProblem()
	{
		boolean lockers [] = new boolean[1001];
		
		for(int i = 0 ; i < 1001 ; i++)
			lockers[i] = false;
		
		for(int i = 1 ; i < 1001 ; i++)
			for(int j = i ; j < 1001; j+=i)
				lockers[j] = !lockers[j];
		
		int openlockers = 0;
		for(int i = 1 ; i < 1001 ; i++)
			if(lockers[i])
			{
				openlockers++;
				System.out.print(i + ", " + (openlockers % 5 == 0 ? "\n" : ""));
			}
		System.out.println("\ntotal open = " + openlockers);
	}
}
