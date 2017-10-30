package yuown.learn.ctci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CubesFinder {

	public static void main(String[] args) {
		int n = 1000;
		HashMap<Integer, ArrayList<Pair>> res = new HashMap<Integer, ArrayList<Pair>>();
		for (int c = 1; c <= n; c++) {
			for (int d = 1; d <= n; d++) {
				int result = (int) (Math.pow(c, 3) + Math.pow(d, 3));
				if (!res.containsKey(result)) {
					res.put(result, new ArrayList<Pair>());
				}
				res.get(result).add(new Pair(c, d));
			}
		}

		/* for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				int result = (int) (Math.pow(a, 3) + Math.pow(b, 3));
				ArrayList<Pair> resPair = res.get(result);
				for (Pair p : resPair) {
					System.out.println(a + ", " + b + ", " + p.a + ", " + p.b);
				}
			}
		} */

		Set<Entry<Integer, ArrayList<Pair>>> entries = res.entrySet();
		for (Entry<Integer, ArrayList<Pair>> entry : entries) {
			ArrayList<Pair> list = entry.getValue();
			for (Pair p1 : list) {
				for (Pair p2 : list) {
					System.out.println(p1.a + ", " + p1.b + ", " + p2.a + ", " + p2.b);
				}
			}
		}
	}
}
