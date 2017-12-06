package yuown.visa;

public class MaxSumSubArray {

	public static void main(String[] args) {
		int[] a = new int[] { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Approach1, Max: " + approach1(a));
		System.out.println("Approach2, Max: " + approach2(a));
	}

	private static int approach1(int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			int sum = a[i];
			for (int j = i + 1; j < a.length; j++) {
				sum += a[j];
				max = Math.max(sum, max);
			}
		}
		return max;
	}

	private static int approach2(int[] a) {
		int maxCurrent = a[0], maxGlobal = a[0];
		for (int i = 1; i < a.length; i++) {
			maxCurrent = Math.max(a[i], maxCurrent + a[i]);
			maxGlobal = Math.max(maxGlobal, maxCurrent);
			System.out.println("maxCurrent = " + maxCurrent + " and maxGlobal = " + maxGlobal);
		}
		return maxGlobal;
	}
}
