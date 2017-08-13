package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists;

public class InsertNodeAtPosition {
    class Node {
        int data;
        Node next;
    }
    Node InsertNth(Node head, int data, int position) {
        if (position < 0) return head;

        Node nodeToInsert = new Node();
        nodeToInsert.data = data;

        if(head == null){
            return nodeToInsert;
        }
        if (position == 0){
            nodeToInsert.next = head;
            return nodeToInsert;
        }

        int counter = 0;
        Node current = head;

        while(current.next != null){
            counter++;
            if (counter == position){
                Node temp = current.next;
                current.next = nodeToInsert;
                nodeToInsert.next = temp;
                return head;
            }
            current = current.next;
        }
        return head;
    }
}
