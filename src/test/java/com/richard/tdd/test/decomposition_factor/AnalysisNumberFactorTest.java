package com.richard.tdd.test.decomposition_factor;

import com.richard.tdd.decomposition_factor.AnalysisNumberFactor;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AnalysisNumberFactorTest {

    @Test
    public void testAnalysisNumber() {
        AnalysisNumberFactor test = new AnalysisNumberFactor();
        Assert.assertEquals(Arrays.asList(2), test.analysisNumberFactor(2));
        Assert.assertEquals(Arrays.asList(3), test.analysisNumberFactor(3));
        Assert.assertEquals(Arrays.asList(2, 2), test.analysisNumberFactor(4));
        Assert.assertEquals(Arrays.asList(2, 2, 2), test.analysisNumberFactor(8));
        Assert.assertEquals(Arrays.asList(3, 3), test.analysisNumberFactor(9));
        Assert.assertEquals(Arrays.asList(2, 2, 3, 3, 5), test.analysisNumberFactor(180));
    }
}
