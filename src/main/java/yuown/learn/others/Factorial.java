package yuown.learn.others;

public class Factorial {

	public static void main(String[] args) {
		int n = 1;
		System.out.println("Factorial of " + n + " = " + factorial(n));
	}

	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
