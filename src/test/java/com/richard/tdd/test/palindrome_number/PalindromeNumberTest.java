package com.richard.tdd.test.palindrome_number;

import com.richard.tdd.palindrome_number.PalindromeNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YaoXiansheng
 * @date 2019/2/16 20:05
 * Description:
 */
public class PalindromeNumberTest {

    @Test
    public void testPalindromeNumber() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        Assert.assertTrue(palindromeNumber.isPalindrome(121));
        Assert.assertFalse(palindromeNumber.isPalindrome(-10));
        Assert.assertFalse(palindromeNumber.isPalindrome(10));
    }
}
