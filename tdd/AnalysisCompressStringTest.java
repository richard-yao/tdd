package com.test.tdd;

import org.junit.Assert;
import org.junit.Test;

/**
* @author RichardYao richardyao@tvunetworks.com
* @date 2018年6月27日 下午4:52:08
*/
public class AnalysisCompressStringTest {

	@Test
	public void testDecompressMethod() {
		AnalysisCompressString testClass = new AnalysisCompressString();
		Assert.assertEquals("aa", testClass.decompressString("2[a]"));
		Assert.assertEquals("aabb", testClass.decompressString("2[a]2[b]"));
		Assert.assertEquals("aabbc", testClass.decompressString("2[a]2[b]c"));
		Assert.assertEquals("abcabcabcababababc", testClass.decompressString("3[abc]4[ab]c"));
		Assert.assertEquals("aaabaaab", testClass.analysisComplexString("2[3[a]b]"));
		Assert.assertEquals("ccdccdccdbccdccdccdb", testClass.analysisComplexString("2[3[1[cc]d]b]"));
	}
}
