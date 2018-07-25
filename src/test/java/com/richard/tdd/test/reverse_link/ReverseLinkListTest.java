package com.richard.tdd.test.reverse_link;

import com.richard.tdd.reverse_link.NodeObj;
import com.richard.tdd.reverse_link.ReverseLinkList;
import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkListTest {

    @Test
    public void testReverseLink() {
        ReverseLinkList testClass = new ReverseLinkList();
        NodeObj testLink = testClass.initNodeLink(5);
        Assert.assertEquals(1, testLink.value);
        NodeObj reverseLink = testClass.reverseLink(testLink);
        Assert.assertEquals(5, reverseLink.value);
    }
}
