package com.richard.tdd.palindrome_number;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YaoXiansheng
 * @date 2019/2/16 19:54
 * Description:
 */
public class PalindromeNumber {

    /**
     * 给定值判断数值是否是回文数，所谓回文数就是数组顺序颠倒依旧是自身
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if(x < 0) {
            // 负数绝对不是回文数
            return false;
        } else if(x  < 10) {
            // 10以内的单个整数都是回文数
            return true;
        }
        char[] numberArray = String.valueOf(x).toCharArray();
        int totalNumberLength = numberArray.length;
        boolean result = true;
        for(int i = 0; i <= totalNumberLength / 2; i++) {
            if(numberArray[i] != numberArray[totalNumberLength - i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
