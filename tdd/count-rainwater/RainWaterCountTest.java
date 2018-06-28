package com.test.enu;
/**
* @author RichardYao richardyao@tvunetworks.com
* @date 2018年6月28日 下午2:28:25
*/

import org.junit.Assert;
import org.junit.Test;

public class RainWaterCountTest {

	@Test
	public void testRainWaterCount() {
		RainWaterCount test = new RainWaterCount();
		Assert.assertEquals(1, test.countRainWaterTotal(new int[]{1,3,2,4}));
		Assert.assertEquals(2, test.countRainWaterTotal(new int[]{1,3,2,2,4}));
		Assert.assertEquals(8, test.countRainWaterTotal(new int[]{1,3,2,4,1,3,1,4}));
		Assert.assertEquals(15, test.countRainWaterTotal(new int[]{1,3,2,4,1,3,1,4,5,2,2,1,4,2,2}));
	}
}
