
public class UnorderedList<T> {
	Node head;

	public void add(T data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
		} else {
			Node node = head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = n;
		}
	}

	public void remove(T item) {
		Node n = head;
		Node prev = null;
		while (!n.data.equals(item)) {
			prev = n;
			n = n.next;
		}
		prev.next = n.next;
	}

	public boolean search(T item) {
		Node n = head;
		while (n.next != null) {
			if (n.data.equals(item)) {
				return true;
			}
		}
		return false;
	}

	public void show() {
	}

}

class Node {

	public Node(Object data) {
		super();
		this.data = data;
	}

	Object data;
	Node next;
}
