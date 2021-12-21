package yuown.model;

public class LinkedListNode {

	private LinkedListNode next;

	private int data;

	public LinkedListNode(int data) {
		this.data = data;
	}

	public void addToEnd(int data) {
		LinkedListNode n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = new LinkedListNode(data);
	}

	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void printList() {
		LinkedListNode n = this;
		while(n.next != null) {
			System.out.print(n.data + " > ");
			n = n.next;
		}
		System.out.println(n.data);
	}
	
	public LinkedListNode reverseAndClone() {
		LinkedListNode head = null;
		LinkedListNode n = this;
		while(n != null) {
			LinkedListNode n1 = new LinkedListNode(n.getData());
			n1.setNext(head);
			head = n1;
			n = n.getNext();
		}
		return head;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean flag = true;
		LinkedListNode current = this;
		LinkedListNode other = (LinkedListNode) obj;
		while(current != null && other != null) {
			if(current.getData() != other.getData()) {
				flag = false;
				break;
			}
			current = current.next;
			other = other.next;
		}
		return flag;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		LinkedListNode n = this;
		while(n.next != null) {
			sb.append(n.data + " > ");
			n = n.next;
		}
		sb.append(n.data);
		return sb.toString();
	}
}
