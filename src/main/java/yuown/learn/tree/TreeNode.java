package yuown.learn.tree;

public class TreeNode<T extends Comparable<T>> {

	private T data;

	private TreeNode<T> left;

	private TreeNode<T> right;

	public TreeNode(T data) {
		this.data = data;
	}

	public TreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	public TreeNode<T> getRight() {
		return right;
	}

	public void setRight(TreeNode<T> right) {
		this.right = right;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return data.toString();
	}

	public TreeNode<T> search(T searchData) {
		if (this.data == searchData) {
			return this;
		} else if (searchData.compareTo(this.data) < 0 && null != left) {
			return left.search(searchData);
		} else if (searchData.compareTo(this.data) >= 0 && null != right) {
			return right.search(searchData);
		}
		return null;
	}

	public void insert(T searchData) {
		if (searchData.compareTo(this.data) >= 0) {
			if (null != right) {
				right.insert(searchData);
			} else {
				right = new TreeNode<T>(searchData);
			}
		} else if (searchData.compareTo(this.data) < 0) {
			if (null != left) {
				left.insert(searchData);
			} else {
				left = new TreeNode<T>(searchData);
			}
		}
	}
}
