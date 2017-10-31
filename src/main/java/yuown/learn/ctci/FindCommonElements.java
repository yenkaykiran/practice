package yuown.learn.ctci;

public class FindCommonElements {

	public static void main(String[] args) {
		int[] a = new int[] { 13, 27, 35, 40, 49, 55, 59 };
		int[] b = new int[] { 17, 35, 39, 40, 55, 58, 60 };
		/* for (int i = 0; i < b.length; i++) {
			for (int j = current; j < a.length; j++) {
				if (b[i] == a[j]) {
					System.out.println(b[i]);
					current = j;
				}
			}
		} */
		int i = 0, j = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				i++;
			} else if (a[i] > b[j]) {
				j++;
			} else {
				System.out.println(a[i]);
				i++;
				j++;
			}
		}
	}
}
