package yuown.hackerrank;

public class Perms {
	public static void main(String[] args) {
		String a = "123";
		genPerms(a.toCharArray(), 0, a.length());
	}

	private static void genPerms(char[] a, int s, int l) {
		if(s == l) {
			System.out.println(a);
		} else {
			for (int i = s; i < l; i++) {
				swap(a, i, s);
				genPerms(a, s + 1, l);
				swap(a, i, s);
			}
		}
	}

	private static void swap(char[] a, int i, int s) {
		char sw = a[i];
		a[i] = a[s];
		a[s] = sw;
	}
}
