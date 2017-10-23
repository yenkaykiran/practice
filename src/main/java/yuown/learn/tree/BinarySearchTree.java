package yuown.learn.tree;

public class BinarySearchTree<T extends Comparable<T>> {

	private TreeNode<T> root;

	public TreeNode<T> search(T data) {
		if (root == null) {
			return null;
		} else {
			return root.search(data);
		}
	}

	public void insert(T data) {
		if (root == null) {
			root = new TreeNode<T>(data);
		} else {
			root.insert(data);
		}
	}

	public TreeNode<T> getRoot() {
		return root;
	}

	@Override
	public String toString() {
		return generateInfixString(root);
	}

	public String generateInfixString(TreeNode<T> node) {
		String result = "";
		if (null != node) {
			result += generateInfixString(node.getLeft());
			result += " -> " + node.getData();
			result += generateInfixString(node.getRight());
		}
		return result;
	}

	public String generatePrefixString(TreeNode<T> node) {
		String result = "";
		if (null != node) {
			result += " -> " + node.getData();
			result += generatePrefixString(node.getLeft());
			result += generatePrefixString(node.getRight());
		}
		return result;
	}

	public String generatePostfixString(TreeNode<T> node) {
		String result = "";
		if (null != node) {
			result += generatePostfixString(node.getLeft());
			result += generatePostfixString(node.getRight());
			result += " -> " + node.getData();
		}
		return result;
	}
}
