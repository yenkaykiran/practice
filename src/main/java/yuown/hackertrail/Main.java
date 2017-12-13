package yuown.hackertrail;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// note:
		// this is just an example on how our system
		// takes input and output and automate the process
		// of marking this submission
		try {
			Scanner scan = new Scanner(System.in);

			// check if there is any more line
			while (scan.hasNextLine()) {
				// here's how you read the next line
				String string = scan.nextLine().trim();
				String[] split = string.split(" ");
				char op = split[0].charAt(0);
				int a = Integer.parseInt(split[1]);
				int b = Integer.parseInt(split[2]);
				int result = 0;
				switch (op) {
				case '+':
					result = a + b;
					break;
				case '-':
					result = a - b;
					break;
				case '*':
					result = a * b;
					break;
				case '/':
					result = a / b;
					break;
				case '%':
					result = a % b;
					break;
				}
				System.out.println(result);
			}

		} catch (Exception e) {
		}
	}
}