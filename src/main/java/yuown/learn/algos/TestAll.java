package yuown.learn.algos;

import java.util.Arrays;

public class TestAll {

	public static void main(String[] args) {

		int[] a = new int[] { 2, 4, 5, 8, 7, 6, 1, 3 };
		int[] b = new int[] { 2, 4, 5, 8, 7, 6, 1, 3 };
		int[] c = new int[] { 2, 4, 5, 8, 7, 6, 1, 3 };
		System.out.println("Before Sort   : " + Arrays.toString(a));
		System.out.println();
//		bubbleSort(a);
//		System.out.println("Bubble Sort   : " + Arrays.toString(a));

//		selectionSort(b);
//		System.out.println("Selection Sort: " + Arrays.toString(b));

		insertionSort(c);
		System.out.println("Insertion Sort: " + Arrays.toString(c));

	}

	public static void bubbleSort(int[] a) {
	    for(int i = 0; i < a.length; i++) {
	        for(int j = 0; j < a.length - i - 1; j++) {
	            if(a[j] > a[j + 1]) {
	                swap(a, j, j + 1);
	                System.out.println("Bubble Sort   : " + Arrays.toString(a));
	            }
	        }
	    }
	}

	public static void selectionSort(int[] a) {
	    for (int i = 0; i < a.length; i++) {
            int index = i;
            for (int j = i + 1; j < a.length; j++) {
                if(a[j] < a[index]) {
                    index = j;
                }
            }
            swap(a, i, index);
            System.out.println("Selection Sort: " + Arrays.toString(a));
        }
	}

	public static void insertionSort(int[] a) {
	    for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int j = i - 1;
            while(j >= 0 && a[j] > current) {
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
