package yuown.learn.algos;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int n = 10;
		int index = binarySearch(a, 0, a.length - 1, n);
		System.out.println(Arrays.toString(a));
		System.out.println("Found " + n + " at " + index);
	}

	private static int binarySearch(int[] a, int start, int end, int n) {
		if (end < start) {
			return -1;
		}
		int m = start + (end - start) / 2;
		if (a[m] == n) {
			return m;
		} else if (n < a[m]) {
			return binarySearch(a, start, m - 1, n);
		} else {
			return binarySearch(a, m + 1, end, n);
		}
	}
}