package com.richard.tdd.test.compress_decompress;

import com.richard.tdd.compress_decompress.AnalysisCompressString;
import org.junit.Assert;
import org.junit.Test;

public class AnalysisiCompressStringTest {

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
