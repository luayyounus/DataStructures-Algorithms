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
}


