package yuown.coderfights;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
	public static void main(String[] args) {
		int a[] = new int[] { 2, 3, 3, 1, 5, 2 };
		int index = firstDuplicate(a);
		System.out.println("Index: " + index);
	}

	static int firstDuplicate(int[] a) {
		int index = -1;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (set.contains(a[i])) {
				index = i;
				break;
			} else {
				set.add(a[i]);
			}
		}
		if (index != -1) {
			index = a[index];
		}
		return index;
	}

}
