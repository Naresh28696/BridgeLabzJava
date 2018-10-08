
/**********************************************************************************
	 * Purpose:  Flip Coin and print percentage of Heads and Tails
     *
	 * @author chiragkatare
	 * @version 2.0   
	 * @since 05-10-2018
	 *
	 ******************************************************************************/
import java.util.Scanner;

public class FlipCoin {

	/**
	 * Function to find the percent of flipped coins
	 * 
	 * @param times the value for no of times flip
	 */
	static void flipPerc(int times) {
		double heads = 0;
		for (int i = 0; i < times; i++) {
			if (Math.random() > 0.5) {
				heads++;
			}
		}
		System.out.println("heads percentage is " + (float) (heads / times) * 100);
		System.out.println("tails percentage is " + (float) (times - heads) / times * 100);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter  no of times  to flip the coin");
		int times = s.nextInt();
		flipPerc(times);
		s.close();
	}
}
