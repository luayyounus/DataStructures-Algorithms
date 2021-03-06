package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists;

public class DeleteNodeAtPosition {
    public Node Delete(Node head, int position) {
        if (head == null) return head;
        if (position == 0) {
            head = head.next;
            return head;
        }

        Node current = head;
        Node prev = head;
        int counter = 0;
        while(current.next != null){
            counter++;
            current = current.next;
            if (counter == position){
                Node temp = current.next;
                current = null;
                prev.next = temp;
                return head;
            }
            prev = prev.next;
        }
        return head;
    }
}
