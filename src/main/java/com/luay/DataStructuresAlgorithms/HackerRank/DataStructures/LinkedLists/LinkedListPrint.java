package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists;

public class LinkedListPrint {
    public void Print(Node head) {
        if (head == null) return;
        System.out.format("%d%n",head.data);
        Print(head.next);
    }
}
