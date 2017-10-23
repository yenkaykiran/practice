package yuown.learn.linkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		// list.insertAtHead(5);
		// list.insertAtHead(10);
		// list.insertAtHead(2);
		// list.insertAtHead(12);
		// list.insertAtHead(19);
		// list.insertAtHead(20);
		// list.insertAtHead(2);
		// list.insertAtHead(12);
		// list.insertAtHead(19);
		// list.insertAtHead(20);

		SingleLinkedNode node = list.insertAsSorted(1);
		list.insertAsSorted(5);
		list.insertAsSorted(6);
		list.insertAsSorted(18);
		list.insertAsSorted(10);
		list.insertAsSorted(12);

		System.out.println(list);

		System.out.println("Length: " + list.length());

		// list.removeHead();

		// System.out.println(list);
		System.out.println("5 found in list : " + list.search(5));
		System.out.println("15 found in list: " + list.search(15));
		// list.reverse();
		// System.out.println(list);
		// list.removeDuplicatesWithoutExtraMemory();
		System.out.println(list);
		list.removeNode(node);
		System.out.println(list);
		System.out.println("isCyclic: " + list.isCyclic());
	}
}
