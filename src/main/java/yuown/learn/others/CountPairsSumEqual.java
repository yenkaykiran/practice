package yuown.learn.others;

import java.util.HashMap;
import java.util.Map;

public class CountPairsSumEqual {

	public static void main(String[] args) {
		int[] a = new int[] { 1, -1, 3, 2, 8, 1, 7, 5 };
		System.out.println(count(a, 4));
	}

	private static int count(int[] a, int sum) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int j = 0; j < a.length; j++) {
			int diff = sum - a[j];
			if (!map.containsKey(a[j])) {
				map.put(diff, a[j]);
			} else {
				count++;
			}
		}
		return count;
	}
}
