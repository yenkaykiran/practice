package yuown.learn.linkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtEnd(5);
		list.insertAtEnd(10);
		list.insertAtEnd(2);
		list.insertAtEnd(12);
		list.insertAtEnd(19);
		list.insertAtEnd(20);

		System.out.println(list);
	}
}
