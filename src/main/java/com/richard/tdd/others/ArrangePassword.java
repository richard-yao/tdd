package com.richard.tdd.others;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YaoXiansheng
 * @date 2019/3/10 18:37
 * Description:
 */
public class ArrangePassword {

    int totalNumber = 0;

    // a,b,c,d,e 5个字符的全排列，可重复
    public void callLetterList(ArrayList<String> list, ArrayList<String> result) {
        if(list.size() == result.size()) {
            System.out.println(result);
            totalNumber++;
            return;
        }
        for(String letter : list) {
            ArrayList<String> newResult = (ArrayList<String>) result.clone();
            newResult.add(letter);
            callLetterList(list, newResult);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
        ArrangePassword arrangePassword = new ArrangePassword();
        arrangePassword.callLetterList(list, new ArrayList<>());
        System.out.println(String.format("total number: %d", arrangePassword.totalNumber));
    }
}
