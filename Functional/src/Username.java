
/******************************************************************************
 * Purpose: User Input and Replace String Template “Hello <<UserName>>, How are you?”
 *
 * @author chiragkatare
 * @version 1.0
 * @since 08-10-2018
 *
 ******************************************************************************/
import java.util.Scanner;

public class Username {
	public static void main(String[] args) {
		String st = new String("Hello <<UserName>>, How are you?");
		Scanner s = new Scanner(System.in);
		System.out.println("enter username");
		String name = s.nextLine();
		st = st.replaceAll("<<UserName>>", name);
		System.out.println(st);
		s.close();
	}
}
