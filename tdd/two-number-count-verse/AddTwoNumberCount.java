package com.test.enu;

import java.util.ArrayList;
import java.util.List;

/**
* @author RichardYao richardyao@tvunetworks.com
* @date 2018年6月29日 下午1:33:12
*/
public class AddTwoNumberCount {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int[] value1 = averseListToNumberArray(l1);
		int[] value2 = averseListToNumberArray(l2);
		int[] valueArray = addTwoBigInteger(value1, value2);
		return generateTestData(valueArray);
	}
	
	private int[] addTwoBigInteger(int[] number1, int[] number2) {
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
	
	private int[] averseListToNumberArray(ListNode list) {
		List<Integer> result = new ArrayList<>();
		for(ListNode temp = list; temp != null; temp = temp.next) {
			result.add(temp.val);
		}
		int[] resultArray = new int[result.size()];
		for(int i = 0; i < result.size(); i++) {
			resultArray[i] = result.get(i);
		}
		return resultArray;
	}
	
	private ListNode generateTestData(int[] array) {
		ListNode head = null;
		ListNode handler1 = null;
		for(int i = 0; i < array.length; i++) {
			if(i == 0) {
				handler1 = new ListNode(array[i]);
				head = handler1;
			} else {
				ListNode temp = new ListNode(array[i]);
				handler1.next = temp;
				handler1 = temp;
			}
		}
		return head;
	}
}

class ListNode {
	int val;
	ListNode next;
	
	public ListNode (int x) { 
		val = x; 
	}
}