
/******************************************************************************
 * Purpose: Program to Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N 
 *
 * @author chiragkatare
 * @version 2.0
 * @since 08-10-2018
 *
 ******************************************************************************/
import java.util.Scanner;

public class HarmonicNo {
	/**
	 * Function to calculate the nth harmonic no
	 * @param n the value of harmonic no
	 * @return
	 */
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
