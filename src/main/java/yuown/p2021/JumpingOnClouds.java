package yuown.p2021;

import java.util.ArrayList;
import java.util.List;

public class JumpingOnClouds {

	public static void main(String[] args) {
		List<Integer> c = new ArrayList<>();
		c.add(0);
		c.add(0);
//		c.add(0);
		c.add(1);
		c.add(0);
		c.add(0);
		c.add(1);
		c.add(0);
		System.out.println(jumpingOnClouds(c));
	}

	public static int jumpingOnClouds(List<Integer> c) {
		// Write your code here
		int steps = 0;
		for (int pos = 0; pos < c.size();) {
			if (pos + 2 < c.size() && c.get(pos + 2) == 0) {
				pos += 2;
				steps++;
			} else if (pos + 1 < c.size() && c.get(pos + 1) == 0) {
				pos++;
				steps++;
			} else {
				pos++;
			}
		}
		return steps;
	}
}
