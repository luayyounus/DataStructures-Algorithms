package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists;

public class InsertNodeAtHead {
    public Node Insert(Node head,int x) {
        Node newNode = new Node();
        newNode.data = x;
        if (head == null) {
            head = newNode;
            return head;
        }
        newNode.next = head;
        return newNode;
    }
}
