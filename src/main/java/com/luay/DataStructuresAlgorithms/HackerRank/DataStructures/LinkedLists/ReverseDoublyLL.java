package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists;

public class ReverseDoublyLL {
    public NodeDoubly Reverse(NodeDoubly head) {
        if(head == null || head.next == null) return head;
        NodeDoubly current = Reverse(head.next);
        head.next.next = head;
        head.prev = head.next;
        head.next = null;
        return current;
    }

}
