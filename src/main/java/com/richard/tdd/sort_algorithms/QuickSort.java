package com.richard.tdd.sort_algorithms;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YaoXiansheng
 * @date 2019/3/10 13:12
 * Description: 快速排序算法
 */
public class QuickSort {

    /**
     * 快速排序的原理是，给定一个数组，选择某个值，比它小的在左边，比它大的在右边，这样该值在数组中的最终位置得以确认
     * 对左右两边的子数组，依次往复执行该操作，直到最终排序完成
     * @param array
     */
    public void sort(int[] array) {
        qsort(array, 0, array.length - 1);
    }

    private void qsort(int[] array, int low, int high) {
        if(low < high) {
            // 将数组分为两部分
            int pivot = partition(array, low, high);
            // 递归排序左子数组
            qsort(array, low, pivot - 1);
            // 递归排序右子数组
            qsort(array, pivot + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        // 确认枢轴记录
        int pivot = adjustPivot(array, low, high);
        while(low < high) {
            // 从右往左遍历，比枢轴数据大的不动
            while(low < high && array[high] >= pivot) {
                high--;
            }
            // 将比枢轴小的数据交换到左边
            array[low] = array[high];
            // 从左往右遍历，比枢轴小的不动
            while(low < high && array[low] <= pivot) {
                low++;
            }
            // 将比枢轴大的交换到右边
            array[high] = array[low];
        }
        // 记录枢轴的数据
        array[low] = pivot;
        // 返回枢轴位置
        return low;
    }

    /**
     * 默认取数组第一个值作为枢轴并不好，对于快排的一个优化就是取array[low], array[hight], array[(low + high)/2]的中值,
     * 这里就是调整三数值，并将枢轴值放入low位置
     * @param array
     * @param low
     * @param high
     * @return
     */
    private int adjustPivot(int[] array, int low, int high) {
        // 这种处理是为了防止内存溢出取得中间位置
        int mid = low + (high - low) >> 1;
        // 目标：array[mid] <= array[high]
        if(array[mid] > array[high]) {
            swap(array, mid, high);
        }
        // 目标：array[low] <= array[high]
        if(array[low] > array[high]) {
            swap(array, low, high);
        }
        // 目标：array[low] >= array[mid]
        if(array[mid] > array[low]) {
            swap(array, mid, low);
        }
        // low的位置上保存着这三个位置的中间值
        return array[low];
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
