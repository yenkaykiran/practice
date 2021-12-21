package yuown.p2021.leetcode;

public class CountSpecialQuadruplets {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 3, 5 };
		System.out.println(countQuadruplets(nums));
	}

	public static int countQuadruplets(int[] nums) {
		int count = 0;
		int size = nums.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				for (int k = j + 1; k < size; k++) {
					for (int l = k + 1; l < size; l++) {
						if (nums[i] + nums[j] + nums[k] == nums[l]
								&& (i < j && j < k && k < l)) {
							count++;
						}
					}
				}
			}
		}
		return count;
	}
}
