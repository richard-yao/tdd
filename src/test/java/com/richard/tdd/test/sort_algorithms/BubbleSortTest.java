package com.richard.tdd.test.sort_algorithms;

import com.richard.tdd.sort_algorithms.BubbleSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YaoXiansheng
 * @date 2019/3/9 10:40
 * Description:
 */
public class BubbleSortTest {

    @Test
    public void testSort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {234, 224, 2, 45, 87, 23, 0, 129, 3333};
        bubbleSort.sort(array);
        Assert.assertArrayEquals(new int[]{0, 2, 23, 45, 87, 129, 224, 234, 3333}, array);
    }
}
