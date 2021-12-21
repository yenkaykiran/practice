package yuown.p2021.ctci.tree;

public class TreeTest {
	
	public static void main(String[] args) {
		TreeNode nine = new TreeNode(9);
		TreeNode e8n = new TreeNode(18);

		TreeNode th3 = new TreeNode(3);
		TreeNode s7 = new TreeNode(7);
		
		TreeNode five = new TreeNode(5, nine, e8n);
		TreeNode t20 = new TreeNode(20, th3, s7);
		
		TreeNode root = new TreeNode(10, five, t20);
		
//		root.preorder();
//		root.inorder();
//		root.postorder();
		
//		root.dfs();
		
		root.bfs();
		
//		root.zigzag();
		
		
//		System.out.println("Before Linking");
//		root.printSiblings();
//		root.linkSiblings();
//		System.out.println("After Linking");
//		root.printSiblings();
	}

}
