import java.util.Scanner;

public class GuessGame {

	static int find(Scanner s) {

		int low = 0, high = 127, mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);
			int c = s.nextInt();
			mid = (low + high) / 2;
			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("guess a no between 0 to 127 ");
		s.next();
		System.out.println("guessed no is " + find(s));
	}
}
