package yuown.learn.assignment;

import yuown.learn.linkedList.StackWithLinkedList;

public class ExpressionEvaluator {

	public static void main(String[] args) {
		String postfixExpression = "2 3 * 5 4 * + 9 -";
		System.out.println("Postfix Result: " + evaluatePostfix(postfixExpression.split(" ")));

		String prefixExpression = "- + * 2 3 * 5 4 9";
		System.out.println("Prefix Result: " + evaluatePrefix(prefixExpression.split(" ")));
	}

	private static String evaluatePrefix(String[] tokens) {
		StackWithLinkedList list = new StackWithLinkedList();
		for (int i = tokens.length - 1; i >= 0; i--) {
			String token = tokens[i];
			if (isNumber(token)) {
				list.push(token);
			} else if (isOperator(token)) {
				Double op1 = Double.parseDouble((String) list.pop());
				Double op2 = Double.parseDouble((String) list.pop());
				String result = applyOperation(op1, op2, token);
				list.push(result);
			}
		}
		return (String) list.pop();
	}

	private static String evaluatePostfix(String[] tokens) {
		StackWithLinkedList list = new StackWithLinkedList();
		for (int i = 0; i < tokens.length; i++) {
			String token = tokens[i];
			if (isNumber(token)) {
				list.push(token);
			} else if (isOperator(token)) {
				Double op2 = Double.parseDouble((String) list.pop());
				Double op1 = Double.parseDouble((String) list.pop());
				String result = applyOperation(op1, op2, token);
				list.push(result);
			}
		}
		return (String) list.pop();
	}

	private static String applyOperation(Double op1, Double op2, String token) {
		Double result = 0.0;
		switch (token.charAt(0)) {
		case '*':
			result = op1 * op2;
			break;
		case '/':
			result = op1 / op2;
			break;
		case '+':
			result = op1 + op2;
			break;
		case '-':
			result = op1 - op2;
			break;
		}
		return Double.toString(result);
	}

	private static boolean isOperator(String token) {
		boolean flag = false;
		if (token.equals("*") || token.equals("/") || token.equals("+") || token.equals("-")) {
			flag = true;
		}
		return flag;
	}

	private static boolean isNumber(String token) {
		boolean flag = true;
		char[] n = token.toCharArray();
		for (int i = 0; i < n.length; i++) {
			if ((n[i] >= 48 && n[i] <= 57) || n[i] == 46) {
				continue;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
