package yuown.heaps.max;

import java.util.Arrays;

public class MaxHeap {

    public static void main(String[] args) {

        int[] array = new int[] { 1, 4, 3, 7, 8, 9, 10 };
        System.out.println("Before: " + Arrays.toString(array));
        for (int i = array.length / 2; i >= 1; i--) {
            maxHeapify(array, 0);
        }
        System.out.println("After : " + Arrays.toString(array));
    }

    public static void maxHeapify(int[] array, int i) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int largest = i;

        if (left <= array.length && array[left] > array[i]) {
            largest = left;
        }

        if (right <= array.length && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != 1) {
            swap(array, i, largest);
            maxHeapify(array, largest);
        }

    }

    private static void swap(int[] array, int i, int largest) {
        int temp = array[largest];
        array[largest] = array[i];
        array[i] = temp;
    }
}
