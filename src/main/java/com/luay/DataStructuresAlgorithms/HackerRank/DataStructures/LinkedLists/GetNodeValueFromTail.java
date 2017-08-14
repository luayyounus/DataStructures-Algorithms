package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists;

import java.util.ArrayList;

public class GetNodeValueFromTail {
    //With an Array
    public int GetNode(Node head,int n) {
        ArrayList<Integer> linkedListArray = new ArrayList<Integer>();
        while(head != null){
            linkedListArray.add(head.data);
            head = head.next;
        }
        return linkedListArray.get(linkedListArray.size() -1 -n);
    }

    //With a second Pointer the calculates the distance between head and the pointer that is behind
    public int GetNodeWithoutArray(Node head, int n){
        int prevCounter = 0;
        Node prev = head;
        while(head.next != null){
            head = head.next;
            if(prevCounter < n){
                prevCounter++;
            } else {
                prev = prev.next;
            }
        }
        return prev.data;
    }
}


