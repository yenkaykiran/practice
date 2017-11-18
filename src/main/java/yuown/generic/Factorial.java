package yuown.generic;

public class Factorial {
	public static void main(String args[]) throws Exception {
		int N = 63;
		long[] f = new long[N];

		long s = System.currentTimeMillis();
		System.out.println("Factorial of " + N + " = " + factorial2(N, f));
		System.out.println("Time = " + (System.currentTimeMillis() - s));

		System.out.println();

		s = System.currentTimeMillis();
		System.out.println("Factorial of " + N + " = " + factorial1(N));
		System.out.println("Time = " + (System.currentTimeMillis() - s));
	}

	private static long factorial1(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return factorial1(n - 1) * n;
		}
	}

	private static long factorial2(int n, long[] f) {
		if (n <= 1) {
			f[0] = 1;
			return f[0];
		}
		f[n - 1] = factorial2(n - 1, f);
		return n * f[n - 1];
	}
}
