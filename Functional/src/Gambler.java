import java.util.Random;
import java.util.Scanner;

public class Gambler {

	static void gamble(int n, int $stack, int $goal) {
		int i = 0, winCount = 0;
		while ($stack < $goal && i < n) {
			i++;
			if (win()) {
				$stack++;
				winCount++;
			} else
				$stack--;
		}
		if ($stack < $goal)
			System.out.println("gambler lost");
		else
			System.out.println("gambler won");
		System.out.println("won " + winCount + " times lost " + (n - winCount) + " times");
		System.out.println("win percentage " + (double) winCount / n * 100 + " lose percent is "
				+ (double) (n - winCount) / n * 100);
	}

	static boolean win() {
		Random r = new Random();
		boolean b = r.nextBoolean();
		return b;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, $stack, $goal;
		System.out.println("enter stack amount");
		$stack = s.nextInt();
		System.out.println("enter goal amount");
		$goal = s.nextInt();
		System.out.println("enter no of times to gamble");
		n = s.nextInt();
		s.close();
		gamble(n, $stack, $goal);

	}
}
