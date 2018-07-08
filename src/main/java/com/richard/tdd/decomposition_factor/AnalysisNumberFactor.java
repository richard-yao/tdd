package com.richard.tdd.decomposition_factor;

import java.util.ArrayList;
import java.util.List;

public class AnalysisNumberFactor {

    public List<Integer> analysisNumberFactor(int number) {
        List<Integer> resultList = new ArrayList<>();
        for(int i = 2; i < number; i++) {
            while(number % i == 0 && number / i > 1) {
                resultList.add(i);
                number = number / i;
            }
        }
        resultList.add(number);
        return resultList;
    }
}
