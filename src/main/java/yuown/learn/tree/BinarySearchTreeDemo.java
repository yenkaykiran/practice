package yuown.learn.tree;

public class BinarySearchTreeDemo {

	public static void main1(String[] args) {
		BinarySearchTree<Integer> bsTree = new BinarySearchTree<Integer>();
		bsTree.insert(5);
		bsTree.insert(2);
		bsTree.insert(8);
		bsTree.insert(1);
		bsTree.insert(3);
		bsTree.insert(6);
		bsTree.insert(9);
		bsTree.insert(4);
		bsTree.insert(7);

		System.out.println("Tree: " + bsTree);

		System.out.println("Search for 8: " + bsTree.search(8));
		System.out.println("Search for 3: " + bsTree.search(3));

		System.out.println("Preorder:  " + bsTree.preOrder(bsTree.getRoot()));
		// System.out.println("Inorder: " + bsTree.inOrder(bsTree.getRoot()));
		// System.out.println("Postorder: " +
		// bsTree.postOrder(bsTree.getRoot()));

		// System.out.println("Delete 5");
		// bsTree.delete(5);

		System.out.println("Smallest: " + bsTree.smallest());
		System.out.println("Largest: " + bsTree.largest());

		System.out.println("Leaf Nodes: " + bsTree.countLeafNodes(bsTree.getRoot()));

		System.out.println("Height: " + bsTree.height(bsTree.getRoot()));

		System.out.println("Inorder:    " + bsTree.inOrder(bsTree.getRoot()));
		System.out.println("Preorder:   " + bsTree.preOrder(bsTree.getRoot()));
		System.out.println("Postorder:  " + bsTree.postOrder(bsTree.getRoot()));
		System.out.println("Level Order:" + bsTree.levelOrder(bsTree.getRoot()));
	}

	public static void main(String[] args) {
		BinarySearchTree<Integer> bsTree = new BinarySearchTree<Integer>();
		
		bsTree.insert(3);
		TreeNode<Integer> two = bsTree.insert(2);
		bsTree.insert(5);
		bsTree.insert(1);
		
		two.setRight(new TreeNode<Integer>(4));
		//bsTree.insert(4);
		
//		bsTree.insert(6);
//		bsTree.insert(7);

		System.out.println("Binary Tree Width: " + bsTree.levelOrder(bsTree.getRoot()));
		System.out.println("isBST = " + bsTree.isBST(bsTree.getRoot(), Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

}
