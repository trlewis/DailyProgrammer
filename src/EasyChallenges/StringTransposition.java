package EasyChallenges;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Travis Lewis
 * Date: 19 Sep 2013
 * Challenge #137
 * 
 * This challenge entails rotating a series of strings 90 degrees
 * 
 * First read an integer N, this is the number of strings to read.
 * 
 * Then read N strings, after the last string is read, rotate and print.
 * 
 * Sample input:
 * 5
 * Kernel
 * Micro
 * Register
 * Memory
 * Operator
 * 
 * Sample output:
 * KMRMO
 * eieep
 * rcgme
 * nrior
 * eosra
 * l tyt
 *   e o
 *   r r
 */
public class StringTransposition {
	
	private static final int MIN_NUM_STRINGS = 1;
	private static final int MAX_NUM_STRINGS = 13;

	// I'll just start putting main() in each challenge so I don't have to
	// rewrite a single main() every time I do/check a challenge.
	public static void main(String[] args) {
		String prompt = "Enter number of strings to transpose ("
				+ MIN_NUM_STRINGS + "-" + MAX_NUM_STRINGS + "): ";
		
		String readin = "";
		Scanner scan = new Scanner(System.in);
		int num = MIN_NUM_STRINGS - 1;
		
		// get the number of lines
		while(num < MIN_NUM_STRINGS) {
			System.out.print(prompt);
			readin = scan.nextLine();
			if(isValidNumber(readin))
				num = Integer.parseInt(readin);
		}		
		
		// get the strings to transpose
		ArrayList<char[]> arr = new ArrayList<char[]>();
		int longest = -1;
		for(int i = 0 ; i < num ; i++) {
			readin = scan.nextLine();
			readin.trim();
			if(readin.length() > longest)
				longest = readin.length();
			arr.add(readin.toCharArray());
		}
		scan.close();
		
		//print out the transposed strings
		for(int i = 0 ; i < longest ; i++) 
			printTransLine(arr, i);
	}
	
	private static boolean isValidNumber(String s) {
		try{
			int val = Integer.parseInt(s);
			if(val < MIN_NUM_STRINGS || val > MAX_NUM_STRINGS) {
				System.out.println("Number not within acceptable range ("
						+ MIN_NUM_STRINGS + "-" + MAX_NUM_STRINGS + ")\n");
				return false;
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Unparsable value, integers only please.\n");
			return false;
		}
		return true;
	}
	
	private static void printTransLine(ArrayList<char[]> arr, int pos) {
		for(char[] cstr : arr) {
			if(pos >= cstr.length) {
				System.out.print(' ');
				continue;
			}
			System.out.print(cstr[pos]);
		}
		System.out.println("");
	}
}
