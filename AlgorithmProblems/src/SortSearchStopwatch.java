import java.util.Scanner; 

public class SortSearchStopwatch {
	static Scanner s = new Scanner(System.in);
	static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27 };
	static String[] ar = { "aa", "bb", "cc", "dd", "ee" };

	static void stopWatch() {
		System.out.println("enter int to search");
		int n = s.nextInt();
		long t1 = System.currentTimeMillis();
		int index = Utility.binary(arr, n);
		long t2 = System.currentTimeMillis();
		System.out.println("found at index "+index+" in total time "+(t2-t1)+" milliSeconds");
	}

	public static void main(String[] args) {
		// int arr[] = {1,2,3,4,5,6,7,8,9};
		// String[] ar = {"aa","bb","cc","dd","ee"};
		 SortSearchStopwatch.stopWatch();

	}
}
