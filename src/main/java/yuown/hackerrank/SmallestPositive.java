package yuown.hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmallestPositive {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {2, 3}));
	}

	public static int solution(int[] A) {
		int elem = 1;
		Arrays.sort(A);
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			s.add(A[i]);
		}
		for (Integer val : s) {
			int v = val + 1;
			if (!s.contains(v) && v > elem) {
				elem = v;
				break;
			}
		}
		if (elem <= 0) {
			elem = 1;
		}
		return elem;
	}
}
