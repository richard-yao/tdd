package com.test.enu;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author RichardYao richardyao@tvunetworks.com
 * @date 2018年6月28日 下午5:06:30
 */
public class ExampleCode {

	public int trap(int[] height) {
		int ans = 0;
		int size = height.length;
		for (int i = 1; i < size - 1; i++) {
			int max_left = 0, max_right = 0;
			for (int j = i; j >= 0; j--) { // Search the left part for max bar size
				max_left = Math.max(max_left, height[j]);
			}
			for (int j = i; j < size; j++) { // Search the right part for max bar size
				max_right = Math.max(max_right, height[j]);
			}
			ans += Math.min(max_left, max_right) - height[i];
		}
		return ans;
	}
	
	public int trapWithDynamicProgram(int[] height) {
		if (height == null)
			return 0;
		int ans = 0;
		int size = height.length;
		int[] left_max = new int[size];
		int[] right_max = new int[size];
		left_max[0] = height[0];
		for (int i = 1; i < size; i++) {
			left_max[i] = Math.max(height[i], left_max[i - 1]);
		}
		right_max[size - 1] = height[size - 1];
		for (int i = size - 2; i >= 0; i--) {
			right_max[i] = Math.max(height[i], right_max[i + 1]);
		}
		for (int i = 1; i < size - 1; i++) {
			ans += Math.min(left_max[i], right_max[i]) - height[i];
		}
		return ans;
	}
	
	public int trapWithStackProgram(int[] height) {
		int ans = 0, current = 0;
		Deque<Integer> st = new ArrayDeque<>();
		while (current < height.length) {
			while (!st.isEmpty() && height[current] > height[st.getFirst()]) {
				int top = st.getFirst();
				st.pop();
				if (st.isEmpty())
					break;
				int distance = current - st.getFirst() - 1;
				int bounded_height = Math.min(height[current], height[st.getFirst()]) - height[top];
				ans += distance * bounded_height;
			}
			st.push(current++);
		}
		return ans;
	}
}
