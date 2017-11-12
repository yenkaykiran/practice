package yuown.java;

import java.util.HashMap;

public class HashMapTests {
	public static void main(String[] args) {
		// Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		// table.put(1, "one");
		// table.put(null, "null");
		// System.out.println(table);

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(null, "null");
		System.out.println(map);
	}
}
