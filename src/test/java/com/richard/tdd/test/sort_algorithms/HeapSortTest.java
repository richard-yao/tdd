package com.richard.tdd.test.sort_algorithms;

import com.richard.tdd.sort_algorithms.HeapSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YaoXiansheng
 * @date 2019/3/9 23:48
 * Description:
 */
public class HeapSortTest {

    @Test
    public void testSort() {
        HeapSort heapSort = new HeapSort();
        int[] array = new int[] {87,45,78,32,17,65,53,9,122};
        heapSort.sort(array);
        Assert.assertArrayEquals(new int[]{9,17,32,45,53,65,78,87,122}, array);
    }
}
