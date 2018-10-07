/******************************************************************************
 * Compilation: javac -d bin Prime.java Execution: java -cp bin
 * com.bridgelabz.util.Prime n
 * 
 * Purpose: to find the prime no between 0 to 1000 an if they are pallindrome or anagram or not
 *
 * @author chiragkatare
 * @version 1.0
 * @since 04/10/2018
 *
 ******************************************************************************/
public class Prime {
	public static void main(String[] args) {
		System.out.println("prime between 0 to 1000");
		Utility.prime();
		System.out.println("prime no between 0 to 1000 also pallindrome");
		Utility.primePallindrome();
		System.out.println("prime and anagrams");
		Utility.primeAnagrams();
	}
}
