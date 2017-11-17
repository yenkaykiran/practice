package yuown.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factorial {
	public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int tests = Integer.parseInt(s.nextLine());
        for(int i = 0; i < tests; i++) {
            int people = Integer.parseInt(s.nextLine());
            long result = factorial(people) / (factorial(people - 2));
			System.out.println(result % 1000000007);
        }
    }
    
    private static long factorial(int n) {
        List<Long> arr = new ArrayList<Long>(n);
        return factorial(n, arr);
    }
    
    private static long factorial(int n, List<Long> arr) {
        if(n == 0) {
            return 1;
        }
        if(n == 1) {
            arr.set(0, 1L);
            return 1;
        }
        return factorial(n - 1, arr) * n;
    }
}
