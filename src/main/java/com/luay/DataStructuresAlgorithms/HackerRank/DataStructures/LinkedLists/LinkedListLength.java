package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists;

public class LinkedListLength {
    public int linkedListLength(Node head) {
        return head.next != null ? 1 + linkedListLength(head.next) : 1;
    }
}
