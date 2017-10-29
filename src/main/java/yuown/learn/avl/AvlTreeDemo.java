package yuown.learn.avl;

public class AvlTreeDemo {

    public static void main(String[] args) {
        AvlTree<Integer> avlTree = new AvlTree<Integer>();
        
        AvlNode<Integer> root = avlTree.add(4);
        avlTree.add(6);
        avlTree.add(8);
        
        
        System.out.println("Inorder...");
        avlTree.inorder();
        
        System.out.println("Height: " + avlTree.height());
        
        System.out.println("Rotating Left...");
        avlTree.leftRotate(root);
        
        System.out.println("Inorder...");
        avlTree.inorder();
        
        System.out.println("Height: " + avlTree.height());
    }
}
