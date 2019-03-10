package com.richard.tdd.sort_algorithms;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YaoXiansheng
 * @date 2019/3/9 23:24
 * Description: 堆排序
 */
public class HeapSort {

    /**
     * 对数组进行堆排序
     * @param array
     */
    public void sort(int[] array) {
        // 1.先构建大根堆，即array[n] >= array[2n] && array[n] >= array[2n + 1]
        // 正常来说最后一个非叶子节点是n/2, 由于java中数组从0开始，这里要额外减去1
        for(int i = array.length / 2 - 1; i >= 0; i--) {
            adjustHeap(array, i, array.length);
        }
        // 2.将堆顶元素和堆底元素交换，得到升序排列数组
        for(int i = array.length - 1; i > 1; i--) {
            swap(array, 0, i);
            // 整理，将剩下的元素整理成堆
            adjustHeap(array, 0, i);
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

    /**
     * 调整节点i的二叉树为大根堆结构
     * @param array
     * @param i
     * @param length
     */
    private void adjustHeap(int[] array, int i, int length) {
        // 保留初始i节点的值
        int temp = array[i];
        // 由于父节点是数组中的i，因此第一个子节点是2*i + 1
        for(int k = 2 * i + 1; k < length - 1; k = 2 * k + 1) {
            // 比较左右子树，取较大子树的分支
            if(k < length && array[k] < array[k + 1]) {
                k++;
            }
            // 如果根节点比最大子节点大，则调整结束
            if(temp >= array[k]) {
                break;
            } else {
                // 否则调换父子节点的值，父节点下移到子节点位置，继续调整
                array[i] = array[k];
                i = k;
            }
        }
        array[i] = temp;
    }
}
