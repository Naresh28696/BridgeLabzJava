
/******************************************************************************
	 * Purpose:  Program to find the square root of a given nos
     *
	 * @author chiragkatare
	 * @version 2.0   
	 * @since 05-10-2018
	 *
	 ******************************************************************************/
import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no to find square root");
		double c = s.nextDouble();
		System.out.println("square root is " + Util.sqrt(c));
		s.close();

	}
}
