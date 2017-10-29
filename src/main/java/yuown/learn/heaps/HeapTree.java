package yuown.learn.heaps;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HeapTree<T extends Comparable<T>> {

	private T[] data = null;

	private int currentPosition = -1;

	public HeapTree(Class<T> type, int size) {
		data = (T[]) Array.newInstance(type, size + 1);
	}

	public void add(T d) {
		if (full()) {
			throw new RuntimeException("Heap is full");
		} else {
			data[++currentPosition] = d;
			fixUp(currentPosition);
		}
	}

	private void fixUp(int index) {
		int i = (index - 1) / 2;
		while (i >= 0 && data[i].compareTo(data[index]) < 0) {
			T tmp = data[i];
			data[i] = data[index];
			data[index] = tmp;
			index = i;
			i = (index - 1) / 2;
		}
	}

	private boolean full() {
		return currentPosition == data.length - 1;
	}

	public void sort() {
		for (int i = 0; i < currentPosition; i++) {
			swap(0, currentPosition - i);
			fixDown(0, currentPosition - i - 1);
		}
	}

	private void swap(int from, int to) {
		T tmp = data[from];
		data[from] = data[to];
		data[to] = tmp;
	}

	private void fixDown(int index, int upto) {
		if (upto < 0) {
			upto = currentPosition;
		}
		while (index <= upto) {
			int leftChild = 2 * index + 1;
			int rightChild = 2 * index + 2;
			if (leftChild <= upto) {
				int childToSwap;
				if (rightChild > upto) {
					childToSwap = leftChild;
				} else {
					childToSwap = data[leftChild].compareTo(data[rightChild]) > 0 ? leftChild : rightChild;
				}

				if (data[index].compareTo(data[childToSwap]) < 0) {
					swap(index, childToSwap);
				} else {
					break;
				}
				index = childToSwap;
			} else {
				break;
			}
		}
	}

	@Override
	public String toString() {
		return Arrays.deepToString(this.data);
	}
}
