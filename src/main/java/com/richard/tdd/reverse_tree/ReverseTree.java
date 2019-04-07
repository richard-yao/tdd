package com.richard.tdd.reverse_tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

/**
 * @author apple
 * @date 2019-04-07 14:15
 */
public class ReverseTree {

    /**
     * 生成指定长度的二叉树
     * @param nodeLength
     * @return
     */
    public TreeNode initTree(int nodeLength) {
        TreeNode[] arrays = new TreeNode[nodeLength];
        IntStream.range(0, nodeLength).forEach(temp -> {
            arrays[temp] = new TreeNode(temp);
        });
        // 二叉树的根节点
        TreeNode tree = arrays[0];
        int lastParentNode = arrays.length / 2 - 1;
        IntStream.range(0, lastParentNode).forEach(temp -> {
            arrays[temp].left = arrays[2 * temp + 1];
            arrays[temp].right = arrays[2 * temp + 2];
        });
        // 最后一个非叶子节点的左叶子必定存在
        arrays[lastParentNode].left = arrays[2 * lastParentNode + 1];
        // 如果总节点数量为奇数则存在右叶子
        if(arrays.length % 2 == 1) {
            arrays[lastParentNode].right = arrays[2 * lastParentNode + 2];
        }
        return tree;
    }

    /**
     * 反转二叉树：左右叶子反转
     * @param root
     */
    public TreeNode reverseTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        reverseTree(root.left);
        reverseTree(root.right);
        return temp;
    }

    /**
     * 打印二叉树所有节点的值
     * @param root
     */
    public void printTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.getValue() + " ");
            if(temp.left != null) {
                queue.offer(temp.left);
            }
            if(temp.right != null) {
                queue.offer(temp.right);
            }
        }
        System.out.println();
    }
}
