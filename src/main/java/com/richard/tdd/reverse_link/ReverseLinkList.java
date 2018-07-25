package com.richard.tdd.reverse_link;

public class ReverseLinkList {

    public NodeObj initNodeLink(int nodeNum) {
        if(nodeNum <= 0) {
            return new NodeObj(0);
        } else {
            NodeObj headNode = null;
            NodeObj nextNode = null;
            for(int i = 1; i <= nodeNum; i++) {
                if(headNode == null) {
                    headNode = new NodeObj(i);
                } else {
                    NodeObj tempNode = new NodeObj(i);
                    if(headNode.next == null) {
                        headNode.next = tempNode;
                    } else {
                        nextNode.next = tempNode;
                    }
                    nextNode = tempNode;
                }
            }
            return headNode;
        }
    }

    /**
     * This method used to reverse one link
     * @param testLink
     * @return
     */
    public NodeObj reverseLink(NodeObj testLink) {
        if(testLink == null) {
            return null;
        } else {
            NodeObj newHead = null;
            NodeObj nextNode;
            for(NodeObj tempNode = testLink; tempNode != null; ) {
                if(newHead == null) {
                    newHead = tempNode;
                    nextNode = tempNode.next;
                    tempNode.next = null;
                } else {
                    nextNode = tempNode.next;
                    tempNode.next = newHead;
                    newHead = tempNode;
                }
                tempNode = nextNode;
            }
            return newHead;
        }
    }
}