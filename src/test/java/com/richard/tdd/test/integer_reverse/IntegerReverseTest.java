package com.richard.tdd.test.integer_reverse;

import com.richard.tdd.integer_reverse.IntegerReverse;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.Semaphore;

/**
 * Created with IntelliJ IDEA.
 *
 * @author richard_xsyao
 * @date 2019/1/28 17:17
 * Description:
 */
public class IntegerReverseTest {

    @Test
    public void testReverse() {
        IntegerReverse integerReverse = new IntegerReverse();
        Assert.assertEquals(21, integerReverse.reverse(12));
        Assert.assertEquals(-123, integerReverse.reverse(-321));
        Assert.assertEquals(0, integerReverse.reverse(1534236469));
        Assert.assertEquals(0, integerReverse.reverse(-2147483648));

        Semaphore semaphore = new Semaphore(16);
        try {
            semaphore.acquire();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}