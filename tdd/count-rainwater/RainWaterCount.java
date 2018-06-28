package com.test.enu;
/**
* @author RichardYao richardyao@tvunetworks.com
* @date 2018年6月28日 下午2:27:34
* {@link} https://techdevguide.withgoogle.com/paths/advanced/sequence-2/volume-of-water#! 
*/
public class RainWaterCount {

	public int countRainWaterTotal(int[] params) {
		int result = 0;
		if(params.length >= 3) {
			for(int i = 0; i < params.length - 2;) {
				int headVal = params[i];
				int middleVal = params[i + 1];
				if(headVal > middleVal) { //  First value bigger than middle one
					int endIdx = 0;
					int maxMiddle = 0;
					int maxMiddleIdx = 0;
					for(int j = i + 2; j < params.length; j++) {
						if(params[j] >= headVal) { // the end value bigger then head value
							endIdx = j;
							break;
						} else {
							if(params[j] > maxMiddle) {
								maxMiddle = params[j];
								maxMiddleIdx = j;
							}
						}
					}
					if(endIdx > 0) {
						result += countTotalSum(params, i, endIdx);
						i = endIdx;
					} else if(maxMiddleIdx > 0) {
						result += countTotalSum(params, i, maxMiddleIdx);
						i = maxMiddleIdx;
					} else {
						i++;
					}
				} else {
					i++;
				}
			}
		}
		return result;
	}
	
	public int countTotalSum(int[] params, int i, int j) {
		int sum = 0;
		int headVal = params[i];
		int endVal = params[j];
		int smallerOne = headVal > endVal ? endVal : headVal;
		for(int k = i+1; k < j; k++) {
			sum += smallerOne - params[k];
		}
		return sum;
	}
}
