package yuown.visa;

public class SumEqualsKinArray {

	public static void main(String[] args) {
		int[] a = new int[] { 10, 20, 30, 40, 50 };
		int k = 120;
		for (int i = 0; i < a.length; i++) {
			int sum = a[i];
			for (int j = i + 1; j < a.length; j++) {
				sum += a[j];
				if (sum >= k) {
					if (sum == k) {
						System.out.println(i + " to " + j);
					}
					break;
				}
			}
		}
	}

}
