package yuown.learn.heaps;

import java.util.Arrays;

public class HeapDemo {

	public static void main(String[] args) {
		int a[] = new int[] { 20, 12, 25, 6, 10, 15, 13 };
		HeapTree<Integer> heap = new HeapTree<Integer>(Integer.class, a.length);
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			heap.add(a[i]);
		}
		System.out.println(heap);
		heap.sort();
		System.out.println(heap);
	}
}
