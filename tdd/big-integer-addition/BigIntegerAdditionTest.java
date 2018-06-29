package com.test.enu;

import org.junit.Assert;
import org.junit.Test;

/**
* @author RichardYao richardyao@tvunetworks.com
* @date 2018年6月29日 下午2:39:10
*/
public class BigIntegerAdditionTest {

	@Test
	public void testAddTwoBigInteger() {
		BigIntegerAddition test = new BigIntegerAddition();
		Assert.assertArrayEquals(new int[]{5, 3}, test.addTwoBigInteger(new int[]{3, 2}, new int[]{2, 1}));
		Assert.assertArrayEquals(new int[]{0,0,0,0,0,0,0,0,0,0,1}, test.addTwoBigInteger(new int[]{9}, new int[]{1,9,9,9,9,9,9,9,9,9}));
	}
}
