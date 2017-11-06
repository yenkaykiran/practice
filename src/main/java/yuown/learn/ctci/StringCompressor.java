package yuown.learn.ctci;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringCompressor {
	public static void main(String[] args) {
		String original = "aabbccdd";
		System.out.println("Compressed1: " + compress1(original));
		System.out.println("Compressed2: " + compress2(original));
		System.out.println("Compressed3: " + compress3(original));
	}

	private static String compress3(String original) {
		StringBuilder compressed = new StringBuilder();
		char[] array = original.toCharArray();
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			count++;
			if (i + 1 >= array.length || array[i] != array[i + 1]) {
				compressed.append(array[i]);
				compressed.append(count);
				count = 0;
			}
		}
		return returnCompressed(original, compressed.toString());
	}

	private static String compress2(String original) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] array = original.toCharArray();
		for (int i = 0; i < array.length; i++) { // O(n)
			char current = array[i];
			int count = 0;
			if (!map.containsKey(current)) { // O(1)
				count = 1;
			} else {
				count = map.get(current); // O(1)
				count++;
			}
			map.put(current, count); // O(1)
		}
		StringBuilder str = new StringBuilder();
		Set<Entry<Character, Integer>> entries = map.entrySet();
		for (Entry<Character, Integer> entry : entries) {
			str.append(entry.getKey()).append(entry.getValue());
		}
		String compressed = str.toString();
		return returnCompressed(original, compressed);
	}

	private static String compress1(String original) {
		StringBuilder newStr = new StringBuilder();
		char[] array = original.toCharArray();

		char next = array[0];
		newStr.append(next);

		int count = 1;

		for (int i = 1; i < array.length; i++) {
			if (next == array[i]) {
				count++;
			} else {
				newStr.append(count);
				next = array[i];
				newStr.append(next);
				count = 1;
			}
		}
		newStr.append(count);

		String compressed = newStr.toString();
		return returnCompressed(original, compressed);
	}

	private static String returnCompressed(String original, String compressed) {
		return original.length() == compressed.length() ? original : compressed;
	}
}
