package com.richard.tdd.sort_algorithms;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YaoXiansheng
 * @date 2019/3/10 12:28
 * Description: 归并排序
 */
public class MergeSort {

    /**
     * 归并排序的核心是将一个数组两两划分，一直到最后一个数字，然后再递归合并，形成新的有序数组
     * 时间复杂度nlogn
     * @param array
     */
    public int[] sort(int[] array) {
        if(array == null) {
            return new int[0];
        }
        if(array.length == 1) {
            return array;
        }
        int mid = array.length / 2;
        // 将数组从中间位置左右两边划分
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        // 将数组划分成左右两边，分别继续递归划分
        left = sort(left);
        right = sort(right);
        // 合并分解之后的有序数组
        return merge(left, right);
    }

    /**
     * 数组归并，这里传入的都是已经各自有序的数组了
     * @param left
     * @param right
     * @return
     */
    private int[] merge(int[] left, int[] right) {
        if(left == null) {
            left = new int[0];
        }
        if(right == null) {
            right = new int[0];
        }
        int[] result = new int[left.length + right.length];
        int seq = 0, li = 0, ri = 0;
        // 比较两个有序数组，依照升序依次合并
        while(li < left.length && ri < right.length) {
            if(left[li] < right[ri]) {
                result[seq] = left[li];
                li++;
            } else {
                result[seq] = right[ri];
                ri++;
            }
            seq++;
        }
        // 如果左边数组有剩余的，则全部合并到result数组中
        seq = mergeArray(left, li, result, seq);
        mergeArray(right, ri, result, seq);
        return result;
    }

    /**
     * 将数组合并, 由于java的入栈会将基础变量copy到当前栈帧中执行，因此这里seq的变更无法影响外部调用的变更，需要将seq的值返回
     * @param array
     * @param startIdx
     * @param result
     * @param seq
     */
    private int mergeArray(int[] array, int startIdx, int[] result, int seq) {
        if(startIdx < array.length) {
            for(int i = startIdx; i < array.length; i++) {
                result[seq] = array[i];
                seq++;
            }
        }
        return seq;
    }
}
