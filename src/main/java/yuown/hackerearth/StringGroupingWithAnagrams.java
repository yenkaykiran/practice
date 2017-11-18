package yuown.hackerearth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class StringGroupingWithAnagrams {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		Map<String, ArrayList<String>> g = new HashMap<String, ArrayList<String>>();
		for (int i = 0; i < t; i++) {
			String line = s.nextLine();
			String key = line.charAt(0) + "" + line.charAt(line.length() - 1);
			if (!g.containsKey(key)) {
				g.put(key, new ArrayList<String>());
			}
			ArrayList<String> list = g.get(key);
			for (int j = 0; j < list.size(); j++) {
				boolean f = isAnagram(list.get(j), line);
				if (f) {
					list.add(line);
				}
			}
		}
		System.out.println(g.keySet().size());
		s.close();
	}

	private static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		if (a.charAt(0) != b.charAt(0) && a.charAt(a.length() - 1) != b.charAt(b.length() - 1)) {
			return false;
		}

		int[] A1 = new int[26];
		int[] A2 = new int[26];
		for (int i = 1; i < a.length() - 1; i++) {
			char c = a.charAt(i);
			A1[c - 'a']++;
		}
		for (int i = 1; i < b.length() - 1; i++) {
			char c = b.charAt(i);
			A2[c - 'a']++;
		}
		int c1 = 0, c2 = 0;
		for (int i = 0; i < 26; i++) {
			c1 += A1[i];
			c2 += A2[i];
		}
		return c1 == c2;
	}
}