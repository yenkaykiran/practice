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
	
	public void setData(T data) {
		this.data = data;
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

	public void delete(T deleteData) {
		if (null != left && deleteData.compareTo(left.data) < 0) {
			if (deleteData.compareTo(left.data) == 0) {
				left = null;
			} else {
				left.delete(deleteData);
			}
		} else if (null != right && deleteData.compareTo(right.data) >= 0) {
			if (deleteData.compareTo(right.data) == 0) {
				right = null;
			} else {
				right.delete(deleteData);
			}
		}
	}

	public TreeNode<T> smallest() {
		if (left != null) {
			return left.smallest();
		} else {
			return this;
		}
	}
	
	public TreeNode<T> largest() {
		if (right != null) {
			return right.largest();
		} else {
			return this;
		}
	}

    public static TreeNode addSorted(int[] a, int start, int end) {
        int middle = (end + start) / 2;
        if(end >= start) {
            TreeNode node = new TreeNode(a[middle]);
            node.left = addSorted(a, start, middle - 1);
            node.right = addSorted(a, middle + 1, end);
            return node;
        }
        return null;
    }
}
