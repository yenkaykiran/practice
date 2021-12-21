package yuown.p2021.walmart;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		String ip = "[][]({[]})()";
		char[] chars = ip.toCharArray();
		boolean result = checkBalance(chars);
		System.out.println("Is " + ip + " balanced = ? " + result);
	}

	private static boolean checkBalance(char[] chars) {
		Stack<Character> s = new Stack<>();
		for (char c : chars) {
			if (c == '[' || c == '(' || c == '{') {
				s.push(c);
			} else if(!s.isEmpty()) {
				char c1 = s.pop();
				if ((c1 == '[' && c != ']') || (c1 == '(' && c != ')') || (c1 == '{' && c != '}')) {
					return false;
				}
			} else {
				return false;
			}
		}
		return s.isEmpty();
	}

}
