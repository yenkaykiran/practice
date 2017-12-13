package yuown.learn.others;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class AllMaxInWindow {

	public static void main(String[] args) {
		int[] a = new int[] { 1, -1, 3, 2, 8, 1, 7, 5 };
		int[] b = find(a, 3);
		System.out.println(Arrays.toString(b));

		printMax(a, a.length, 3);
	}

	private static int[] find(int[] a, int w) {
		int[] b = new int[a.length - w + 1];
		for (int i = 0, k = 0; i <= a.length - w; i++, k++) {
			int current = a[i];
			for (int j = i + 1; j < i + w; j++) {
				current = Math.max(current, a[j]);
			}
			b[k] = current;
		}
		return b;
	}

	// A Dequeue (Double ended queue) based method for printing maixmum element
	// of
	// all subarrays of size k
	static void printMax(int arr[], int n, int k) {
		// Create a Double Ended Queue, Qi that will store indexes of array
		// elements
		// The queue will store indexes of useful elements in every window and
		// it will
		// maintain decreasing order of values from front to rear in Qi, i.e.,
		// arr[Qi.front[]] to arr[Qi.rear()] are sorted in decreasing order
		Deque<Integer> Qi = new LinkedList<Integer>();

		/* Process first k (or first window) elements of array */
		int i;
		for (i = 0; i < k; ++i) {
			// For very element, the previous smaller elements are useless so
			// remove them from Qi
			while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
				Qi.removeLast(); // Remove from rear

			// Add new element at rear of queue
			Qi.addLast(i);
		}
		System.out.println(Qi);

		// Process rest of the elements, i.e., from arr[k] to arr[n-1]
		for (; i < n; ++i) {
			// The element at the front of the queue is the largest element of
			// previous window, so print it
			System.out.print(arr[Qi.peek()] + " ");

			// Remove the elements which are out of this window
			while ((!Qi.isEmpty()) && Qi.peek() <= i - k)
				Qi.removeFirst();

			// Remove all elements smaller than the currently
			// being added element (remove useless elements)
			while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()])
				Qi.removeLast();

			// Add current element at the rear of Qi
			Qi.addLast(i);

		}

		// Print the maximum element of last window
		System.out.print(arr[Qi.peek()]);
	}
}
