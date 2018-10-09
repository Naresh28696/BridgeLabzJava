package customDataStruc;

public class OrderedLIst<T> {
	Node head;
	int size = 0;

	/**
	 * function to add a new item in the list and returns nothing
	 * 
	 * @param data the item which to be added
	 */
	public void add(T data) {
		/*
		 * creates an new node with data traverse list till last adds the node as the
		 * last node and save head node as n
		 */
		Node n = new Node(data);
		Node node = head;
		Node prev = null;
		if (head == null) {
			head = n;
			size++;
		} else if (n.data.hashCode() < head.data.hashCode()) {
			head = n;
			n.next = node;
			size++;
		} else {
			while (node.data.hashCode() < n.data.hashCode()) {
				System.out.println(node.data);
				prev = node;
				node = node.next;
			}
			// adds the node as last node
			n.next = node;
			prev.next = n;
			size++;
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
		if (head.data.equals(item)) {
			head = head.next;
			size -= 1;
			return;
		}
		while (!n.data.equals(item)) {
			prev = n;
			n = n.next;
		}
		n = n.next;
		prev.next = n;
		n = null;
		size -= 1;
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
			n = n.next;
		}
		return false;
	}

	/**
	 * function to check if the list is empty or not
	 * 
	 * @return true if empty and false if not empty
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	/**
	 * Funtion to check the size of list and return it
	 * 
	 * @return the size of the list
	 */
	public int size() {
		return size;
	}

	/**
	 * Function to return the index of the item assuming it is present
	 * 
	 * @param item the item to return the index of
	 * @return the index of the passed item
	 */
	public int index(T item) {
		int index = 0;
		Node n = head;
		while (!n.data.equals(item)) {
			n = n.next;
			index++;
		}
		return index;

	}

	/**
	 * function to remove the item from the last of list and return it
	 * 
	 * @return the last element of list after removing
	 */
	public T pop() {
		Node n = head;
		Node prev = null;
		while (n.next != null) {
			prev = n;
			n = n.next;
		}
		prev.next = null;
		size -= 1;
		return (T) n.data;
	}

	/**
	 * Function to return the element at the given position
	 * 
	 * @param pos the index at which the item to return
	 * @return the element at the given index after removing it
	 */
	public T pop(int pos) {
		int index = 0;
		Node n = head;
		if (pos == 0) {
			head = head.next;
			return (T) n.data;
		}
		Node prev = null;
		while (index != pos) {
			prev = n;
			n = n.next;
			index++;
		}
		prev.next = n.next;
		size -= 1;
		return (T) n.data;
	}

	/**
	 * overriden method to give elents of list as string
	 */
	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("[ ");
		Node node = head;
		while (node != null) {
			s.append(node.data);
			node = node.next;
			s.append(",");
		}
		s.append(" ]");
		return s.toString();
	}

	/**
	 * method to show the items in the list
	 */
	public void show() {
		System.out.println(toString());
	}

}
