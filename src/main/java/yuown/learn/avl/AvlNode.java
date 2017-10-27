package yuown.learn.avl;

public class AvlNode<T extends Comparable<T>> {

	private T data;
	private AvlNode<T> left;
	private AvlNode<T> right;
	private AvlNode<T> parent;

	public AvlNode(T obj) {
		this.data = obj;
	}

	public AvlNode<T> getLeft() {
		return left;
	}

	public void setLeft(AvlNode<T> left) {
		this.left = left;
	}

	public AvlNode<T> getRight() {
		return right;
	}

	public void setRight(AvlNode<T> right) {
		this.right = right;
	}

	public AvlNode<T> getParent() {
		return parent;
	}

	public void setParent(AvlNode<T> parent) {
		this.parent = parent;
	}

	public T getData() {
		return data;
	}
	
	@Override
	public String toString() {
	    return data.toString();
	}
}
