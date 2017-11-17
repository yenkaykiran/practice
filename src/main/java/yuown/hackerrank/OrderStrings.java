package yuown.hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderStrings {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		List<String> input = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			input.add(s.nextLine());
		}
		String[] cmd = s.nextLine().split(" ");
		sort(input, Integer.parseInt(cmd[0]), Boolean.parseBoolean(cmd[1]), cmd[2]);
		for (String line : input) {
			System.out.println(line);
		}
		s.close();
	}

	private static void sort(List<String> input, final int column, boolean reverse, final String sortType) {
		Collections.sort(input, new Comparator<String>() {
			@Override
			public int compare(String arg0, String arg1) {
				String[] f = arg0.split(" ");
				String[] s = arg1.split(" ");
				if (sortType.equals("lexicographic")) {
					return f[column - 1].compareTo(s[column - 1]);
				} else {
					return new BigInteger(f[column - 1]).compareTo(new BigInteger(s[column - 1]));
				}
			}
		});
		if(reverse) {
			Collections.reverse(input);
		}
	}
}
