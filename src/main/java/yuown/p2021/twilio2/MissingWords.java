package yuown.p2021.twilio2;

import java.util.ArrayList;
import java.util.List;

public class MissingWords {

	public static void main(String[] args) {
		String s = "I am using Hackerrank to improve Programming";
		String t = "am Hackerrank to improve";
		System.out.println(missingWords(s, t));
	}

	private static List<String> missingWords(String s, String t) {
		String[] s1 = s.split(" ");
		String[] t1 = t.split(" ");
		List<String> l = new ArrayList<>();
		for (int i = 0, j = 0; i < s1.length; i++) {
			if (!s1[i].equals(t1[j])) {
				l.add(s1[i]);
			} else if (j < t1.length - 1) {
				j++;
			}
		}
		return l;
	}
}
