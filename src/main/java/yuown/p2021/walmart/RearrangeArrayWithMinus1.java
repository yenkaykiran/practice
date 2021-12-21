package yuown.p2021.walmart;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RearrangeArrayWithMinus1 {
	
	public static void main(String[] args) {
		int[] arr = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		System.out.println("Before: " + stringify(arr));
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if(arr[j] == i) {
//					int t = arr[j];
//					arr[j] = arr[i];
//					arr[i] = t;
//				}
//			}
//		}
		
//		Set<Integer> set = new HashSet<>();
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] != -1) {
//				set.add(arr[i]);
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			if(set.contains(i)) {
//				arr[i] = i;
//			} else {
//				arr[i] = -1;
//			}
//		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= 0) {
				int rightPos = arr[i];
				int t = arr[i];
				arr[i] = arr[rightPos];
				arr[rightPos] = t;
			}
		}
		System.out.println("After: " + stringify(arr));
	}

	private static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private static String stringify(int[] arr) {
		StringBuilder sb = new StringBuilder();
		for (int i : arr) {
			sb.append(i + " ");
		}
		return sb.toString();
	}

}
