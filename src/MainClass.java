import EasyChallenges.*;

public class MainClass
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[] prices = {150,24,79,50,88,345,3};
		System.out.println(StoreCredit.findTwo(prices, 200));
		prices = new int[] {5,75,25};
		System.out.println(StoreCredit.findTwo(prices, 100));
		prices = new int[] {2,1,9,4,4,56,90,3};
		System.out.println(StoreCredit.findTwo(prices, 8));
		System.out.println(StoreCredit.findTwo(prices, 2));
	}

}
