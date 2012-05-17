package EasyChallenges;

import java.util.Arrays;

/**
 * @author Travis Lewis
 * Date: 17 May 2012
 * Challenge # 53
 * 
 * Write a function that given two sorted lists, returns a list with the two 
 * lists merged together into one sorted list.
 * 
 * So, for instance, for inputs [1,5,7,8] and [2,3,4,7,9] it should return 
 * [1,2,3,4,5,7,7,8,9].
 * 
 * Try and make your code as efficient as possible.
 */
public class MergeSorted {
    public static int[] combineLists(final int[] listA, final int[] listB) {
        int[] result = new int[listA.length + listB.length];
        
        int a = 0, b = 0, i = 0;
        
        while(i < result.length) {
            if(a < listA.length && b < listB.length)
                result[i++] = (listA[a] <= listB[b]) ? listA[a++] : listB[b++];
            else if(a < listA.length)
                result[i++] = listA[a++];
            else
                result[i++] = listB[b++];
        }
        return result;
    }
    
    public static void printTest(final int[] a, final int[] b) {
        int[] c = combineLists(a,b); 

        System.out.println("List A: \n" + Arrays.toString(a));
        System.out.println("List B: \n" + Arrays.toString(b));
        System.out.println("Result C:\n" + Arrays.toString(c));
    }
}
