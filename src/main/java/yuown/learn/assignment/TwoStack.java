package yuown.learn.assignment;

import java.util.Arrays;

public class TwoStack {

	private Object[] data = new Object[100];

	private int top1 = -1;
	private int top2 = -2;

	public void push1(Object data) {
		if (top1 < 96) {
			top1 += 2;
			this.data[top1] = data;
		} else {
			throw new RuntimeException("Stack1 Overflow");
		}
		
		System.out.println("\tPush1: " + data);
	}

	public Object pop1() {
		Object data;
		if (top1 > -1) {
			data = this.data[top1];
			top1 -= 2;
		} else {
			throw new RuntimeException("Stack1 Underflow");
		}
		System.out.println("\tPop1: " + data);
		return data;
	}

	public Object peek1() {
		Object data;
		if (top1 > -1) {
			data = this.data[top1];
		} else {
			throw new RuntimeException("Stack1 Underflow");
		}
		System.out.println("\tPeek1: " + data);
		return data;
	}

	public void push2(Object data) {
		if (top2 < 97) {
			top2 += 2;
			this.data[top2] = data;
		} else {
			throw new RuntimeException("Stack2 Overflow");
		}
		System.out.println("\t\tPush2: " + data);
	}

	public Object pop2() {
		Object data;
		if (top2 > -2) {
			data = this.data[top2];
			top2 -= 2;
		} else {
			throw new RuntimeException("Stack2 Underflow");
		}
		System.out.println("\t\tPop2: " + data);
		return data;
	}

	public Object peek2() {
		Object data;
		if (top2 > -1) {
			data = this.data[top2];
		} else {
			throw new RuntimeException("Stack1 Underflow");
		}
		System.out.println("\t\tPeek2: " + data);
		return data;
	}

	public boolean isFirstEmpty() {
		return top1 < 0;
	}

	public boolean isSecondEmpty() {
		return top2 < 0;
	}

	@Override
	public String toString() {
		String result1 = "[";
		for (int i = 1; i <= top1; i += 2) {
			result1 += data[i] + ", ";
		}
		result1 += "]";

		String result2 = "[";
		for (int i = 0; i <= top2; i += 2) {
			result2 += data[i] + ", ";
		}
		result2 += "]";

		return result1 + "\n" + result2;
	}

	public Double evaluate(String expression) {
		String HASH = "#";

		String[] tokens = expression.split(" ");
		System.out.println(Arrays.deepToString(tokens));

		for (String token : tokens) {
			token = stripBrackets(token);
//			System.out.println("Token: " + token);
			if (isOperator(token)) {
				push1(token);
				push2(HASH);
			} else if (isNumber(token)) {
				if (isSecondEmpty() || (!isSecondEmpty() && peek2().equals(HASH))) {
					push2(token);
				} else {
					while (!isSecondEmpty() && isNumber((String) peek2())) {
						Double inStack = Double.parseDouble((String) pop2());
						pop2();

						String operator = (String) pop1();

						Double result = applyOp(operator, inStack, Double.parseDouble(token));
						if (isSecondEmpty() || peek2().equals(HASH)) {
							push2(result.toString());
							break;
						}
						token = result.toString();
					}
				}
			}
		}
		return Double.parseDouble((String) pop2());
	}

	private Double applyOp(String operator, Double op1, double op2) {
		Double result = 0.0;
		if (operator.equals("+")) {
			result = op1 + op2;
		} else if (operator.equals("-")) {
			result = op1 - op2;
		} else if (operator.equals("*")) {
			result = op1 * op2;
		} else if (operator.equals("/")) {
			result = op1 / op2;
		}
		return result;
	}

	private boolean isOperator(String token) {
		boolean isOperator = false;
		if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
			isOperator = true;
		}
		return isOperator;
	}

	private String stripBrackets(String token) {
		String res = token.replace('(', ' ');
		res = res.replace(')', ' ');
		return res.trim();
	}

	private boolean isNumber(String token) {
		boolean flag = true;
		char[] c = token.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if ((c[i] >= 48 && c[i] <= 57) || c[i] == 46) {
				continue;
			} else {
				flag = false;
			}
		}
		return flag;
	}

}
