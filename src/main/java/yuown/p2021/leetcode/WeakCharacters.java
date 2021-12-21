package yuown.p2021.leetcode;

import java.util.Arrays;

public class WeakCharacters {

	public static void main(String[] args) {
		int[][] properties = { { 1, 5 }, { 10, 4 }, { 4, 3 } };
		System.out.println(numberOfWeakCharacters(properties));
	}

	public static int numberOfWeakCharacters(int[][] properties) {
		int size = properties.length;
		Arrays.sort(properties, (a, b) -> {
			if(a[0] == b[0]) {
				return b[1] - a[1];
			}
			return b[0] - a[0];
		});
		int count = 0;
		int max = Integer.MAX_VALUE;
		for (int i = 0; i < size; i++) {
//			max = Math.
		}
		return count;
	}
}
