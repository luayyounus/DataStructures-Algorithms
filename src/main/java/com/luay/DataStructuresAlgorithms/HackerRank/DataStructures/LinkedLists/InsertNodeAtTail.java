package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists;

public class InsertNodeAtTail {
    class Node {
        int data;
        Node next;
    }

    Node Insert(Node head,int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) {
            head = newNode;
            return head;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }
}
