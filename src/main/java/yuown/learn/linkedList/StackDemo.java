package yuown.learn.linkedList;

public class StackDemo {
	public static void main(String[] args) {
		StackWithLinkedList stack = new StackWithLinkedList();
		
//		System.out.println("Stack Popped: " + stack.pop());
		System.out.println("Stack: " + stack);
		
		stack.push(20);
		stack.push(2);
		stack.push(4);
		stack.push(5);
		stack.push(10);
		stack.push(17);

		System.out.println("Stack: " + stack);

		System.out.println("Stack Popped: " + stack.pop());
		System.out.println("Stack: " + stack);

		stack.push(25);
		System.out.println("Stack: " + stack);

		System.out.println("Stack Peeked: " + stack.peek());
	}
}
