package com.test.tdd;
/**
* @author RichardYao richardyao@tvunetworks.com
* @date 2018年6月27日 下午4:51:10
* {@link} https://techdevguide.withgoogle.com/paths/advanced/compress-decompression#! 
*/
public class AnalysisCompressString {

	public String decompressString(String input) {
		String result = "";
		while(input.indexOf("[") > 0) {
			int start = input.indexOf("[");
			int digit = Integer.parseInt(input.substring(0, start));
			int end = input.indexOf("]");
			String repeatStr = input.substring(start+1, end);
			for(int i = 0 ; i < digit; i++) {
				result += repeatStr;
			}
			if(end < input.length() - 1) {
				input = input.substring(end + 1, input.length());
			} else {
				input = "";
			}
		}
		result += input;
		return result;
	}
	
	public String analysisComplexString(String input) {
		String result = "";
		int head = input.indexOf("[");
		int end = input.lastIndexOf("]");
		String extractStr = input.substring(head + 1, end) + "]";
		if(extractStr.indexOf("[") > 0) {
			String tempResult = analysisComplexString(extractStr);
			String newInput = input.substring(0, head + 1) + tempResult + input.substring(end + 1, input.length());
			result = decompressString(newInput);
		} else {
			result = decompressString(input);
		}
		return result;
	}
}
