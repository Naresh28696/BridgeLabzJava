import java.util.Scanner;

public class HarmonicNo {
	static double harmonic(int n) {
		double h = 1;
		for (double i = 2; i <= n; i++) {
			h = h + 1 / i;
		}
		return h;
	}

	public static void main(String[] ars) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter harmonic no to find");
		int n = s.nextInt();
		System.out.println(harmonic(n));
		
		s.close();
	}
}
