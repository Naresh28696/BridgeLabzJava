import java.util.Scanner;

public class Username {
public static void main(String[] args) {
	String st = "Hello <<UserName>>, How are you?";
	Scanner s = new Scanner(System.in);
	System.out.println("enter username");
	String name = s.nextLine();
	st = st.replaceAll("<<UserName>>", name);
	System.out.println(st);
}
}
