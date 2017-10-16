package yuown.learn.algos;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = new int[] { 2, 4, 5, 8, 7, 6, 1, 3 };
		System.out.println(Arrays.toString(a));
		int size = a.length;
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < size - i; j++) {
				if (a[j - 1] > a[j]) {
					int t = a[j - 1];
					a[j - 1] = a[j];
					a[j] = t;
					System.out.println(Arrays.toString(a));
				}
			}
		}
	}
}
