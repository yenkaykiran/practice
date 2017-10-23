package yuown.learn.linkedList;


public class StackWithLinkedList {

	private DoublyLinkedNode top = null;

	public void push(Object data) {
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		newNode.setLeft(top);
		if (top != null) {
			top.setRight(newNode);
		}
		top = newNode;
	}

	public Object peek() {
		Object data;
		if (top == null) {
			throw new RuntimeException("Stack Underflow");
		} else {
			data = top.getData();
		}
		return data;
	}

	public Object pop() throws RuntimeException {
		Object data;
		if (top == null) {
			throw new RuntimeException("Stack Underflow");
		} else {
			data = top.getData();
			top = top.left();
			if(null != top) {
				top.setRight(null);
			}
		}
		return data;
	}

	@Override
	public String toString() {
		String result = "{";
		DoublyLinkedNode current = top;
		while (current != null) {
			result += current.toString();
			current = current.left();
			if (null != current) {
				result += ", ";
			}
		}
		result += "}";
		return result;
	}
}
