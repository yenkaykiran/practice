package yuown.learn.linkedList;

public class QueueWithLinkedList {

	private DoublyLinkedNode head;
	private DoublyLinkedNode tail;

	public void enqueue(Object data) {
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		if (head == null) {
			head = newNode;
		}
		if(null == tail) {
			tail = newNode;
		} else {
			tail.setRight(newNode);
			tail = newNode;
		}
	}

	public Object dequeue() throws RuntimeException {
		Object data;
		if (head == null) {
			throw new RuntimeException("Queue is Empty");
		}
		data = head.getData();
		head = head.right();
		return data;
	}
	
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public String toString() {
		String result = "{";
		DoublyLinkedNode current = head;
		while (null != current) {
			result += current;
			current = current.right();
			if (current != null) {
				result += ", ";
			}
		}
		result += "}";
		return result;
	}

}
