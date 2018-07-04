package com.richard.tdd.test.big_integer_addition;

import com.richard.tdd.big_integer_addition.BigIntegerAddition;
import org.junit.Assert;
import org.junit.Test;

public class BigIntegerAdditionTest {

    @Test
    public void testAddTwoBigInteger() {
        BigIntegerAddition test = new BigIntegerAddition();
        Assert.assertArrayEquals(new int[]{5, 3}, test.addTwoBigInteger(new int[]{3, 2}, new int[]{2, 1}));
        Assert.assertArrayEquals(new int[]{0,0,0,0,0,0,0,0,0,0,1}, test.addTwoBigInteger(new int[]{9}, new int[]{1,9,9,9,9,9,9,9,9,9}));
    }
}
