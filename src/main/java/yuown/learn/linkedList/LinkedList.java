package yuown.learn.linkedList;

public class LinkedList {

	private Node head;

	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(head);
		head = newNode;
	}

	public void removeHead() {
		if (head != null) {
			head = head.getNextNode();
		}
	}

	@Override
	public String toString() {
		String result = "{";
		Node current = head;
		while (current != null) {
			result += current.toString() + ", ";
			current = current.getNextNode();
		}
		result += "}";
		return result;
	}

	public int length() {
		int length = 0;
		Node current = head;
		while (current != null) {
			current = current.getNextNode();
			length++;
		}
		return length;
	}

}

class Node {
	private int data;
	private Node nextNode;

	public Node(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "Data: " + data;
	}
}