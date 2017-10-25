package yuown.learn.algos;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = new int[] { 2, 4, 5, 8, 7, 6, 1, 3 };
		System.out.println(Arrays.toString(a));
		int size = a.length;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
					System.out.println(Arrays.toString(a));
				}
			}
		}
	}
}
