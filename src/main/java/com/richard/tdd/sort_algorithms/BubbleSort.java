package com.richard.tdd.sort_algorithms;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YaoXiansheng
 * @date 2019/3/9 9:53
 * Description: 经典算法之冒泡排序
 */
public class BubbleSort {

    /**
     * 冒泡排序在于数据两两之间比较，把最大的或者最小的放到最后，完成升序或者降序的排列
     * @param array
     */
    public void sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                // 两两比较，将较大的值放到后面，这样形成升序
                if(array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    /**
     * 交换位置
     * @param array
     * @param i
     * @param j
     */
    private void swap(int[] array, int i, int j) {
        array[i] = array[i] + array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }
}
