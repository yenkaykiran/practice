package yuown.p2021.ctci.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeNode implements Comparable<TreeNode> {

	private int data;

	private TreeNode left;

	private TreeNode right;
	
	private TreeNode next;

	public TreeNode(int d) {
		data = d;
	}

	public TreeNode(int d, TreeNode l, TreeNode r) {
		data = d;
		left = l;
		right = r;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public void inorder() {
		inorder(this);
		System.out.println();
	}

	private void inorder(TreeNode n) {
		if (n != null) {
			inorder(n.left);
			System.out.print(n.data + " ");
			inorder(n.right);
		}
	}

	public void preorder() {
		preorder(this);
		System.out.println();
	}

	private void preorder(TreeNode n) {
		if (null != n) {
			System.out.print(n.data + " ");
			preorder(n.left);
			preorder(n.right);
		}
	}

	public void postorder() {
		postorder(this);
		System.out.println();
	}

	private void postorder(TreeNode n) {
		if (null != n) {
			postorder(n.left);
			postorder(n.right);
			System.out.print(n.data + " ");
		}
	}

	public void dfs() {
		TreeNode n = this;
		dfs(n);
		System.out.println();
	}

	private void dfs(TreeNode n) {
		if (null == n) {
			return;
		}
		System.out.print(n.data + " ");
		if (n.left != null) {
			dfs(n.left);
		}
		if (n.right != null) {
			dfs(n.right);
		}
	}

	public void bfs() {
		TreeNode n = this;
		bfs(n);
		System.out.println();
	}

	private void bfs(TreeNode n) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(n);

		while (!q.isEmpty()) {
			n = q.remove();
			System.out.print(n.data + " ");
			if (n.left != null) {
				q.add(n.left);
			}
			if (n.right != null) {
				q.add(n.right);
			}
		}
	}

	public void zigzag() {
		TreeNode n = this;
		zigzag(n);
		System.out.println();
	}

	private void zigzag(TreeNode n) {
		Stack<TreeNode> currentLevel = new Stack<>();
		Stack<TreeNode> nextLevel = new Stack<>();
		currentLevel.push(n);

		boolean leftToRight = true;

		while (!currentLevel.isEmpty()) {
			n = currentLevel.pop();
			if (null != n) {
				System.out.print(n.data + " ");

				if (leftToRight) {
					if (null != n.left) {
						nextLevel.push(n.left);
					}
					if (null != n.right) {
						nextLevel.push(n.right);
					}
				} else {
					if (null != n.right) {
						nextLevel.push(n.right);
					}
					if (null != n.left) {
						nextLevel.push(n.left);
					}
				}
			}
			if (currentLevel.isEmpty()) {
				leftToRight = !leftToRight;
				Stack<TreeNode> t = currentLevel;
				currentLevel = nextLevel;
				nextLevel = t;
			}
		}
	}
	
	public void linkSiblings() {
		TreeNode n = this;
		linkSiblings(n);
	}

	private void linkSiblings(TreeNode root) {
		if(null == root) {
			return;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int size = q.size();
			System.out.println("Size = " + size);
			for(int i = 0; i < size; i++) {
				TreeNode n = q.poll();
				if(i < size - 1) {
					n.next = q.peek();
				}
				if(n.left != null) {
					q.add(n.left);
				}
				if(n.right != null) {
					q.add(n.right);
				}
			}
		}
	}
	
	public void printSiblings() {
		TreeNode n = this;
		printSiblings(n);
	}

	private void printSiblings(TreeNode n) {
		if(null == n) {
			return;
		}
		if(null != n.next) {
			System.out.println(n.data + " - > " + n.next.data);
		}
		printSiblings(n.left);
		printSiblings(n.right);
	}

	@Override
	public int compareTo(TreeNode o) {
		return o.data;
	}

	private void toString(TreeNode n, StringBuilder sb) {
		if (null != n) {
			toString(n.left, sb);
			sb.append(n.data + " ");
			toString(n.right, sb);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		toString(this, sb);
		return sb.toString();
	}

}
