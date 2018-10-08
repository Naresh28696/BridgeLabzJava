
/******************************************************************************
 * Compilation: javac -d bin BinarySearch.java Execution: java -cp bin
 * com.bridgelabz.util.PrimeChecker n
 * 
 * Purpose: Searche a prime no is in array or not using binary search
 *
 * @author chiragkatare
 * @version 1.0
 * @since 04-10-2018
 *
 ******************************************************************************/

import java.util.Scanner;

public class BinarySearch {
	 /**
	  * Main method to test the class
	  * 
	  * @param args
	  * @throws Exception if input is not integer
	  */
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("enter size of array");
			int[] arr = new int[s.nextInt()];
			System.out.println("enter elements");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = s.nextInt();
			}
			System.out.println("enter element to search ");
			int n = s.nextInt();
			// int[] arr = { 1, 2, 3, 4, 5 };
			int f = Utility.binary(arr, n);
			if (f > 0)
				System.out.println("element found at index" + f);
			else
				System.out.println("not found");
		} catch (Exception e) {
			System.out.println("enter correct input is integer ");
		} finally {
			s.close();
		}

	}
}
