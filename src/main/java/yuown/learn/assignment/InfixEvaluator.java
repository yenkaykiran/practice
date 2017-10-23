package yuown.learn.assignment;

public class InfixEvaluator {

	public static void main(String[] args) {
		TwoStack twoStack = new TwoStack();

		String expression = "+ 3 (* 5 3)";

		System.out.println("Result: " + twoStack.evaluate(expression));
	}
}
