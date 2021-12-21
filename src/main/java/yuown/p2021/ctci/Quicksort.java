package yuown.p2021.ctci;

import java.util.Arrays;

public class Quicksort {

	public static void main(String[] args) {
		int a[] = new int[] { 2, 8, 1, 7, 3, 5, 6, 4 };
		System.out.println("Before: " + Arrays.toString(a));
		quickSort(a, 0, a.length - 1);
		System.out.println("After: " + Arrays.toString(a));
	}

	private static void quickSort(int[] a, int start, int end) {
		if(start < end) {
			int pivot = partition(a, start, end);
			quickSort(a, start, pivot - 1);
			quickSort(a, pivot + 1, end);
		}
	}

	private static int partition(int[] a, int start, int end) {
		int pivot = a[end];
		int i = start;
		for (int j = start; j < end; j++) {
			if(a[j] <= pivot) {
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				i++;
			}
		}
		int t = a[i];
		a[i] = a[end];
		a[end] = t;
		return i;
	}
}
