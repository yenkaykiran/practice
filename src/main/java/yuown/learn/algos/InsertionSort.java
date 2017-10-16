package yuown.learn.algos;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = new int[] { 2, 4, 5, 8, 7, 6, 1, 3 };
		System.out.println(Arrays.toString(a));
		int size = a.length;
		for (int i = 0; i < size; i++) {
			int current = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > current) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = current;
		}
		System.out.println(Arrays.toString(a));
	}
}
