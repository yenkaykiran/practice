package yuown.learn.algos;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] a = new int[] { 10, 8, 7, 6, 5, 4, 3, 2, 1, 9 };
		System.out.println(Arrays.toString(a));
		mergeSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	private static void mergeSort(int[] a, int start, int end) {
		if (start < end) {
			int middle = (int) Math.floor((start + end) / 2);
			mergeSort(a, start, middle);
			mergeSort(a, middle + 1, end);
			merge(a, start, middle, end);
			System.out.println(Arrays.toString(a));
		}
	}

	private static void merge(int[] a, int start, int middle, int end) {
		int lSize = middle - start + 1;
		int rSize = end - middle;
		int[] left = new int[lSize];
		int[] right = new int[rSize];
		for (int i = 0; i < lSize; i++) {
			left[i] = a[start + i];
		}
		for (int j = 0; j < rSize; j++) {
			right[j] = a[middle + j + 1];
		}
		int i = 0, j = 0;
		for (int k = start; k <= end; k++) {
			if (j >= rSize || (i < lSize && left[i] <= right[j])) {
				a[k] = left[i];
				i++;
			} else {
				a[k] = right[j];
				j++;
			}
		}
	}
}