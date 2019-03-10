package com.richard.tdd.test.sort_algorithms;

import com.richard.tdd.sort_algorithms.QuickSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YaoXiansheng
 * @date 2019/3/10 13:32
 * Description:
 */
public class QuickSortTest {

    @Test
    public void test() {
        QuickSort quickSort = new QuickSort();
        int[] array = new int[]{23, 43, 22, 8, 98, 1, 7, 67, 92};
        quickSort.sort(array);
        Assert.assertArrayEquals(new int[]{1, 7, 8, 22, 23, 43, 67, 92, 98}, array);
    }
}
