package com.test.enu;

import org.junit.Assert;
import org.junit.Test;


/**
* @author RichardYao richardyao@tvunetworks.com
* @date 2018年6月28日 下午5:08:13
*/
public class ExampleCodeTest {

	@Test
	public void testAlgothrim() {
		ExampleCode test = new ExampleCode();
		Assert.assertEquals(15, test.trap(new int[]{1,3,2,4,1,3,1,4,5,2,2,1,4,2,2}));
		Assert.assertEquals(15, test.trapWithDynamicProgram(new int[]{1,3,2,4,1,3,1,4,5,2,2,1,4,2,2}));
		Assert.assertEquals(15, test.trapWithStackProgram(new int[]{1,3,2,4,1,3,1,4,5,2,2,1,4,2,2}));
	}
}
