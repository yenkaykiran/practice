package yuown.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        String[] input = new String[tc];
        for (int i = 0; i < tc; i++) {
//            s.next();
            String n = s.nextLine();
//            while(n.trim().length() == 0) {
//                n = s.nextLine();
//            }
            System.out.println("'" + n + "'");
            input[i] = n;
        }
        for (int i = 0; i < tc; i++) {
            String l = input[i];
            char[] line = l.toCharArray();
            Arrays.sort(line);
            char max = line[line.length - 1];
            for (int j = 1; j < line.length; j++) {
                char[] line1 = s.nextLine().toCharArray();
                Arrays.sort(line1);
                char max1 = line1[0];
                if (max > max1) {
                    System.out.println("NO");
                    break;
                }
                max = line1[line1.length - 1];
            }
            System.out.println("YES");
        }
    }
}
