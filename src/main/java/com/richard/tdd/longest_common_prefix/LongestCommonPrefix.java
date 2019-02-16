package com.richard.tdd.longest_common_prefix;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YaoXiansheng
 * @date 2019/2/16 21:06
 * Description:
 */
public class LongestCommonPrefix {

    /**
     * 找出数组中字符的最大共同前缀字符串
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        if(strs.length == 1) {
            return strs[0];
        }
        boolean result = true;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs[0].length(); i++) {
            char character = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].length() > i) {
                    if(strs[j].charAt(i) != character) {
                        result = false;
                        break;
                    }
                } else {
                    result = false;
                    break;
                }
            }
            if(!result) {
                break;
            }
            sb.append(character);
        }
        return sb.toString();
    }

    /**
     * common prefix highest method, 这一题的leetcode最高效率算法
     * @param strs
     * @return
     */
    public String commonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; ++i) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    break;
                }
            }
        }

        return prefix;
    }
}
