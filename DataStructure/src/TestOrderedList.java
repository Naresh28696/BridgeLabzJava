
/******************************************************************************
 * Purpose: Read the Text from a file, split it into words and arrange it as Linked List.
 *  Take a user input to search a Word in the List. If the Word is not found then add 
 *  it to the list, and if it found then remove the word from the List. 
 *  In the end save the list into a file
 *
 * @author chiragkatare
 * @version 1.0
 * @since 08-10-2018
 *
 ******************************************************************************/
import java.io.File;
import java.util.Scanner;

/**
 * importing custom ordred list
 */
import customDataStruc.OrderedLIst;

public class TestOrderedList {

	static void addRemove(int num, OrderedLIst<Integer> list) {
		if (list.search(num)) {
			list.remove(num);
			System.out.println("found and removed");
			System.out.println(list);
		} else {
			list.add(num);
			System.out.println("number not found hence added");
			System.out.println(list);
		}
	}

	/**
	 * Main function to test the class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		OrderedLIst<Integer> list = new OrderedLIst<>();
		Scanner s = new Scanner(System.in);
		System.out.println("how many no to enter");
		int n = s.nextInt();
		System.out.println("enter no");
		for (int i = 0; i < n; i++) {
			System.out.println("enter " + i + " no");
			list.add(s.nextInt());
		}
		System.out.println("enter no to search");
		int number = s.nextInt();
		addRemove(number, list);

	}
}
