package yuown.visa;

public class KadaneAlgo {
	public static void main(String[] args) {
		int[] a = new int[] { -4, -1, 2, 3, 1, -4, 5, 1, -2, -6, 5 };
		int mc = a[0], mg = a[0];
		for (int i = 1; i < a.length; i++) {
			mc = Math.max(a[i], mc + a[i]);
			mg = Math.max(mc, mg);
		}
		System.out.println(mg);
	}
}
