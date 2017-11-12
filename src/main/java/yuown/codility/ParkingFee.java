package yuown.codility;

public class ParkingFee {
	public static void main(String[] args) {
		System.out.println(solution("10:00", "13:21"));
	}

	public static int solution(String E, String L) {
		int[] e = parseTime(E);
		int[] t = parseTime(L);

		int totalHrs = t[0] - e[0];
		int totalMins = t[1] - e[1];
		if (totalMins < 0) {
			totalMins = 60 + totalMins;
			totalHrs -= 1;
		}
		totalHrs += Math.ceil(totalMins / 60.0);

		return 2 + 3 + (totalHrs - 1) * 4;
	}

	public static int[] parseTime(String time) {
		String[] t = time.split(":");
		return new int[] { Integer.parseInt(t[0]), Integer.parseInt(t[1]) };
	}
}
