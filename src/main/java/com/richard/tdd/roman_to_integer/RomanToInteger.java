package com.richard.tdd.roman_to_integer;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YaoXiansheng
 * @date 2019/2/16 20:24
 * Description:
 */
public class RomanToInteger {

    private static char[] ROMAN_ARRAY = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

    private static int[] INT_ARRAY = {1, 5, 10, 50, 100, 500, 1000};

    private static HashMap<Character, Integer> proxy_map = new HashMap<>(16);

    static {
        for(int i = 0; i < ROMAN_ARRAY.length; i++) {
            proxy_map.put(ROMAN_ARRAY[i], INT_ARRAY[i]);
        }
    }

    /**
     * 罗马字符数学运算
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        int totalValue = 0;
        int lastValue = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            Integer tempValue = proxy_map.get(s.charAt(i));
            if(tempValue < lastValue) {
                totalValue -= tempValue;
            } else {
                totalValue += tempValue;
            }
            lastValue = tempValue;
        }
        return totalValue;
    }
}
