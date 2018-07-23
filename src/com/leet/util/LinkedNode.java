package com.leet.util;

public class LinkedNode {
    public int val;
    public LinkedNode next;
    public LinkedNode(int x) {
        val = x ;
    }

    public LinkedNode() {

    }

    @Override
    public String toString() {
        LinkedNode node = this;
        StringBuilder sb = new StringBuilder();
        if (this == null) return "";
        while (node != null) {
            sb.append(node.val+"—>");
            node = node.next;
        }
        return sb.toString();
    }
}
