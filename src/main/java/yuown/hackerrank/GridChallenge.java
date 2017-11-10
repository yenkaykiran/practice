package yuown.hackerrank;

import java.util.Arrays;
import java.util.Scanner;


// Not Working
public class GridChallenge {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tc = s.nextInt();
		String[][] input = new String[tc][];
		for (int i = 0; i < tc; i++) {
			int size = s.nextInt();
			String n = s.nextLine();
			int readTill = 0;
			input[i] = new String[size];
			while (readTill < size) {
				n = s.nextLine();
				input[i][readTill] = n;
				readTill++;
			}
		}
		for (int i = 0; i < tc; i++) {
			String[] lines = input[i];
			char[] line = lines[0].toCharArray();
			Arrays.sort(line);
			char max = line[line.length - 1];

			boolean flag = false;
			for (int k = 1; k < line.length; k++) {
				char[] line1 = lines[k].toCharArray();
				Arrays.sort(line1);
				char max1 = line1[0];
				if (max > max1) {
					flag = true;
					break;
				}
				max = line1[line1.length - 1];
			}
			if (flag) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
		s.close();
	}
}
