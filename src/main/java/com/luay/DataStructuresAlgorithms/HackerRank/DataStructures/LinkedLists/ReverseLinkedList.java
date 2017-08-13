package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists;

public class ReverseLinkedList {
    Node Reverse(Node head) {
        if(head==null || head.next==null) return head;
        Node current = Reverse(head.next);
        head.next.next = head;
        head.next = null;
        return current;
    }
}
