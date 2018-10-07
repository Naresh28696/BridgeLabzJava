/******************************************************************************
	 * Compilation: javac -d bin DateDay.java Execution: java -cp bin
	 * com.bridgelabz.util.DateDay n
	 * 
	 * Purpose:  to read a date from user and give the on that day as out put
     *
	 * @author chiragkatare
	 * @version 1.0
	 * @since 04-10-2018
	 *
	 ******************************************************************************/

import java.util.Scanner;

public class DateDay {
	
	
 /**
  *    main function to test the class
  */
	public static void main(String[] args) {
		int d, m, y;
		Scanner s = new Scanner(System.in);
		System.out.println("enter date in day month year");
		d = s.nextInt();
		m = s.nextInt();
		y = s.nextInt();
		System.out.println("day is "+Util.dayOfWeek(d, m, y));
		s.close();
		
	}
}
