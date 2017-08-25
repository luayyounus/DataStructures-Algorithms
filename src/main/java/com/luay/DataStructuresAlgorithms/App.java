package com.luay.DataStructuresAlgorithms;
import com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists.*;
import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Node headA = null;
        Node headB = null;

        InsertNodeAtTail insertNodeAtTail = new InsertNodeAtTail();
        headA = insertNodeAtTail.Insert(headA, 1);
        headA = insertNodeAtTail.Insert(headA, 3);
        headA = insertNodeAtTail.Insert(headA, 5);
        headA = insertNodeAtTail.Insert(headA, 6);

        headB = insertNodeAtTail.Insert(headB, 2);
        headB = insertNodeAtTail.Insert(headB, 4);
        headB = insertNodeAtTail.Insert(headB, 7);

        MergeTwoSortedLL mergeClass = new MergeTwoSortedLL();
        Node mergeSortedLists = mergeClass.mergeLists(headA, headB);

        LinkedListPrint printLL = new LinkedListPrint();
        printLL.Print(mergeSortedLists);

        System.out.println("Reversed");

        ReverseLinkedList reverse = new ReverseLinkedList();
        Node reversedLL = reverse.Reverse(mergeSortedLists);
        printLL.Print(reversedLL);
    }
}
