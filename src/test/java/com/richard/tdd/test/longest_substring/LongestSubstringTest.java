package com.richard.tdd.test.longest_substring;

import com.richard.tdd.longest_substring.CountLongestSubstring;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @author richard_xsyao
 * @date 2019/1/28 13:43
 * Description:
 */
public class LongestSubstringTest {

    private static String TEST_STRING = null;

    @Before
    public void initializeReadString() {
        InputStream fileStream = LongestSubstringTest.class.getResourceAsStream("/LongestSubstring.txt");
        try {
            TEST_STRING = IOUtils.toString(fileStream, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLongestSubstring() {
        CountLongestSubstring object = new CountLongestSubstring();
        Assert.assertEquals(1, object.lengthOfLongestSubstring(" "));
        Assert.assertEquals(2, object.lengthOfLongestSubstring("au"));
        Assert.assertEquals(1, object.lengthOfLongestSubstring("bbb"));
        Assert.assertEquals(3, object.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(3, object.lengthOfLongestSubstring("pwwkew"));
        Assert.assertEquals(95, object.lengthOfLongestSubstringOptimize(TEST_STRING));
    }
}