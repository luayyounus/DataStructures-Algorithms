package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists;

public class LinkedListPrint {
    class Node {
        int data;
        Node next;
    }
    void Print(Node head) {
        if (head == null) return;
        System.out.format("%d%n",head.data);
        Print(head.next);
    }
}
