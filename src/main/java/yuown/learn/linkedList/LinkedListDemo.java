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

		System.out.println(list.kThFromLast(1));
		System.out.println(list.kThFromLast(2));
		System.out.println(list.kThFromLast(3));
		System.out.println(list.kThFromLast(4));
		System.out.println(list.kThFromLast(5));
		System.out.println(list.kThFromLast(6));
	}
}
