package com.richard.tdd.test.reverse_tree;

import com.richard.tdd.reverse_tree.ReverseTree;
import com.richard.tdd.reverse_tree.TreeNode;
import org.junit.Test;

/**
 * @author apple
 * @date 2019-04-07 13:30
 */
public class ReverseTreeTest {

    /**
     * 反转二叉树
     */
    @Test
    public void testReverseTree() {
        ReverseTree reverseTree = new ReverseTree();
        TreeNode treeNode = reverseTree.initTree(10);
        reverseTree.printTree(treeNode);
        reverseTree.reverseTree(treeNode);
        reverseTree.printTree(treeNode);
    }
}
