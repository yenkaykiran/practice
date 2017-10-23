package yuown.learn.linkedList;

class DoublyLinkedNode {
	Object data;
	DoublyLinkedNode left;
	DoublyLinkedNode right;

	public DoublyLinkedNode(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public DoublyLinkedNode getLeft() {
		return left;
	}

	public DoublyLinkedNode left() {
		return left;
	}

	public void setLeft(DoublyLinkedNode left) {
		this.left = left;
	}

	public DoublyLinkedNode getRight() {
		return right;
	}

	public DoublyLinkedNode right() {
		return right;
	}

	public void setRight(DoublyLinkedNode right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "data: " + this.data;
	}
}