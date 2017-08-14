package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.LinkedLists;

public class MergeTwoSortedLL {
    public Node mergeLists(Node headA, Node headB) {
        if (headA == null) return headB;
        if (headB == null) return headA;
        if(headA.data < headB.data){
            headA.next = mergeLists(headA.next, headB);
            return headA;
        }
        headB.next = mergeLists(headA,headB.next);
        return headB;
    }
}
