package yuown.learn.tree;

public class BinarySearchTreeDemo {

	public static void main(String[] args) {
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

		System.out.println("Prefix:  " + bsTree.preOrder(bsTree.getRoot()));
//		System.out.println("Infix:   " + bsTree.inOrder(bsTree.getRoot()));
//		System.out.println("Postfix: " + bsTree.postOrder(bsTree.getRoot()));
		
		System.out.println("Delete 3");
		bsTree.delete(3);
		
		System.out.println("Prefix:  " + bsTree.preOrder(bsTree.getRoot()));
		
		System.out.println("Smallest: " + bsTree.smallest());
		System.out.println("Largest: " + bsTree.largest());
	}

}
