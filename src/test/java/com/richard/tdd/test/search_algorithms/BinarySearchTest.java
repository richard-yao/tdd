package com.richard.tdd.test.search_algorithms;

import com.richard.tdd.search_algorithms.BinarySearch;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YaoXiansheng
 * @date 2019/3/10 17:49
 * Description:
 */
public class BinarySearchTest {

    @Test
    public void testSearch() {
        int[] array = new int[]{1,2,34,56,87,98,100,122};
        int value = 122;
        BinarySearch binarySearch = new BinarySearch();
        Assert.assertEquals(7, binarySearch.binSearch(array, value));
        Assert.assertEquals(7, binarySearch.binSearchWithRecursive(array, 0, array.length - 1, value));
    }
}
