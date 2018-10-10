package customDataStruc;

public class Test {

	public static void main(String[] args) {
		Dequeue<Integer> qq = new Dequeue<>();
		qq.addfront(6);
		qq.addfront(7);
		System.out.println(qq);
		qq.removeFront();
		//qq.removeFront();
		System.out.println(qq);
		System.out.println(qq);
		// System.out.println(qq.capacity);
	}
}
