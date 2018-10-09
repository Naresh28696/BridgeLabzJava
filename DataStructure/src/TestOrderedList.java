
import customDataStruc.OrderedLIst;

public class TestOrderedList {
	public static void main(String[] args) {

		OrderedLIst<Integer> list = new OrderedLIst<>();
		list.add(4);
		System.out.println(list);
		list.add(1);
		System.out.println(list);
		list.add(3);
		System.out.println(list);
		list.add(2);
		System.out.println("added");
		System.out.println(list);

	}
}
