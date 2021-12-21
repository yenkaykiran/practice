package yuown.p2021.twilio2;

import java.util.ArrayList;
import java.util.List;

public class Q1 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		int k = 5;
//		nums.add(7);
//		nums.add(2);
//		nums.add(3);
//		nums.add(5);
//		nums.add(6);
//		nums.add(7);
//		nums.add(4);
//		nums.add(3);
		
		nums.add(5);
		nums.add(10);
		nums.add(11);
		nums.add(9);
		nums.add(5);
		kSub(k, nums);
		
	}

	public static long kSub(int k, List<Integer> nums) {
	    // Write your code here
	        int size = nums.size();
	        long count = 0;
	        for(int i = 0; i < size; i++) {
	            for(int j = i; j < size; j++) {
	                long sum = subSum(i, j, nums);
	                if(sum > 0 && sum % k == 0) {
	                    count++;
	                    //System.out.println("Sum = " + sum);
	                }
	            }
	        }
	        return count;
	    }
	    
	    private static long subSum(int s, int e, List<Integer> nums) {
	        long sum = 0;
	        for(int i = s; i <= e; i++) {
	            sum += nums.get(i);
	            //System.out.print(nums.get(i) + " ");
	        }
	        //System.out.println();
	        return sum;
	    }

}


