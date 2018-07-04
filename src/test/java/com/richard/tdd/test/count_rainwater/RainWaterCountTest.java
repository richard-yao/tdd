package com.richard.tdd.test.count_rainwater;

import com.richard.tdd.count_rainwater.RainWaterCount;
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
        Assert.assertEquals(1, test.countRainWaterTotal(new int[]{5, 4, 1, 2}));
    }
}
