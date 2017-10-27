package yuown.learn.tree;

import yuown.learn.linkedList.QueueWithLinkedList;

public class BinarySearchTree<T extends Comparable<T>> {

    private TreeNode<T> root;
    
    QueueWithLinkedList q = new QueueWithLinkedList();

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

    /**
     * Incomplete Implementation
     * case 1: When Node to delete is a leaf Node - Works
     * case 2: When Node to delete has one child - Works
     * case 3: When Node to delete has two children - Not Implemented
     * 
     * @param data
     */
    public void delete(T data) {
        TreeNode<T> current = root;
        TreeNode<T> parent = root;
        boolean isLeftChild = false;

        if (current == null) {
            return;
        }

        while (null != current && current.getData().compareTo(data) != 0) {
            parent = current;

            if (data.compareTo(current.getData()) < 0) {
                current = current.getLeft();
                isLeftChild = true;
            } else if (data.compareTo(current.getData()) >= 0) {
                current = current.getRight();
                isLeftChild = false;
            }
        }

        if (current == null) {
            return;
        }

        if (current.getLeft() == null && current.getRight() == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.setLeft(null);
                } else {
                    parent.setRight(null);
                }
            }
        } else if (current.getRight() == null) {
            if (current == root) {
                root = current.getLeft();
            } else if (isLeftChild) {
                parent.setLeft(current.getLeft());
            } else {
                parent.setRight(current.getLeft());
            }
        } else if (current.getLeft() == null) {
            if (current == root) {
                root = current.getRight();
            } else if (isLeftChild) {
                parent.setLeft(current.getRight());
            } else {
                parent.setRight(current.getRight());
            }
        } else {
//        	TreeNode<T> smallest = current.getRight().smallest();
//        	current.setData(smallest.getData());
//        	parent.setRight(current.getRight());
        }
    }

    public TreeNode<T> smallest() {
        TreeNode<T> smallest = null;
        if (root != null) {
            smallest = root.smallest();
        }
        return smallest;
    }

    public TreeNode<T> largest() {
        TreeNode<T> largest = null;
        if (root != null) {
            largest = root.largest();
        }
        return largest;
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    @Override
    public String toString() {
        return inOrder(root);
    }

    public String inOrder(TreeNode<T> node) {
        String result = "";
        if (null != node) {
            result += inOrder(node.getLeft());
            result += " " + node.getData();
            result += inOrder(node.getRight());
        }
        return result;
    }

    public String preOrder(TreeNode<T> node) {
        String result = "";
        if (null != node) {
            result += " " + node.getData();
            result += preOrder(node.getLeft());
            result += preOrder(node.getRight());
        }
        return result;
    }

    public String postOrder(TreeNode<T> node) {
        String result = "";
        if (null != node) {
            result += postOrder(node.getLeft());
            result += postOrder(node.getRight());
            result += " " + node.getData();
        }
        return result;
    }
    
    public String levelOrder(TreeNode<T> node) {
    	String result = "";
    	if(null != node) {
    		result += " " + node.getData();
    		if(node.getLeft() != null) {
    			q.enqueue(node.getLeft());
    		}
    		if(node.getRight() != null) {
    			q.enqueue(node.getRight());
    		}
    		if(!q.isEmpty()) {
    			TreeNode<T> c = (TreeNode<T>) q.dequeue();
    			result += levelOrder(c);
    		}
    	}
    	return result;
    }

    public int countLeafNodes(TreeNode<T> node) {
        if (node == null) {
            return 0;
        } else if (node.getLeft() == null && node.getRight() == null) {
            return 1;
        }
        return countLeafNodes(node.getLeft()) + countLeafNodes(node.getRight());
    }

    public int height(TreeNode<T> node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.getLeft());
        int rightHeight = height(node.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public void addSorted(int[] a) {
        root = TreeNode.addSorted(a, 0, a.length - 1);
    }
}
