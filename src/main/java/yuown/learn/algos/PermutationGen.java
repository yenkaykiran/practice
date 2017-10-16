package yuown.learn.algos;

import java.util.Arrays;

public class PermutationGen {

	public static void main(String[] args) {
		String[] arr = new String[] { "a", "b", "c" };
		perm(arr, 0, arr.length);
	}

	private static void perm(String[] arr, int k, int n) {
		if (k == n) {
			System.out.println(toString(arr));
		} else {
			for (int i = k; i < n; i++) {
				swap(arr, k, i);
				perm(arr, k + 1, n);
				swap(arr, k, i);
			}
		}
	}

	private static String toString(String[] arr) {
		return Arrays.toString(arr).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", "").replaceAll(" ", "");
	}

	private static void swap(String[] arr, int k, int i) {
		String t = arr[k];
		arr[k] = arr[i];
		arr[i] = t;
	}
}
