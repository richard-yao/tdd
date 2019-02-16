package com.richard.tdd.test.longest_common_prefix;

import com.richard.tdd.longest_common_prefix.LongestCommonPrefix;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YaoXiansheng
 * @date 2019/2/16 21:36
 * Description:
 */
public class LongestCommonPrefixTest {

    @Test
    public void testFeature() {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        Assert.assertEquals("fl", lcp.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        Assert.assertEquals("", lcp.longestCommonPrefix(new String[]{"dog","racecar","car"}));

        Assert.assertEquals("fl", lcp.commonPrefix(new String[]{"flower","flow","flight"}));
        Assert.assertEquals("", lcp.commonPrefix(new String[]{"dog","racecar","car"}));
    }
}
