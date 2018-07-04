package com.richard.tdd.big_integer_addition;

import java.util.ArrayList;
import java.util.List;

/**
* @author RichardYao richardyao@tvunetworks.com
* @date 2018年6月29日 下午2:34:49
*/
public class BigIntegerAddition {

	public int[] addTwoBigInteger(int[] number1, int[] number2) {
		int numberLength = Math.max(number1.length, number2.length);
		List<Integer> resultArray = new ArrayList<>();
		int carry = 0;
		for(int i = 0; i < numberLength; i++) {
			int val1 = i >= number1.length ? 0 : number1[i];
			int val2 = i >= number2.length ? 0 : number2[i];
			int temp = val1 + val2 + carry;
			if(temp % 10 == temp) {
				carry = 0;
				resultArray.add(temp);
			} else {
				carry = 1;
				resultArray.add(temp % 10);
			}
		}
		if(carry == 1) { // exist carry
			resultArray.add(carry);
		}
		int[] result = new int[resultArray.size()];
		for(int i = 0; i < result.length; i++) {
			result[i] = resultArray.get(i);
		}
		return result;
	}
}
