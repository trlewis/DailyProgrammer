package EasyChallenges;

/**
 * @author Travis Lewis
 * Date: 10 May 2012
 * Challenge #50
 * 
 * You receive a credit C at a local store and would like to buy two items. 
 * You first walk through the store and create a list L of all available 
 * items. From this list you would like to buy two items that add up to the 
 * entire value of the credit. The solution you provide will consist of the 
 * two integers indicating the positions of the items in your list (smaller 
 * number first).
 * 
 * For instance, with C=100 and L={5,75,25} the solution is 2,3; with C=200 
 * and L={150,24,79,50,88,345,3} the solution is 1,4; and with C=8 and 
 * L={2,1,9,4,4,56,90,3} the solution is 4,5.
 */
public class StoreCredit
{
    public static String findTwo(final int[] items, final int credit){
        for(int i = 0; i < items.length - 1; i++){
            if(items[i] > credit)
                continue;
            for(int j = i + 1; j < items.length; j++)
                if(items[i] + items[j] == credit)
                    return String.valueOf(i+1) + ", " + String.valueOf(j+1);
        }
        return "no solution";
    }
}
