package com.richard.tdd.test.count_rainwater.example;

import com.richard.tdd.count_rainwater.example.ExampleCode;
import org.junit.Assert;
import org.junit.Test;

public class ExampleCodeTest {

    @Test
    public void testAlgothrim() {
        ExampleCode test = new ExampleCode();
        Assert.assertEquals(15, test.trap(new int[]{1,3,2,4,1,3,1,4,5,2,2,1,4,2,2}));
        Assert.assertEquals(15, test.trapWithDynamicProgram(new int[]{1,3,2,4,1,3,1,4,5,2,2,1,4,2,2}));
        Assert.assertEquals(15, test.trapWithStackProgram(new int[]{1,3,2,4,1,3,1,4,5,2,2,1,4,2,2}));
        Assert.assertEquals(1, test.trapWithStackProgram(new int[]{5, 4, 1, 2}));
    }
}
