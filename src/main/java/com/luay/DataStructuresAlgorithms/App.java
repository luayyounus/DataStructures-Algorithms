package com.luay.DataStructuresAlgorithms;
import com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists.*;

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
        
    }
}
