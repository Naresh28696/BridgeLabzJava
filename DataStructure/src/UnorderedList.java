
public class UnorderedList<T> {
	Node head;

	/**
	 * function to add a new item in the list and returns nothing
	 * 
	 * @param data the item which to be added
	 */
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

	/**
	 * Function to remove the item from the list
	 * 
	 * @param item
	 */
	public void remove(T item) {
		Node n = head;
		Node prev = null;
		while (!n.data.equals(item)) {
			prev = n;
			n = n.next;
		}
		prev.next = n.next;
	}

	/**
	 * function to search the item in the list
	 * 
	 * @param item the item to be searched
	 * @return true if found and false if not found
	 */
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
