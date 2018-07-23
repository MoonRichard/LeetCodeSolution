package com.leet;

import com.leet.util.LinkedNode;
import com.leet.util.MyTest;
import com.leet.util.TreeNode;

public class ReverseLinkedList implements MyTest {
    public LinkedNode reverse(LinkedNode head) {
        LinkedNode newHead = null;
        if (head == null || head.next == null) {
            return head;
        }

        while (head != null) {
            LinkedNode tmp = head;
            newHead = tmp;
            head = head.next;
            tmp.next = newHead;
        }
        System.out.println("done");
        return newHead;
    }

    @Override
    public void test() {
        LinkedNode node = new LinkedNode(1);
        LinkedNode head = node;
        for(int i = 2; i<=5;i++){
            node.next = new LinkedNode(i);
            node = node.next;
        }
        System.out.println(reverse(head));
    }
}
