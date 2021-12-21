package yuown.p2021.ctci;

public class Fibonacci {
	
	public static void main(String[] args) {
		int n = 47;
		System.out.println("Finocacci for " + n);
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print(recursive(i, arr) + " ");
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(iterative(i) + " ");
		}
	}

	private static int iterative(int n) {
		if(n <= 1) {
			return n;
		}
		int a = 0, b = 1;
		int c = 1;
		for (int i = 1; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	private static int recursive(int n, int[] arr) {
		if(n <= 1) {
			return n;
		}
		if(arr[n] == 0) {
			arr[n] = recursive(n - 2, arr) + recursive(n - 1, arr);
		}
		return arr[n];
	}
	
	

//	private static String bigAdd(String n1, String n2) {
//		int l1 = n1.length();
//		int l2 = n2.length();
//		int d = Math.abs(l1 - l2);
//		
//		n1 = stuff(n1, d);
//		n2 = stuff(n2, d);
//		
//		int c = 0;
//		StringBuilder sb = new StringBuilder();
//		for (int i = n1.length() - 1; i >= 0; i--) {
//			int a = n1.charAt(i) - 48;
//			int b = n2.charAt(i) - 48;
//			int t = c + a + b;
//			sb.insert(0, t % 10);
//			c = t / 10;
//		}
//		sb.insert(0, c);
//		return sb.toString();
//	}
//	
//	private static String stuff(String n, int l) {
//		StringBuilder sb = new StringBuilder(n);
//		for(int i = 0; i < l; i++) {
//			sb.insert(i, "0");
//		}
//		return sb.toString();
//	}
}
