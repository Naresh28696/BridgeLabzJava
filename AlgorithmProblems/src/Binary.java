import java.util.Scanner;

public class Binary {

	static void showArr(int[] arr) {
		// System.out.println("array is ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	static boolean powerOf2(int n) {
		int i = 0, temp = (int) Math.pow(2, i);
		while (temp < n) {
			if (temp == n) {
				return true;
			}
		}
		return false;
	}

	static int[] swapNibbles(int[] arr) {
		int temp, j = arr.length - 4;
		for (int i = 0; i < 4; i++) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a no");
		int[] binary = Util.toBinary(s.nextInt());
		System.out.println("binary is ");
		showArr(binary);
		s.close();
		swapNibbles(binary);
		System.out.println("after swapping ");
		showArr(binary);
		int swapDec = Util.toDecimal(binary);
		System.out.println("decimal of swapped binary is " + swapDec);
		
		if (powerOf2(swapDec))
			System.out.println("its power of 2");
		else
			System.out.println("not power of 2");

	}
}
