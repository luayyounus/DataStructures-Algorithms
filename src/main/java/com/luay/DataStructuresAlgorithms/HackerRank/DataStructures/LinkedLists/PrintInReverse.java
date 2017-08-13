package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists;

import java.util.LinkedList;
import java.util.Stack;

public class PrintInReverse {
    class Node {
        int data;
        Node next;
    }
    void ReversePrint(Node head) {
        Stack<Integer> reversedLL = new Stack<Integer>();

        if (head != null) {
            Node current = head;
            while(current != null){
                reversedLL.push(current.data);
                current = current.next;
            }
            while(!reversedLL.isEmpty()){
                System.out.println((reversedLL.pop()));
            }
        }
    }
}
