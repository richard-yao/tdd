package com.richard.tdd.search_algorithms;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YaoXiansheng
 * @date 2019/3/10 17:47
 * Description: 二分查找算法
 */
public class BinarySearch {

    /**
     * 二分查找，在有序数组中查询指定值的位置
     * @param array
     * @param value
     * @return
     */
    public int binSearch(int[] array, int value) {
        int mid = 0;
        int start = 0, end = array.length - 1;
        while(mid <= end) {
            mid = start + (end - start) / 2;
            if(value < array[mid]) {
                end = mid - 1;
            } else if(value > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 使用递归实现二分查找
     * @param array
     * @param start
     * @param end
     * @param value
     * @return
     */
    public int binSearchWithRecursive(int[] array, int start, int end, int value) {
        int mid = start + (end - start) / 2;
        if(start > end) {
            return -1;
        }
        if(value < array[mid]) {
            return binSearchWithRecursive(array, start, mid - 1, value);
        } else if(value > array[mid]) {
            return binSearchWithRecursive(array, mid + 1, end, value);
        } else {
            return mid;
        }
    }
}
