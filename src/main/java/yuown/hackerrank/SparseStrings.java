package yuown.hackerrank;

import java.util.Scanner;

public class SparseStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.next();
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println(findOccurences(strings, scanner.next()));
        }
    }

    private static int findOccurences(String[] strings, String next) {
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(next)) {
                count++;
            }
        }
        return count;
    }
}
