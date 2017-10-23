package yuown.learn.assignment;

public class TwoStackDemo {

	public static void main(String[] args) {
		TwoStack twoStack = new TwoStack();

		twoStack.push1(23);
		twoStack.push1(2);
		twoStack.push1(13);
		twoStack.push1(4);
		twoStack.push1(5);

		twoStack.push2(4);
		twoStack.push2(1);
		twoStack.push2(6);
		twoStack.push2(65);
		twoStack.push2(21);
		
		System.out.println(twoStack);
		
		twoStack.pop1();
		System.out.println(twoStack);
		twoStack.pop2();
		System.out.println(twoStack);
	}

}
