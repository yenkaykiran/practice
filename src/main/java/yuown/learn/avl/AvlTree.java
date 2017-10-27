package yuown.learn.avl;

public class AvlTree<T extends Comparable<T>> {

	private AvlNode<T> root = null;

	private int size = 0;

	public AvlNode<T> add(T obj) {
		AvlNode<T> newNode = new AvlNode<T>(obj);
		if (root == null) {
			root = newNode;
			size++;
		} else {
			add(root, newNode);
		}
		return newNode;
	}
	
	private void add(AvlNode<T> parent, AvlNode<T> node) {
		if (node.getData().compareTo(parent.getData()) < 0) {
			if (parent.getLeft() != null) {
				add(parent.getLeft(), node);
			} else {
				parent.setLeft(node);
				node.setParent(parent);
			}
		} else {
			if (parent.getRight() != null) {
				add(parent.getRight(), node);
			} else {
				parent.setRight(node);
				node.setParent(parent);
			}
		}
		checkBalance(node);
	}

	private void checkBalance(AvlNode<T> node) {
		int lH = height(node);
		int rH = height(node);

		if (Math.abs(lH - rH) > 1) {
			reBalance(node);
		}
		if (node.getParent() != null) {
			checkBalance(node.getParent());
		}
	}

	private void reBalance(AvlNode<T> node) {
		
	}

    public int height() {
        return height(root);
    }

    private int height(AvlNode<T> node) {
		if (node == null) {
			return 0;
		}
		return Math.max(height(node.getLeft()), height(node.getRight())) + 1;
	}

    public AvlNode<T> leftRotate(AvlNode<T> root, AvlNode<T> node) {
        AvlNode<T> tmp = node.getLeft();
        root.setRight(tmp);
        if (null != tmp) {
            tmp.setParent(root);
        }
        node.setLeft(root);
        root.setParent(node);
        node.setParent(null);
        // this.root = node; // Hack for Testing manually
        return node;
    }
    
    public AvlNode<T> rightRotate(AvlNode<T> root, AvlNode<T> node) {
        AvlNode<T> tmp = node.getRight();
        root.setLeft(tmp);
        if(tmp != null) {
            tmp.setParent(root);
        }
        node.setRight(root);
        root.setParent(node);
        // this.root = node; // Hack for Testing manually
        return node;
    }
    
    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(AvlNode<T> node) {
        if (node != null) {
            inorder(node.getLeft());
            System.out.print(node.getData() + " ");
            inorder(node.getRight());
        }
    }
}
