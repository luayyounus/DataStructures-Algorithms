package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicated {
    // Iteration
    Node RemoveDuplicates(Node head) {
        if (head == null || head.next == null) return head;
        Node current = head;
        while(current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    // Recursion
    Node RemoveDuplicatesRecursion(Node head) {
        if (head == null || head.next == null) return head;
        if(head.data == head.next.data){
            head = RemoveDuplicatesRecursion(head.next);
            return head;
        } else {
            head.next = RemoveDuplicatesRecursion(head.next);
            return head;
        }
    }
}
