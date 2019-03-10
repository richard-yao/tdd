package com.richard.tdd.test.sort_algorithms;

import com.richard.tdd.sort_algorithms.MergeSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YaoXiansheng
 * @date 2019/3/10 12:30
 * Description:
 */
public class MergeSortTest {

    @Test
    public void testSort() {
        MergeSort test = new MergeSort();
        int[] array = {34, 78, 1, 12, 90, 111, 54, 70, 63};
        Assert.assertArrayEquals(new int[] {1, 12, 34, 54, 63, 70, 78, 90, 111}, test.sort(array));
        int[] array2 = {3433, 3356, 67, 12334, 878667, 387};
        Assert.assertArrayEquals(new int[]{67, 387, 3356, 3433, 12334, 878667}, test.sort(array2));
    }
}
