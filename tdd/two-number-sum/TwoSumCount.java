package com.test.enu;

/**
 * @author RichardYao richardyao@tvunetworks.com
 * @date 2018年6月28日 下午6:21:47
 */
public class TwoSumCount {

	public int[] twoSumCount(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int remain = target - nums[i];
			for (int j = i+1; j < nums.length; j++) {
				if (remain == nums[j]) {
					result[0] = i;
					result[1] = j;
					break;
				}
			}
		}
		return result;
	}
}
