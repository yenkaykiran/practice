package yuown.learn.algos;

import java.util.Arrays;

public class TestAll {

	public static void main(String[] args) {

		int[] a = new int[] { 2, 4, 5, 8, 7, 6, 1, 3 };
		int[] b = new int[] { 2, 4, 5, 8, 7, 6, 1, 3 };
		int[] c = new int[] { 2, 4, 5, 8, 7, 6, 1, 3 };
		System.out.println("Before Sort   : " + Arrays.toString(a));
		System.out.println();
		bubbleSort(a);
		System.out.println("Bubble Sort   : " + Arrays.toString(a));

		selectionSort(b);
		System.out.println("Selection Sort: " + Arrays.toString(b));

		insertionSort(c);
		System.out.println("Insertion Sort: " + Arrays.toString(c));

	}

	public static void bubbleSort(int[] a) {
		int size = a.length;
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				if (a[i] > a[j]) {
					swap(a, i, j);
				}
			}
		}
	}

	public static void selectionSort(int[] a) {
		int size = a.length;
		for (int i = 0; i < size; i++) {
			int index = i;
			for (int j = index; j < size; j++) {
				if (a[j] < a[index]) {
					index = j;
				}
			}
			swap(a, i, index);
		}
	}

	public static void insertionSort(int[] a) {
		int size = a.length;
		for (int i = 1; i < size; i++) {
			int current = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > current) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = current;
		}
	}

	private static void swap(int[] a, int i, int j) {
		int t = a[j];
		a[j] = a[i];
		a[i] = t;
	}
}
