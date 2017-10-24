package yuown.learn.algos;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = new int[] { 2, 8, 1, 7, 3, 5, 6, 4 };
		System.out.println(Arrays.toString(a));
		quicksort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	private static void quicksort(int[] a, int start, int end) {
		if (start < end) {
			int pivot = partition(a, start, end);
			quicksort(a, start, pivot - 1);
			quicksort(a, pivot + 1, end);
		}
	}

	private static int partition(int[] a, int start, int end) {
		int pivot = a[end];
		int i = start;
		for (int j = start; j < end; j++) {
			if (a[j] <= pivot) {
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				System.out.println("i = " + i + " and j   = " + j + " => " + Arrays.toString(a));
				i++;
			}
		}
		int t = a[i];
		a[i] = a[end];
		a[end] = t;
		System.out.println("i = " + i + " and end = " + end + " => " + Arrays.toString(a));
		return i;
	}
}
