package com.richard.tdd.test.roman_to_integer;

import com.richard.tdd.roman_to_integer.RomanToInteger;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YaoXiansheng
 * @date 2019/2/16 20:50
 * Description:
 */
public class RomanToIntegerTest {

    @Test
    public void testRomanToInteger() {
        RomanToInteger romanToInteger = new RomanToInteger();
        Assert.assertEquals(3, romanToInteger.romanToInt("III"));
        Assert.assertEquals(4, romanToInteger.romanToInt("IV"));
        Assert.assertEquals(58, romanToInteger.romanToInt("LVIII"));
        Assert.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
}
