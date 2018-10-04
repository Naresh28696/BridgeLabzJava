import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
		System.out.println("enter size of array");
		int[] arr = new int[s.nextInt()];
		System.out.println("enter elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("enter element to search ");
		int n = s.nextInt();*/
		int[] arr = {1,2,3,4,5};
		int n = 2 ;
		int f = Utility.binary(arr, n);	
		if (f > 0)
			System.out.println("element found at index" + f);
		else
			System.out.println("not found");
	}
}
