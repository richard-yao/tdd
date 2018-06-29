package com.test.enu;

import org.junit.Assert;
import org.junit.Test;

/**
* @author RichardYao richardyao@tvunetworks.com
* @date 2018年6月28日 下午6:22:37
*/
public class TwoSumCountTest {

	@Test
	public void testTwoSumCount() {
		TwoSumCount test = new TwoSumCount();
		Assert.assertArrayEquals(new int[]{0, 1}, test.twoSumCount(new int[]{2, 7, 11, 15}, 9));
		Assert.assertArrayEquals(new int[]{0, 1}, test.twoSumCount(new int[]{3, 3}, 6));
		Assert.assertArrayEquals(new int[]{2, 4}, test.twoSumCount(new int[]{-1,-2,-3,-4,-5}, -8));
	}
}
