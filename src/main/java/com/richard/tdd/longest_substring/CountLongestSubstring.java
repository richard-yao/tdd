package com.richard.tdd.longest_substring;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @author richard_xsyao
 * @date 2019/1/28 13:42
 * Description:
 */
public class CountLongestSubstring {

    /**
     * 使用滑动窗口来获得最大长度不重复子串的字符串数量n
     * 有两个指针i,j
     * 当后续字符和当前子串中无重复值时，j++
     * 否则i++
     * 优点：以极高的效率获取了最长子串不重复的长度
     * @param s
     * @return
     */
    public int lengthOfLongestSubstringOptimize(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    /**
     * 计算给定字符串的最大不重复子串的长度
     * @return
     */
    public int lengthOfLongestSubstring(String str) {
        if(str == null || str.length() == 0) {
            return 0;
        }
        // 只有一个字符的，直接返回即可
        if(str.length() == 1) {
            return 1;
        } else {
            int maxLength = 0;
            String maxSubstring = null;
            for(int i = 0; i < str.length(); i++) {
                for(int j = i+1; j <= str.length(); j++) {
                    String substring = str.substring(i, j);
                    if(substring.length() > maxLength) {
                        if(checkRepeatCharacter(substring)) {
                            maxSubstring = substring;
                            maxLength = substring.length();
                        }
                    }
                }
            }
            System.out.println(String.format("String \"%s\" contain max length substring: %s", str, maxSubstring));
            return maxLength;
        }
    }

    /**
     * Check substring contains repeated character or not
     * @param substring
     * @return true: no repeated character, false: exist repeated character
     */
    private boolean checkRepeatCharacter(String substring) {
        if(substring == null || substring.length() == 1) {
            return true;
        } else {
            HashSet<Character> characters = new HashSet<>(substring.length());
            for(int i = 0; i < substring.length(); i++) {
                Character character = substring.charAt(i);
                if(!characters.contains(character)) {
                    characters.add(character);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}