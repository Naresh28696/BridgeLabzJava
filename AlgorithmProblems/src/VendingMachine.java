import java.util.Scanner;

public class VendingMachine {
	static int i, total;
	static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };
	static int notesNo;

	static void notes(int value) {
		if (value / notes[i] != 0) {
			total += (value / notes[i]);
			System.out.println(notes[i] + "rs notes :" + value / notes[i]);
			value = value % notes[i];
		}
		i++;
		if (value == 0) {
			System.out.println("total notes :"+total );
			return;
		}

		notes(value);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter amoumt");
		int value = s.nextInt();
		notes(value);
	}
}
