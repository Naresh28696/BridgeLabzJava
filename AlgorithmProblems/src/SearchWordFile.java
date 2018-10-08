
/******************************************************************************
 * Compilation: javac -d bin MonthlyPayment.java Execution: java -cp bin
 * com.bridgelabz.util.MonthlyPayment n
 * 
 * Purpose: to read the file and check if the word is in the file or not
 *
 * @author chiragkatare
 * @version 1.0
 * @since 04/10/2018
 *
 ******************************************************************************/
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchWordFile {
	/**
	 * Function to read the file and return
	 * 
	 * @param f the file which to read
	 * @return the string which to read
	 * @throws IOException
	 */
	public static String[] fileRead(File f) throws IOException {
		String word = "";
		ArrayList<String> s1 = new ArrayList<String>();
		FileReader fr = new FileReader(f);
		int c;
		while ((c = fr.read()) != -1) {
			if (c == 32) {
				s1.add(word);
				word = "";
			} else {
				word = word + String.valueOf((char) c);
			}
		}
		fr.close();
		String[] s = new String[s1.size()];
		s1.toArray(s);
		return s;
	}

	/**
	 * Main function to test the class
	 * 
	 * @param args
	 * @throws Exception if input is not correct
	 */
	public static void main(String[] args) throws Exception {
		File f = new File("/home/bridgelabz/chiragCodes/akku.txt");
		try {
			Scanner s = new Scanner(System.in);
			String arr[] = fileRead(f);
			for (String string : arr) {
				System.out.println(string);
			}
			System.out.println("enter name to search");
			String s1 = s.nextLine();
			int i = Utility.binary(arr, s1);
			if (i < 0)
				System.out.println("not found");
			else
				System.out.println("found");
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception");
		}
	}
}
