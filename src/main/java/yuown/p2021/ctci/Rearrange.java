package yuown.p2021.ctci;

import java.util.HashSet;
import java.util.Set;

public class Rearrange {

	public static void main(String[] args) {
		int[] arr = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		System.out.println("Before: " + stringify(arr));
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[j] == i) {
//					int t = arr[i];
//					arr[i] = arr[j];
//					arr[j] = t;
//				}
//			}
//		}
		
//		Set<Integer> set = new HashSet<>();
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] != -1) {
//				set.add(arr[i]);
//			}
//		}
//		for(int i = 0; i < arr.length; i++) {
//			if(set.contains(i)) {
//				arr[i] = i;
//			} else {
//				arr[i] = -1;
//			}
//		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= 0) {
				int elemPos = arr[i];
				
				int t = arr[elemPos];
				arr[elemPos] = arr[i];
				arr[i] = t;
			}
		}
		
		System.out.println("After:  " + stringify(arr));
	}

	private static String stringify(int[] arr) {
		StringBuilder sb = new StringBuilder();
		for (int e : arr) {
			sb.append(e + ", ");
		}
		return sb.toString();
	}
}
