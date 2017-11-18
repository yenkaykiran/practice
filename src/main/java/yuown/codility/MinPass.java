package yuown.codility;

public class MinPass {
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 4, 5, 7, 29, 30 }));
	}

	private static int solution(int[] A) {
		int total = 0;
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				int diff = A[j] - A[i];
				System.out.println(diff);
				if(diff > 6) {
					total += 7;
					i = j;
				}
			}
			System.out.println();
		}
		return total;
	}
}
