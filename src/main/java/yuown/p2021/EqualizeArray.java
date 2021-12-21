package yuown.p2021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EqualizeArray {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(3);
		arr.add(3);
		System.out.println(equalizeArray(arr));
	}

	public static int equalizeArray(List<Integer> arr) {
		// Write your code here
		Map<Integer, Integer> tracker = new HashMap<>();
		for (int i = 0; i < arr.size(); i++) {
			int elem = arr.get(i);
			if (!tracker.containsKey(arr.get(i))) {
				tracker.put(elem, 0);
			}
			tracker.put(elem, tracker.get(elem) + 1);
		}
		Set<Map.Entry<Integer, Integer>> entries = tracker.entrySet();
		int count = 0;
		for (Map.Entry<Integer, Integer> e : entries) {
			if (e.getKey().intValue() != e.getValue().intValue()) {
				count = count + e.getValue().intValue();
			}
		}
		return count;
	}
}
