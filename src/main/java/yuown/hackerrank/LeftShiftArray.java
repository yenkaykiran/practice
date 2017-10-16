package yuown.hackerrank;

import java.util.Scanner;

public class LeftShiftArray {

    static int[] leftRotation(int[] a, int d) {
        for (int r = 1; r <= d; r++) {
            for (int i = 1; i < a.length; i++) {
                int t = a[i - 1];
                a[i - 1] = a[i];
                a[i] = t;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");

        in.close();
    }

}
