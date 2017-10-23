package yuown.learn.linkedList;

class SingleLinkedNode {
	private Object data;
	private SingleLinkedNode nextNode;

	public SingleLinkedNode(Object data) {
		super();
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public SingleLinkedNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(SingleLinkedNode nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "data: " + data;
	}
}