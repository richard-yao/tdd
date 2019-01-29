package com.richard.tdd.integer_reverse;

import java.util.ArrayDeque;

/**
 * Created with IntelliJ IDEA.
 *
 * @author richard_xsyao
 * @date 2019/1/28 17:16
 * Description:
 */
public class IntegerReverse {

    /**
     * Transfer int value and return the reverse value
     * @param x
     * @return
     */
    public int reverse(int x) {
        int value = Math.abs(x);
        // 负最小值
        if(x < 0 && value == x) {
            return 0;
        }
        int reverseValue = 1;
        if(x < 0) {
            reverseValue = -1;
        }
        if(value < 10) {
            return x;
        }
        ArrayDeque<Integer> numberArray = analysisValueNumber(String.valueOf(value));
        return reverseValue * generateNumberValue(numberArray);
    }

    private int generateNumberValue(ArrayDeque<Integer> numberArray) {
        int valueNumber = numberArray.size() - 1;
        int number = 0;
        Integer temp = 0;
        while((temp = numberArray.poll()) != null) {
            if(number == 0 && temp == 0) {
                valueNumber--;
            } else {
                number += temp * Math.pow(10, valueNumber);
                // 溢出了
                if(number + 1 < number) {
                    number = 0;
                    break;
                }
                valueNumber--;
            }
        }
        return number;
    }

    /**
     * get every value of one number
     * @param value
     * @return
     */
    private ArrayDeque<Integer> analysisValueNumber(String value) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for(int i = 0; i < value.length(); i++) {
            Character character = value.charAt(i);
            arrayDeque.push(Integer.parseInt(character.toString()));
        }
        return arrayDeque;
    }
}