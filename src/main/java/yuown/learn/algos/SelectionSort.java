package yuown.learn.algos;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 8, 4, 3, 7, 5, 1, 2, 6 };
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
			System.out.println(Arrays.toString(arr));
		}
	}
}