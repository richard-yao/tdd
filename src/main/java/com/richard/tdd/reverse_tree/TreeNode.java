package com.richard.tdd.reverse_tree;

import lombok.Data;

/**
 * @author apple
 * @date 2019-04-07 14:18
 */
@Data
public class TreeNode {

    /**
     * 叶子值
     */
    private int value;
    /**
     * 左叶子节点
     */
    public TreeNode left;
    /**
     * 右叶子节点
     */
    public TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}
