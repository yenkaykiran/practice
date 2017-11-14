package yuown.hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	public static boolean isBalanced(String expression) {
		char[] a = expression.toCharArray();
		Stack<Character> s = new Stack<Character>();
		for (int i = 0; i < a.length; i++) {
			char c = a[i];
			if (c == '(' || c == '[' || c == '{') {
				s.push(c);
			} else if (!s.isEmpty()) {
				char c1 = s.pop();
				if ((c == ')' && c1 != '(') || (c == ']' && c1 != '[') || (c == '}' && c1 != '{')) {
					return false;
				}
			} else {
				return false;
			}
		}
		return s.isEmpty();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println((isBalanced(expression)) ? "YES" : "NO");
		}
		in.close();
	}
}
