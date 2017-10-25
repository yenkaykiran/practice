package yuown.hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
            unsorted[unsorted_i] = in.next();
        }
        Comparator<String> comp = new Comparator<String>() {
            public int compare(String o1, String o2) {
                int r = o1.length() - o2.length();
                if (r == 0) {
                    r = o1.compareTo(o2);
                }
                return r;
            }
        };
        Arrays.sort(unsorted, comp);
        for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
            System.out.println(unsorted[unsorted_i]);
        }
    }
}