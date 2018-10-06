import java.util.Scanner;

public class PowerOf2 {
	static void printTable(int pow) {
		int val = 1;
		for (int i = 1; i <= pow; i++) {
			val = val * 2;
			System.out.println(val);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter to find power of 2 less than 32");
		int pow = s.nextInt();
		while (pow > 31) {
			System.out.println("invalid input ");
			System.out.println("enter value less than 32");
			pow = s.nextInt();
		}
		printTable(pow);
		s.close();
	}
}
