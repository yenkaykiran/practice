package yuown.p2021.twilio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A2 {

	public static void main(String[] args) {
		List<Integer> items = new ArrayList<>();
		items.add(8);
		items.add(7);
		items.add(3);
		items.add(5);
		items.add(1);
		items.add(1);
		items.add(5);
		items.add(5);
		items.add(4);
		items.add(5);
		items.add(4);
		items.add(4);
		itemsSort(items);
	}

	public static List<Integer> itemsSort(List<Integer> items) {
		// Write your code here
		List<Integer> unique = new ArrayList<>();
		List<Integer> dups = new ArrayList<>();
		List<Integer> sorted = new ArrayList<>();
		Map<Integer, Integer> counts = new HashMap<>();
		for (int val : items) {
			if (!counts.containsKey(val)) {
				counts.put(val, 0);
			}
			counts.put(val, counts.get(val) + 1);
		}
		for (int val : items) {
			if (counts.get(val) > 1) {
				dups.add(val);
			} else {
				unique.add(val);
			}
		}
		Collections.sort(unique);
		dups = dups.stream().sorted(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return counts.get(o2) - counts.get(o1);
			}
		}).collect(Collectors.toList());
		 Collections.reverse(dups);
		sorted.addAll(unique);
		sorted.addAll(dups);
		// System.out.println("Counts: " + counts);
		System.out.println("Unique: " + unique);
		System.out.println("dups: " + dups);
		return sorted;
	}

}
