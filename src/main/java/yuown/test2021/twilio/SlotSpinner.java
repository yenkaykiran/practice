package yuown.test2021.twilio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SlotSpinner {

	public static void main(String[] args) {
		List<String> history = new ArrayList<>();
//		history.add("137");
//		history.add("364");
//		history.add("115");
//		history.add("724");
		
		history.add("712");
		history.add("246");
		history.add("365");
		history.add("312");

		System.out.println("Spins = " + slotSpins(history));
	}

	private static int slotSpins(List<String> history) {
		return slotSpinHelper(history, 0, history.get(0).length());
	}

	private static int slotSpinHelper(List<String> history, int current, int length) {
		if (length == 0) {
			return current;
		}
		List<Integer> maxs = new ArrayList<>();
		for (int i = 0; i < history.size(); i++) {
			String h = history.get(i);
			int max = findMax(h.toCharArray());
			maxs.add(max);
			history.set(i, h.replaceFirst(max + "", ""));
		}
		return current + slotSpinHelper(history, Collections.max(maxs), length - 1);
	}

	private static int findMax(char[] cs) {
		List<Integer> roll = new ArrayList<>();
		for (int c : cs) {
			roll.add(c - 48);
		}
		return Collections.max(roll);
	}
}
